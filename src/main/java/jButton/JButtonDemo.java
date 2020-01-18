package jButton;
import javax.swing.*;
import java.awt.*;

public class JButtonDemo {

    public JButtonDemo() {

        JFrame jFrame = new JFrame("Vagif'f Button View");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(300, 600);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("First Page");
        jFrame.add(jLabel);

        JButton up = new JButton("up");
        JButton down = new JButton("down");
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

}
