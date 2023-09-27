package pr4;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class anims {
    public void test(String[] args) {
        String path = args[0];
        JFrame jfr = new JFrame();
        jfr.setSize(1000, 1000);
        JLabel img = new JLabel();
        jfr.add(img, BorderLayout.CENTER);
        while (true){
            for (int i = 0; i < 30; i++){
                ImageIcon ic = new ImageIcon(path + "frame_" + String.valueOf(i) + "_delay-0.05s.jpg");
                img.setIcon(ic);
                jfr.repaint();
                jfr.setVisible(true);
                jfr.pack();
                try{Thread.sleep(144);}
                catch (InterruptedException e) {return;}
            }
        }

    }
}
