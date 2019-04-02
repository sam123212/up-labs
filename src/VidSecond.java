import javafx.beans.property.SimpleStringProperty;

public class VidSecond {
    private SimpleStringProperty Name;
    private SimpleStringProperty Num_of_Series;
    private SimpleStringProperty Director;
    VidSecond(String Name,String Num_of_Series,String Director) throws Exception{
        if(Name==null||Name.isEmpty()){
            throw new Exception("Field 'Name' is empty");
        }
        if(Num_of_Series==null||Num_of_Series.isEmpty()){
            throw new Exception("Field 'Num_of_Series' is empty");
        }
        if(Director==null || Director.isEmpty()){
            throw new Exception("Field 'Director' is empty");
        }
        this.Name= new SimpleStringProperty(Name);
        this.Num_of_Series= new SimpleStringProperty(Num_of_Series);
        this.Director= new SimpleStringProperty(Director);
    }
    SimpleStringProperty getFieldBySQL(String sqlName) {
        SimpleStringProperty res;
        switch (sqlName) {
            case "Name":
                res = this.Name;
                break;
            case "Director":
                res = this.Director;
                break;
            case "Num_of_Series":
                res = this.Num_of_Series;
                break;
            default:
                res = null;
        }
        return res;
    }
    public String getName(){ return Name.get();}
    public SimpleStringProperty NameProperty(){return Num_of_Series;}

    public String getDirector(){ return Director.get();}
    public SimpleStringProperty DirectorProperty(){return Director;}

    public String getNum_of_Series(){ return Num_of_Series.get();}
    public SimpleStringProperty Num_of_SeriesProperty(){return Num_of_Series;}
}

