package pr3;

import pr3.Point;

public class Circle {
	private Point center;
	private double R = 0;
	
	Circle(double xCenter, double yCenter, double R){
		this.center = new Point(xCenter, yCenter);
		this.R = R;
	}
	
}
