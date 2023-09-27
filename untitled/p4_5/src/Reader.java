import java.util.*;
public class Reader {
    private String fio;
    private String numBilet;
    private String faculty;
    private String birthday;
    private String phone;

    public Reader(String fio, String numBilet, String faculty, String birthday, String phone){
        this.fio = fio;
        this.numBilet = numBilet;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }
    private List<book> books;

    public void takeBook(int n){
        Scanner scan = new Scanner(System.in);
        System.out.println("Взял");
        for (int i = 0; i < n; i++){
            String name = scan.next();
            String author = scan.next();
            books.add(new book(name, author));
            System.out.printf("name: %s\tauthor: %s\n", name, author);
        }
    }

    public void takeBook(ArrayList<book> books){
        this.books.addAll(books);
        System.out.println("Взял");
        for(book bk : books){
            System.out.printf("name: %s \tauthor:  %s", bk.getName(), bk.getAuthor());
        }
    }

    public void returnBook(int n){
        System.out.println("Отдал");
        for(int i = 0;books.size() > 0 & i < n ; i++){
            System.out.printf("name: %s \tauthor:  %s\n", books.get(0).getName(), books.get(0).getAuthor());
        }
    }

    public void returnBook(List<book> books){
        System.out.println("Отдал");
        for(int i = 0; i < books.size(); i++){
            if(this.books.contains(books.get(i))){
                this.books.remove(books.get(i));
            }
        }
    }
    public void takeBook(){

    }
    public void returnBook(){

    }
}
