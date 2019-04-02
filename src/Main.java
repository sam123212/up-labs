import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;
import javax.swing.JOptionPane;

public class Main extends Application{
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    private TableView<VidFirst> recipesTable = new TableView<>();
    private TableView<VidSecond> typesTable = new TableView<>();

    private final HBox addBox = new HBox(15);
    private final HBox addBox1 = new HBox(15);

    private static ObservableList<VidFirst> videotekaData = FXCollections.observableArrayList();
    private static ObservableList<VidSecond> videotekaSecondData = FXCollections.observableArrayList();
    public static void main(String[] args) {
        connectionDB();
        launch(args);
        closeConnectionDB();
    }
    private static void connectionDB() {
        try 
        {
            String driver = "org.apache.derby.jdbc.EmbeddedDriver";
            String connect = "jdbc:derby:VideotekaDB";
            System.setProperty("derby.system.home", "C:\\Videoteka" );
            connection = null;
            Class.forName(driver);
            connection = DriverManager.getConnection(connect);

            statement = connection.createStatement();
            String selectSQL = "SELECT * FROM MyVideotekaFirst1";
            resultSet = statement.executeQuery(selectSQL);

            while (resultSet.next()) 
            {
                VidFirst recipe = new VidFirst(resultSet.getString("Name"),
                        resultSet.getString("Genre"),
                        resultSet.getString("Year"));
                System.out.println( " Name: " + recipe.getName() + " Genre: " + recipe.getGenre() +
                        " Year: " + recipe.getYear() );
                videotekaData.add(recipe);
            }

            selectSQL = "SELECT * FROM MyVideotekaSecond1";
            resultSet = statement.executeQuery(selectSQL);

            while (resultSet.next())
            {
                VidSecond videotekaType = new VidSecond(
                        resultSet.getString("Name"),
                        resultSet.getString("Num_of_Series"),
                        resultSet.getString("Director")
                );
                System.out.println( " Name: " + videotekaType.getName() + " Year: " + videotekaType.getNum_of_Series() +
                        " Director: " + videotekaType.getDirector() );
                videotekaSecondData.add(videotekaType);
            }
        }
        catch (Exception e) 
        {
            System.err.println(e.getMessage());
        }
    }
    private static void closeConnectionDB() {
        try 
        {
            resultSet.close();
            connection.close();
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new Group());
        primaryStage.setTitle("Videoteka office");

        createVideotekaTable();
        createTypesTable();
        createAddBox();
        VBox allBox = new VBox(10);
        allBox.setPadding(new Insets(10, 10, 10, 10));
        allBox.getChildren().addAll(new Label("Videoteka"), recipesTable, addBox,addBox1, typesTable);

        ((Group) scene.getRoot()).getChildren().addAll(allBox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void createVideotekaTable() 
    {
        TableColumn<VidFirst, String> nameColumn = new TableColumn<>("Name");
        TableColumn<VidFirst, String> ingredientsColumn = new TableColumn<>("Genre");
        TableColumn<VidFirst, String> complexityColumn = new TableColumn<>("Year");

        setRecipeColumnValues(nameColumn, 300, "Name");
        setRecipeColumnValues(ingredientsColumn, 150, "Genre");
        setRecipeColumnValues(complexityColumn, 300, "Year");
        recipesTable.setItems(videotekaData);
        recipesTable.getColumns().addAll(nameColumn, ingredientsColumn, complexityColumn);
        recipesTable.setMaxHeight(300);
    }
    private void setRecipeColumnValues(TableColumn<VidFirst, String> column, int width, String sqlName) {
        column.setPrefWidth(width);
        column.setCellValueFactory(param -> param.getValue().getFieldBySQL(sqlName));
    }
    private void createTypesTable() {
        TableColumn<VidSecond, String> typeColumn = new TableColumn<>("Name");
        TableColumn<VidSecond, String> idColumn = new TableColumn<>("Number_of_Series");
        TableColumn<VidSecond, String> DescriptionColumn = new TableColumn<>("Director");

        setTypeColumnValues(typeColumn, 300, "Name");
        setTypeColumnValues(idColumn, 200, "Num_of_Series");
        setTypeColumnValues(DescriptionColumn, 250, "Director");

        typesTable.setItems(videotekaSecondData);
        typesTable.getColumns().addAll(typeColumn,idColumn, DescriptionColumn);
        typesTable.setMaxHeight(200);
    }
    private void setTypeColumnValues(TableColumn<VidSecond, String> column, int width, String sqlName) {
        column.setPrefWidth(width);
        column.setCellValueFactory(param -> param.getValue().getFieldBySQL(sqlName));
    }
    private void createAddBox() {
        final TextField addedName = new TextField();
        addedName.setMaxWidth(200);
        addedName.setPromptText("Name");

        final TextField addedNum = new TextField();
        addedNum.setMaxWidth(200);
        addedNum.setPromptText("Num_of_Series");

        final TextField addedDir = new TextField();
        addedDir.setMaxWidth(200);
        addedDir.setPromptText("Director");

        final TextField addedGenre = new TextField();
        addedGenre.setMaxWidth(200);
        addedGenre.setPromptText("Genre");

        final TextField addedYear = new TextField();
        addedYear.setMaxWidth(200);
        addedYear.setPromptText("Year");

        final Button addDescriptionButton = new Button("Add new object");
        addDescriptionButton.setOnAction((ActionEvent e) -> 
        {
            String Name = addedName.getText();
            String Num_of_Series = addedNum.getText();
            String Director = addedDir.getText();

            String Genre = addedGenre.getText();
            String Year = addedYear.getText();

            boolean flag = false;

            try 
            {
                VidFirst recipe = new VidFirst(Name, Genre, Year);

                if(!nameExist(Name)) {
                    flag = true;
                    videotekaData.add(recipe);
                    addRecipeToDatabase(Name, Genre, Year);
                }
                addedName.clear();
                addedGenre.clear();
                addedYear.clear();

            } 
            
            catch (Exception exc) 
            {
                JOptionPane.showMessageDialog(null, exc,"Error", JOptionPane.ERROR_MESSAGE);             
            }

            try 
            {
                VidSecond recipe = new VidSecond(Name, Num_of_Series, Director);
                if (typeExists(Name)&&!strokeExist(recipe)&&flag) 
                {
                    addTypeToDataBase(recipe);
                    videotekaSecondData.add(recipe);
                }
                addedName.clear();
                addedNum.clear();
                addedDir.clear();

            } 
            
            catch (Exception exc) 
            {
             JOptionPane.showMessageDialog(null, exc,"Error", JOptionPane.ERROR_MESSAGE);   
            }
        });
        addBox1.getChildren().addAll(addedName, addedNum, addedDir,addDescriptionButton);
        addBox.getChildren().addAll(addedName, addedGenre, addedYear,addDescriptionButton);
    }

    private boolean strokeExist(VidSecond recipe) 
    {
        for(VidSecond item: videotekaSecondData)
        {
            if(item.getName().equals(recipe.getName())&&item.getNum_of_Series().equals(recipe.getNum_of_Series())&&item.getDirector().equals(recipe.getDirector()))
                return true;
        }
        return false;
    }


    private boolean nameExist(String Name) 
    {
        for(VidFirst item: videotekaData)
        {
            if(item.getName().equals(Name))
                return true;
        }
        return false;
    }

    private boolean typeExists(String newType) 
    {
        for (VidFirst dishType : videotekaData) 
        {
            if (dishType.getName().equals(newType))
            {
                return true;
            }
        }
        return false;
    }
  

    private void addTypeToDataBase(VidSecond newType) 
    {
        String sql = "INSERT INTO MyVideotekaSecond1(Name, Num_of_Series, Main_Actor) VALUES(?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql))
        {
            statement.setString(1, newType.getName());
            statement.setInt(2, Integer.parseInt(newType.getNum_of_Series()));
            statement.setString(3, newType.getDirector());
            statement.executeUpdate();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    private void addRecipeToDatabase(String name, String ingredients, String type)
    {
        String sql = "INSERT INTO MyVideotekaFirst1 (Name, Genre, Description) VALUES(?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql))
        {
            statement.setString(1, name);
            
            statement.setString(2, ingredients);
            statement.setString(3, type);
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}

