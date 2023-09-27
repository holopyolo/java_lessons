package pr3;

import pr3.Point;

public class Circle {
	private Point center;
	private double R = 0;
	
	public Circle(Point p, double R){
		this.center = p;
		this.R = R;
	}

	public double getR() {
		return R;
	}

	public void setR(double r) {
		R = r;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
}
