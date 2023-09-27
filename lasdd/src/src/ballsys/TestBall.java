package src.ballsys;
import src.ballsys.ball;
import java.util.Scanner;

public class TestBall {
	public boolean test() {
		Scanner consoleInp = new Scanner(System.in);
		System.out.println("Ввод начальных координат");
		double x = consoleInp.nextDouble();
		double y = consoleInp.nextDouble();
		ball newball = new ball(x, y);
		while(x != 0 | x != y) {
			System.out.println("Ввод расстояния до точки(x = y = 0-> exit)");
			x = consoleInp.nextDouble();
			y = consoleInp.nextDouble();
			newball.move(x, y);
			System.out.println("новые коорд: ");
			System.out.printf("x: %f\ny: %f\n", newball.getX(), newball.getY());
		}
		return true;
		
	}
}
