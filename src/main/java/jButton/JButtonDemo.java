package jButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo implements ActionListener {

    JLabel jLabel;

    public JButtonDemo() {

        JFrame jFrame = new JFrame("Vagif's Button View");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(300, 600);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        jLabel = new JLabel("Press Button");
        jFrame.add(jLabel);

        JButton up = new JButton("up");
        JButton down = new JButton("down");
        up.addActionListener(this);
        down.addActionListener(this);
        jFrame.add(up);
        jFrame.add(down);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JButtonDemo();
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("up")) {
            jLabel.setText("Up Button Pressed");
        } else {
            jLabel.setText("Down Button Pressed");
        }

    }
}
