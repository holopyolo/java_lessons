public class Circle extends Shape{
    private float R;
    static final float pi = (float)3.14;

    public Circle(float R){
        this.R = R;
    }
    @Override
    String getType() {
        return "Круг\n";
    }

    @Override
    float getPerim() {
        return 2 * pi * this.R;
    }

    @Override
    float getSquare() {
        return pi * R * R;
    }

    @Override
    public String toString() {
        return "circle";
    }
}
