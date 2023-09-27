package P9_1;
import java.util.Random;

public class tester {
    public void test(){
        Random rd = new Random();
        Student[] arr = new Student[10];
        for(int i = 0; i < 10; i++){
            arr[i] = new Student(rd.nextInt(0,12421));
        }


        int n = 10;
        for (int i = 1; i < n; i++){

            for (int j = i; j >= 1 && arr[j-1].compareTo(arr[j]) >= 1; j--){
                Student t = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = t;

            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i].getId());
        }
    }
}
