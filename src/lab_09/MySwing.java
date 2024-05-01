package lab_09;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySwing implements ActionListener {
  JFrame f1;
  JButton b1;
  JLabel l1, l2;
  JTextField t1;

  MySwing() {
    f1 = new JFrame("Java Swing Demo");
    f1.setSize(400, 300);

    l1 = new JLabel("Name: ");
    l1.setBounds(90, 50, 100, 40);

    l2 = new JLabel("");
    l2.setBounds(90, 5, 150, 50);

    t1 = new JTextField(20);
    t1.setBounds(130, 50, 140, 40);

    b1 = new JButton("Click Me");
    b1.setBounds(130, 100, 100, 40);
    b1.addActionListener(this);

    f1.add(l1);
    f1.add(l2);
    f1.add(t1);
    f1.add(b1);
    f1.setLayout(null);
    f1.setVisible(true);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
      l2.setText("Welcome " + t1.getText());
    }
  }

  public static void main(String[] args) {
    new MySwing();
  }
}