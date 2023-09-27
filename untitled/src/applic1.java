import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class applic1 extends JFrame implements ActionListener {
    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel scoreLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public applic1() {
        setSize(190, 190);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton milanButton = new JButton("AC Milan");
        milanButton.addActionListener(this);

        JButton madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(this);

        scoreLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N / A");
        winnerLabel = new JLabel("Winner: DRAW");

        this.add(milanButton);
        this.add(madridButton);
        this.add(scoreLabel);
        this.add(lastScorerLabel);
        this.add(winnerLabel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("AC Milan")) {
            milanScore++;
            lastScorerLabel.setText("Last Scorer: AC Milan");
        } else if (e.getActionCommand().equals("Real Madrid")) {
            madridScore++;
            lastScorerLabel.setText("Last Scorer: Real Madrid");
        }

        scoreLabel.setText("Result: " + milanScore + " X " + madridScore);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

}