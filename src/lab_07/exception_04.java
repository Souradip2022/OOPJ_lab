package lab_07;

import java.util.Scanner;

class HrsException extends Exception {
  HrsException(String message) {
    super(message);
  }
}

class MinException extends Exception {
  MinException(String message) {
    super(message);
  }
}

class SecException extends Exception {
  SecException(String message) {
    super(message);
  }
}

public class exception_04 {
  static int hr, min, sec;

  public static void time() {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter time in hr, min and sec format: ");
    hr = in.nextInt();
    min = in.nextInt();
    sec = in.nextInt();

    try {
      if (hr > 24 || hr < 0) {
        throw new HrsException("InvalidHourException: hour entered is invalid");
      }

    } catch (HrsException e) {
      System.out.println(e.getMessage());

    }

    try {
      if (min > 60 || min < 0) {
        throw new MinException("InvalidMinuteException: minute entered is not valid");
      }
    } catch (MinException e) {
      System.out.println(e.getMessage());
    }

    try {
      if (sec > 60 || sec < 0) {
        throw new SecException("InvalidSecondException: second entered is not valid");
      }
    } catch (SecException e) {
      System.out.println(e.getMessage());
    }

    finally {
      if (hr < 24 && hr >= 0 && min < 60 && min >= 0 && sec < 60 && sec >= 0) {
        System.out.println("Correct time: " + hr + ":" + min + ":" + sec);
      }
      System.out.println("Time is " + hr + ":" + min + ":" + sec);
    }
  }

  public static void main(String[] args) throws HrsException, MinException, SecException {
    time();
  }
}
