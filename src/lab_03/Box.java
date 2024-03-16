/*Write a class file – box with three data members(length, width,
height) and a method volume(). Also implement the application class Demo where an
object of the box class is created with user entered dimensions and volume is printed.*/

package lab_03;

import java.util.Scanner;

public class Box {

  double l, b, h;

  public Box() {
    super();
  }

  public Box(double l, double b, double h) {
    this.l = l;
    this.b = b;
    this.h = h;
  }

  public double volume() {
    return l * b * h;
  }

  static class Demo {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter length, breath and height ");
      double l = in.nextDouble();
      double b = in.nextDouble();
      double h = in.nextDouble();
      Box vol = new Box(l, b, h);
      System.out.println("Volume of box is: " + vol.volume());

    }
  }
}
