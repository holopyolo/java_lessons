package src.pr6;

public class Circle {
    private static final double pi = 3.14;
    private double radius = 0;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getSquare(){
        return pi * this.radius * this.radius;
    }
    public double getPerim(){
        return pi * this.radius * 2;
    }
    public String CompareInfo(Circle circ){
        if(this.radius >= circ.radius){
            return "First bigger or equal\n";
        }
        else{
            return "second circ bigger\n";
        }
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
