package src.pr7;
import java.util.ArrayList;
import java.util.Comparator;

public class bookShelf {
    private ArrayList<Book> arr = new ArrayList<Book>();
    private int len = 0;

    public void addBook(Book bk){
        arr.add(bk);
    }
    public ArrayList<Book> returnEarlyPub(){
        int mnPub = Integer.MAX_VALUE;
        for(Book book : arr){
            if(book.getYearPub() < mnPub){
                mnPub = book.getYearPub();
            }
        }
        ArrayList<Book> ans = new ArrayList<Book>();
        for(Book book : arr){
            if(book.getYearPub() == mnPub){
                ans.add(book);
            }
        }
        return ans;
    }
    public ArrayList<Book> returnLatePub(){
        int mxPub = Integer.MIN_VALUE;
        for(Book book : arr){
            if(book.getYearPub() > mxPub){
                mxPub = book.getYearPub();
            }
        }
        ArrayList<Book> ans = new ArrayList<Book>();
        for(Book book : arr){
            if(book.getYearPub() == mxPub){
                ans.add(book);
            }
        }
        return ans;
    }

    public ArrayList SortDatePub(){
        arr.sort(Comparator.comparing(Book::getYearPub));
        return arr;
    }

}
