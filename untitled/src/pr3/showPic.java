package pr3;

import javax.swing.*;
import java.awt.*;

public class showPic  {
    public showPic(String[] args){
        String path = args[0];
        JFrame jfr = new JFrame();
        jfr.setSize(800, 800);
        ImageIcon ic = new ImageIcon(path);
        JLabel img = new JLabel(ic);
        jfr.add(img, BorderLayout.CENTER);
        System.out.println(path);
        jfr.pack();
        jfr.setVisible(true);
    }
}
