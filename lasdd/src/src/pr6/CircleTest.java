package src.pr6;
import src.pr6.Circle;
import java.util.Scanner;
public class CircleTest {
    public void testing(){
        Scanner scan = new Scanner(System.in);
        double r1 = scan.nextDouble();
        double r2 = scan.nextDouble();
        Circle firstCirc = new Circle(r1);
        Circle secondCirc = new Circle(r2);
        System.out.println("circles info: \n" + firstCirc.CompareInfo(secondCirc));
    }
}
