public class Square extends Rectangle{
    public Square(double a){
        super(a, a);
    }
    public Square(double a, String color, boolean filled){
        super(a, a, color, filled);
    }
    @Override
    double getArea() {
        return getA() * getA();
    }

    @Override
    double getPerim() {
        return 4 * getA();
    }

    @Override
    public String toString() {
        return "Square";
    }

    public double getSide(){
        return getA();
    }
    public void setSide(double a){
        setA(a);
    }
}
