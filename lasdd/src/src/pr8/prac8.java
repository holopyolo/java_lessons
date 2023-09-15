package src.pr8;
import java.util.Scanner;
public class prac8 {
    public void test(){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String []arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = inp.next();
        }
        for(int i = 0; i < n / 2; i++){
            String temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        for(int i = 0; i < n; i++){
            System.out.printf("%s ", arr[i]);
        }

    }
}
