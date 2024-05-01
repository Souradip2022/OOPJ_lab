package lab_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundColorChanger extends JFrame implements ActionListener {
  JButton button1 = new JButton("Red");
  JButton button2 = new JButton("Green");
  JButton button3 = new JButton("Blue");
  public BackgroundColorChanger() {
    setTitle("Background Color Changer");
    setSize(600, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    button1.addActionListener((ActionListener) this);
    button2.addActionListener((ActionListener) this);
    button3.addActionListener((ActionListener) this);


/*    // Add action listeners to buttons
    button1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        getContentPane().setBackground(Color.RED);
        repaint(); // Repaint the content pane to reflect the change
      }
    });

    button2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        getContentPane().setBackground(Color.GREEN);
        repaint(); // Repaint the content pane to reflect the change
      }
    });

    button3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        getContentPane().setBackground(Color.BLUE);
        repaint(); // Repaint the content pane to reflect the change
      }
    });*/


    // Set layout
    setLayout(new FlowLayout());
    add(button1);
    add(button2);
    add(button3);
    // Add buttons to the frame
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource()== button1){
      setBackground(Color.RED);
    }
  }

  public static void main(String[] args) {
    new BackgroundColorChanger();
  }
}