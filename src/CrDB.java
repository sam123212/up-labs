import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CrDB {
    static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    static String connect = "jdbc:derby:VideotekaDB;create=true";

    public static void main(String[] args) {

        System.setProperty("derby.system.home", "C:\\Videoteka" );

        try {
            Class.forName( driver );
            Connection conn = DriverManager.getConnection(connect);
            Statement st = conn.createStatement();
            st.executeUpdate("CREATE TABLE MyVideotekaFirst1 " +
                    "(idx VARCHAR(32) PRIMARY KEY, zanr VARCHAR(32), discription VARCHAR(32))");
            //st.executeUpdate("DROP TABLE MyVideotekaFirst");
            st.close();

        } catch (Exception e) {
            System.err.println("Run-time error1: " + e );
        }
        try {
            Class.forName( driver );
            Connection conn = DriverManager.getConnection(connect);
            Statement st = conn.createStatement();
            st.executeUpdate("CREATE TABLE MyVideotekaSecond1 " +
                    "(idx VARCHAR(32) REFERENCES MyVideotekaFirst1 (idx), countSeries INT, mainActor VARCHAR(32) )");
            //st.executeUpdate("DROP TABLE MyVideotekaSecond");
            st.close();

        } catch (Exception e) {
            System.err.println("Run-time error2: " + e );
        }
    }
}
