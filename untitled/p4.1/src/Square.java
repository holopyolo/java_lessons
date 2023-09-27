public class Square extends Shape {
    private float a;

    public Square(float a) {
        this.a = a;
    }

    @Override
    String getType() {
        return "Квадрат\n";
    }

    @Override
    float getSquare() {
        return a * a;
    }

    @Override
    float getPerim() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return "square";
    }
}
