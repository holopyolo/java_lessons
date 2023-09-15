package src.pr7;
import java.util.ArrayList;
import java.util.Scanner;
public class booktest {
    public void testing(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        bookShelf shelf = new bookShelf();
        for(int i = 0; i < n; i++){
            String name, author;
            int yearpb;
            name = scan.next();
            author = scan.next();
            yearpb = scan.nextInt();
            shelf.addBook(new Book(name, author, yearpb));
        }
        ArrayList<Book> earlyBooks = shelf.returnEarlyPub();
        ArrayList<Book> lateBooks = shelf.returnLatePub();
        for(Book bk : earlyBooks){
            System.out.printf("name: %s\nauthor: %s\nyear: %d\n\n", bk.getName(), bk.getAuthor(), bk.getYearPub());
        }
        for(Book bk : lateBooks){
            System.out.printf("name: %s\nauthor: %s\nyear: %d\n\n", bk.getName(), bk.getAuthor(), bk.getYearPub());
        }
        ArrayList<Book> arr = shelf.SortDatePub();
        System.out.printf("After sorting: \n");
        for(Book bk : arr){
            System.out.printf("%s: %d\n", bk.getName(), bk.getYearPub());
        }
    }
}
