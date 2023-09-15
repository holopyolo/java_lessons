package src.pr2MATH;
import src.pr7.Book;

import java.util.*;

public class Tester {
    private ArrayList<Circle>circles = new ArrayList<Circle>();
    private int len = 0;
    public void add(Circle circ){
        this.circles.add(circ);
        this.len += 1;
    }
    public void delete(Circle circ){
        this.circles.remove(circ);
        this.len -= 1;
    }
    public Circle findMax(){
        Circle circANS = new Circle(new Point(0,0),0);
        double mx = Double.MIN_VALUE;
        for (Circle c : this.circles){
            if(c.getRadius() > mx){
                mx = c.getRadius();
                circANS = c;
            }
        }
        return circANS;
    }
    public Circle findMin(){
        Circle circANS = new Circle(new Point(0,0),0);
        double mx = Double.MAX_VALUE;
        for (Circle c : this.circles){
            if(c.getRadius() < mx){
                mx = c.getRadius();
                circANS = c;
            }
        }
        return circANS;
    }
    public void sorting(){
        this.circles.sort(Comparator.comparing(Circle::getRadius));
    }

}
