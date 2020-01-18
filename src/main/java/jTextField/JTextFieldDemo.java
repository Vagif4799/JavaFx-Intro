package jTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo implements ActionListener {

    JTextField textField;
    JButton button;
    JLabel label;
    JLabel label2;

    public JTextFieldDemo() {

        JFrame jFrame = new JFrame();
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(250, 125);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);


        textField = new JTextField(10);
        textField.setActionCommand("TextField");
        button = new JButton("Reverse");
        label = new JLabel("");
        label2 = new JLabel("");
        button.addActionListener(this);
        textField.addActionListener(this);



        jFrame.add(textField);
        jFrame.add(button);
        jFrame.add(label);
        jFrame.add(label2);


        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Reverse")) {
            label.setText(textField.getText());
            String reversed = "";
            for (int i=textField.getText().length()-1; i>=0; i--) {
                reversed += textField.getText().charAt(i);
            }
            label2.setText(reversed);
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTextFieldDemo();
            }
        });

    }


}
