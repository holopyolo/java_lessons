package src.pr2MATH;

public class Circle {
    private Point center;
    private double radius = 0;
    public Circle(Point cen, double radius){
        this.center = cen;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
