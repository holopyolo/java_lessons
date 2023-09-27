package pr2;

import java.awt.*;

abstract class shape {
    public Color color;
    public int x;
    public int y;
    public shape(Color color, int x, int y){
        this.x = x;
        this.y = y;
        this.color = color;
    }

}
