public class Circle extends Shape{
    private double R;
    static final double pi = 3.14;

    public Circle(double R, boolean filled, String color){
        super(color, filled);
        this.R = R;
    }
    public Circle(double R){
        this.R = R;
    }
    @Override
    double getPerim() {
        return pi * R * 2;
    }

    @Override
    double getArea() {
        return pi * R * R;
    }

    @Override
    public String toString() {
        return "circle";
    }

    public double getR(){
        return R;
    }
    public void setR(double R){
        this.R = R;
    }
}
