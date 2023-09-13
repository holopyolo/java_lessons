package ballsys;

public class ball {
	private double x = 0.0;
	private double y = 0.0;
	
	public ball(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	public ball() {
		
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void move(double xDisp, double yDisp) {
		this.x += xDisp;
		this.y += yDisp;
	}
	public String toString() {
		return "x: " + this.x + "\ny: " + this.y;
	}
	
}
