public class Book {

    private String Name;
    private String NameAuthor;
    private int ReleaseYear;

    private String DevolutionDate;
    private double Price;

    private String Id;//PK

    public Book(){

    }

    public Book(String Name, String NameAuthor, int ReleaseYear, String DevolutionDate, double Price, String Id){ // Method
        this.Name = Name;
        this.NameAuthor = NameAuthor;
        this.ReleaseYear = ReleaseYear;
        this.DevolutionDate = DevolutionDate;
        this.Price = Price;
        this.Id = Id;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getNameAuthor(){
        return NameAuthor;
    }
    public void setNameAuthor(String NameAuthor){
        this.NameAuthor = NameAuthor;
    }
    public int getReleaseYear(){
        return ReleaseYear;
    }
    public void setReleaseYear(int ReleaseYear){
        this.ReleaseYear = ReleaseYear;
    }

    public String getDevolutionDate(){
        return DevolutionDate;
    }
    public void setDevolutionDate(String DevolutionDate){
        this.DevolutionDate = DevolutionDate;
    }

    public double getPrice(){
        return Price;
    }

    public void setPrice(double Price){
        this.Price = Price;

    }

    public String getId(){
        return Id;
    }

}
