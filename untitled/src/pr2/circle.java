package pr2;
import java.awt.*;
public class circle extends shape{
    public int R;
    circle(int r, Color color, int x, int y){
        super(color, x, y);
        this.R = r;
    }

    @Override
    public String toString() {
        return "circle";
    }

    int getR(){
        return R;
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
