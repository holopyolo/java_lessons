package src.mathPR1;
import java.util.*;
public class prac1 {
    public void print(ArrayList<Float> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.printf("%d: %f\n", i+1, arr.get(i));
        }
        System.out.println("\n");
    }
    public void testing(){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        ArrayList<Float>arr = new ArrayList<Float>();
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            arr.add(rand.nextFloat());
        }
        Collections.sort(arr);
        print(arr);
        arr.clear();
        for(int i = 0; i < n; i++){
            arr.add((float) Math.random());
        }
        Collections.sort(arr);
        print(arr);
    }
}
