import java.util.Scanner;

public class Vector2d {
  double x1, x2;

  public Vector2d(double x1, double x2) {
    this.x1 = x1;
    this.x2 = x2;
  }

  public double manhattenDist(double d1, double d2) {
    return Math.abs(x1 - d1) + Math.abs(x2 - d2);
  }

  public double euclideanDist(double d1, double d2) {
    return Math.sqrt(Math.pow((x1 - d1), 2) + Math.pow((x2 - d2), 2));
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    Vector2d X[] = new Vector2d[5];

    System.out.println("Enter 5 2D Vector points 1 by one: ");
    for (int i = 0; i < 5; i++) {
      double x1 = in.nextDouble();
      double x2 = in.nextDouble();
      X[i] = new Vector2d(x1, x2);
    }

    Vector2d Y = new Vector2d(1.4, 1.6);
    Double manD[] = new Double[5];
    Double euclD[] = new Double[5];

    for (int i = 0; i < 5; i++) {
      manD[i] = X[i].manhattenDist(Y.x1, Y.x2);
      euclD[i] = X[i].euclideanDist(Y.x1, Y.x2);
    }

    double MIN = 0;
    int temp = 0;
    for (int i = 0; i < 5; i++) {
      MIN = manD[i];
      for (int j = 0; j < 5; j++) {
        if (MIN < manD[j]) {
          MIN = manD[j];
          temp = j;
        }
      }
    }

    System.out.println("Closest data point to entry is: " + X[temp].x1 + ", " + X[temp].x2 + "\n");

    System.out.println("Manhatten distance and Euclidean distance respectively");
    for (int i = 0; i < 5; i++) {
      System.out.println(manD[i]);
      System.out.println(euclD[i] + "\n");
    }
  }
}
