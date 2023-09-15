package pr5MATH;
import java.util.*;
public class Praca5 {
    public void testing(){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int n = -1;
        while(n <= 0){
            n = scan.nextInt();
        }
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = rand.nextInt(0, n);
            System.out.printf("%d : %d\n", i+1, arr[i]);
        }
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        System.out.println("---");
        for(int i = 0; i < n; i++){
            if((arr[i] % 2 == 0)){
                arr2.add(arr[i]);
            }
        }
        for(int i = 0; i < arr2.size(); i++){
            System.out.printf("%d : %d\n",i+1, arr2.get(i));
        }
    }
}
