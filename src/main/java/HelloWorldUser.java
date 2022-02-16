// List any classmates you talked to about this
// assignment (if any):
//
//
// List any outside sources you looked at (if any):
//
//

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldUser {

    public static void main(String[] args) {
        // 1. Create the frame.
        JFrame frame = new JFrame("Hello World");
        frame.setLayout(new FlowLayout());

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame.
        JLabel label1 = new JLabel("Please Type your Name: ");
        frame.add(label1);

        JTextField field1 = new JTextField(10);
        frame.add(field1);

        JButton button1 = new JButton("Click Here!");
        frame.add(button1);

        JTextField field2 = new JTextField(10);
        frame.add(field2);

        // When the button is clicked, it will set the value of
        // field2 based on the name the user typed into field1
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                field2.setText("Hi, " + field1.getText() + "!");
            }
        });

        // 4. Size the frame.
        frame.setSize(300, 300);

        // 5. Show the frame
        frame.setVisible(true);
    }
}
