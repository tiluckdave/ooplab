import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCalculator extends JFrame implements ActionListener {
    JTextField tf;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13,
            b14, b15, b16;
    JPanel p1;

    public SwingCalculator() {
        tf = new JTextField();
        p1 = new JPanel();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        b11 = new JButton("C");
        b12 = new JButton("=");
        b13 = new JButton("+");
        b14 = new JButton("-");
        b15 = new JButton("*");
        b16 = new JButton("/");

        p1.setLayout(new GridLayout(4, 4));
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b13);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b14);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b15);
        p1.add(b11);
        p1.add(b10);
        p1.add(b12);
        p1.add(b16);

        add(tf, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);

        // setLayout(new BorderLayout());
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            tf.setText(tf.getText().concat("1"));
        }
        if (e.getSource() == b2) {
            tf.setText(tf.getText().concat("2"));
        }
        if (e.getSource() == b3) {
            tf.setText(tf.getText().concat("3"));
        }
        if (e.getSource() == b4) {
            tf.setText(tf.getText().concat("4"));
        }
        if (e.getSource() == b5) {
            tf.setText(tf.getText().concat("5"));
        }
        if (e.getSource() == b6) {
            tf.setText(tf.getText().concat("6"));
        }
        if (e.getSource() == b7) {
            tf.setText(tf.getText().concat("7"));
        }
        if (e.getSource() == b8) {
            tf.setText(tf.getText().concat("8"));
        }
        if (e.getSource() == b9) {
            tf.setText(tf.getText().concat("9"));
        }
        if (e.getSource() == b10) {
            tf.setText(tf.getText().concat("0"));
        }
        if (e.getSource() == b13) {
            tf.setText(tf.getText().concat("+"));
        }
        if (e.getSource() == b14) {
            tf.setText(tf.getText().concat("-"));
        }
        if (e.getSource() == b15) {
            tf.setText(tf.getText().concat("*"));
        }
        if (e.getSource() == b16) {
            tf.setText(tf.getText().concat("/"));
        }
        if (e.getSource() == b11) {
            tf.setText("");
        }
        if (e.getSource() == b12) {
            String s = tf.getText();
            String[] arr = s.split("[+\\-*/]");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = 0;
            if (s.contains("+")) {
                c = a + b;
            }
            if (s.contains("-")) {
                c = a - b;
            }
            if (s.contains("*")) {
                c = a * b;
            }
            if (s.contains("/")) {
                c = a / b;
            }
            tf.setText(String.valueOf(c));
        }
    }

    public static void main(String[] args) {
        new SwingCalculator();
    }
}