package lab_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
  // Components
  private JLabel label1, label2, label3;
  private JTextField textField1, textField2, resultField;
  private JButton addButton, subButton, mulButton, resetButton;

  public Calculator() {
    setTitle("Simple Calculator");
    setSize(800, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridLayout(4, 5));

    // Labels
    label1 = new JLabel("Enter the First Number:");
    label2 = new JLabel("Enter the Second Number:");
    label3 = new JLabel("Result:");

    // TextFields
    textField1 = new JTextField();
    textField2 = new JTextField();
    resultField = new JTextField();
    resultField.setEditable(false);

    // Buttons
    addButton = new JButton("Add");
    subButton = new JButton("Subtract");
    mulButton = new JButton("Multiply");
    resetButton = new JButton("Reset");

    // Adding ActionListener to buttons
    addButton.addActionListener(this);
    subButton.addActionListener(this);
    mulButton.addActionListener(this);
    resetButton.addActionListener(this);

    // Adding components to the frame
    add(label1);
    add(textField1);
    add(label2);
    add(textField2);
    add(label3);
    add(resultField);
    add(addButton);
    add(subButton);
    add(mulButton);
    add(resetButton);

    setVisible(true);
  }

  // ActionListener implementation
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addButton) {
      double num1 = Double.parseDouble(textField1.getText());
      double num2 = Double.parseDouble(textField2.getText());
      double result = num1 + num2;
      resultField.setText(Double.toString(result));
    } else if (e.getSource() == subButton) {
      double num1 = Double.parseDouble(textField1.getText());
      double num2 = Double.parseDouble(textField2.getText());
      double result = num1 - num2;
      resultField.setText(Double.toString(result));
    } else if (e.getSource() == mulButton) {
      double num1 = Double.parseDouble(textField1.getText());
      double num2 = Double.parseDouble(textField2.getText());
      double result = num1 * num2;
      resultField.setText(Double.toString(result));
    } else if (e.getSource() == resetButton) {
      textField1.setText("");
      textField2.setText("");
      resultField.setText("");
    }
  }

  public static void main(String[] args) {
    new Calculator();
  }
}

