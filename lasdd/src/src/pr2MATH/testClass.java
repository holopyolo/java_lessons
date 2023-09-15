package src.pr2MATH;
import java.util.*;
public class testClass {
    public void testing(){
        Tester test = new Tester();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0 ; i < n; i++){
            test.add(new Circle(new Point(Math.random(), Math.random()), Math.random()));
        }
        test.sorting();
        System.out.printf("max (RAD): %f\n",test.findMax().getRadius());
        System.out.printf("min (RAD): %f\n", test.findMin().getRadius());
    }
}
