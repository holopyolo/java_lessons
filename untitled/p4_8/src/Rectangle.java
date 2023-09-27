public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(){}
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public Rectangle(double a, double b, String color, boolean filled){
        super(color, filled);
        this.a = a;
        this.b = b;
    }
    @Override
    double getArea() {
        return a * b;
    }

    @Override
    double getPerim() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
