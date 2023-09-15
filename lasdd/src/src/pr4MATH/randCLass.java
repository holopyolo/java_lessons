package src.pr4MATH;

import java.util.Random;

public class randCLass {
    public void testing(){
        Random rand = new Random();
        int[] arr = new int[4];
        for(int i = 0; i < 4; ++i){
            arr[i] = rand.nextInt(10,100);
            System.out.println(arr[i]);
        }
        for(int i = 1; i < 4; i++){
            if(arr[i] < arr[i-1]){
                System.out.println("Not acsen.");
                break;
            }
        }
    }
}
