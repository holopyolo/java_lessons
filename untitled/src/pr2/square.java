package pr2;
import java.awt.*;
public class square extends shape{
    public int a;
    square(Color color, int x, int y, int a){
        super(color, x, y);
        this.a = a;
    }

    @Override
    public String toString() {
        return "square";
    }

    int getA(){
        return a;
    }
    Color getColor(){
        return color;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}
