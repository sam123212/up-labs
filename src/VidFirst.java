import javafx.beans.property.SimpleStringProperty;

public class VidFirst {
    private SimpleStringProperty Name;
    private SimpleStringProperty Genre;
    private SimpleStringProperty Year;
    VidFirst(String Name,String Genre,String Year) throws Exception{
        if(Name == null || Name.isEmpty()){
            throw new Exception("Field \"Name\" is incorrect");
        }
        if(Genre == null || Genre.isEmpty()){
            throw new Exception("Field \"Genre\" is incorrect");
        }
        if(Year == null || Year.isEmpty()){
            throw new Exception("Field \"Year\" is incorrect");
        }
        this.Name = new SimpleStringProperty(Name);
        this.Genre = new SimpleStringProperty(Genre);
        this.Year = new SimpleStringProperty(Year);
    }
    SimpleStringProperty getFieldBySQL(String sqlName) {
        SimpleStringProperty res;
        switch (sqlName) {
            case "Name":
                res = this.Name;
                break;
            case "Year":
                res = this.Year;
                break;
            case "Genre":
                res = this.Genre;
                break;
            default:
                res = null;
        }
        return res;
    }
    public String getName(){ return Name.get();}
    public SimpleStringProperty NameProperty(){return Name;}

    public String getGenre(){ return Genre.get();}
    public SimpleStringProperty GenreProperty(){return Genre;}

    public String getYear(){ return Year.get();}
    public SimpleStringProperty YearProperty(){return Year;}

}

