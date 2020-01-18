package jFrame;
import javax.swing.*;

public class Application {

    public Application() {

        JFrame jFrame = new JFrame("Vagif's First Swing App");
        jFrame.setSize(275, 100);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Vagif Says Hello... :)");
        jFrame.add(jLabel);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Application();
            }
        });

    }

}
