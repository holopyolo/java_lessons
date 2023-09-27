package pr2;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
public class rand extends JFrame{


    public void paint(Graphics graph){
        super.paint(graph);

        Map<Integer, Color>hs = Map.of(
                0, Color.BLACK,
                1, Color.GREEN,
                2, Color.BLUE,
                3, Color.CYAN
        );

        Random randos = new Random();
        for(int i = 0; i < 20; i++){
            int randomFigure = randos.nextInt(2);
            int randomColor = randos.nextInt(4);
            switch (randomFigure){
                case 0:
                    circle circ = new circle(
                            randos.nextInt(10, 30),
                            hs.get(randomColor),
                            randos.nextInt(20, 170),
                            randos.nextInt(20, 170));
                    graph.setColor(circ.getColor());
                    graph.fillOval(circ.getX(), circ.getY(), 2 * circ.getR(), 2 * circ.getR());
                    break;
                case 1:
                    square sq = new square(
                            hs.get(randomColor),
                            randos.nextInt(20, 170),
                            randos.nextInt(20, 170),
                            randos.nextInt(13, 33));
                    graph.setColor(sq.getColor());
                    graph.fillRect(sq.getX(), sq.getY(),  sq.getA(), sq.getA());
            }
        }


    }
    public rand(){
        setSize(190, 190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
