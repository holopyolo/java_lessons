package src.pr7;

public class Book {
    private String author = "";
    private String name = "";
    private int yearPub = -1;

    public Book(String name, String author, int yearPub){
        this.name = name;
        this.author = author;
        this.yearPub = yearPub;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearPub() {
        return yearPub;
    }

    public void setYearPub(int yearPub) {
        this.yearPub = yearPub;
    }
}
