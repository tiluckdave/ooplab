import javax.swing.*;
import java.awt.event.*;

public class AdditionGUI {
    public static void main(String args[]) {
        new Abc();
    }
}

class Abc implements ActionListener {
    JLabel l1;
    JTextField t1;
    JLabel l2;
    JTextField t2;
    JButton b1, b2, b3;
    JLabel l3;
    JTextField t3;

    public Abc() {
        JFrame j = new JFrame("Number Addition");
        l1 = new JLabel("First Number:");
        t1 = new JTextField(20);

        l2 = new JLabel("Second Number:");
        t2 = new JTextField(20);

        l3 = new JLabel("Result");
        t3 = new JTextField(20);

        b1 = new JButton("Add");
        b2 = new JButton("Clear");
        b3 = new JButton("Exit");
        // l3=new JLabel("Result:");

        j.add(l1);
        j.add(t1);
        j.add(l2);
        j.add(t2);
        j.add(l3);
        j.add(t3);
        j.add(b1);
        j.add(b2);
        j.add(b3);
        l1.setBounds(100, 50, 180, 50);
        t1.setBounds(250, 50, 180, 50);
        l2.setBounds(100, 150, 180, 50);
        t2.setBounds(250, 150, 180, 50);
        l3.setBounds(100, 250, 180, 50);
        t3.setBounds(250, 250, 180, 50);
        b1.setBounds(150, 350, 180, 50);
        b2.setBounds(300, 350, 180, 50);
        b3.setBounds(400, 450, 180, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        j.setLayout(null);
        j.setVisible(true);
        j.setSize(600, 600);

        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            int value = num1 + num2;
            t3.setText(" " + value);
        }

        if (ae.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }

        if (ae.getSource() == b3) {
            System.exit(0);
        }
    }

}