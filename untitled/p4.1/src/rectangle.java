
public class rectangle extends Shape {
    private float a;
    private float b;

    public rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    String getType() {
        return "Прямоугольник\n";
    }

    @Override
    float getSquare() {
        return (a * b);
    }

    @Override
    float getPerim() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
