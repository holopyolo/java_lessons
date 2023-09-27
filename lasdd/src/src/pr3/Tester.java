package src.pr3;
import java.util.*;
import pr3.Circle;
import pr3.Point;

public class Tester {
	private int len = 0;
	private ArrayList<Circle> arr;
	public Tester(){
		arr = new ArrayList<Circle>();
	}
	public Tester(int len) {
		this.len = len;
		add();
	}
	public void add(){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		arr.add(new Circle(new Point(x,y), r));
	}
}
