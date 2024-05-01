package lab_07;

public class exeption_02 {
  public static void main(String[] args) {
    int a = 5;
    try {
      System.out.println(a / 0);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
      System.out.println("Out of bound index");
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      System.out.println("Can't divide by 0");
    } finally {
      System.out.println("Hi Souradip!");
    }
  }
}
