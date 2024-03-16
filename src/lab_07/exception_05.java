package lab_07;

class CheckArgument extends Exception {
  CheckArgument(String message) {
    super(message);
  }
}

public class exception_05 {
  public static void main(String[] args) {
    try {
      if (args.length < 4) {
        throw new CheckArgument("Exception occurred – CheckArgument");
      }
      else {
        int sum = 0;
        for (String arg : args) {
          sum += Integer.parseInt(arg);
        }
        System.out.println("Sum of squares of entered nos: " + sum);
      }

    } catch (CheckArgument e) {
      System.out.println(e.getMessage());
    }
  }
}
