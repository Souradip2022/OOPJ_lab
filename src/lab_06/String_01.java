package lab_06;

import java.util.Scanner;

public class String_01 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = in.nextLine();
    str = str.trim();

    System.out.println("---------------------------Menu driven-----------------------------");
    System.out.println("1. Change the case of the string");
    System.out.println("2. Reverse the string");
    System.out.println("3. Compare two strings");
    System.out.println("4. Insert one string into another string");
    System.out.println("5. Convert the string to upper case and lower case");
    System.out.println("6. Check whether the character is present in the string and at which position");
    System.out.println("7. Check whether the string is palindrome or not.");
    System.out.println("8. Check the number of word, vowel and consonant in the string");

    boolean b = true;
    while (b) {
      System.out.print("\nEnter your choice: ");
      int choice = in.nextInt();

      switch (choice) {
        case 1: {
          String str2;
          if (Character.isUpperCase(str.charAt(0))) {
            str2 = str.toLowerCase();
          } else {
            str2 = str.toUpperCase();
          }

          System.out.println("String after changing the casing: " + str2);

          break;
        }
        case 2: {
          String strRev = "";
          for (int i = str.length() - 1; i >= 0; i--) {
            strRev = strRev.concat(String.valueOf(str.charAt(i)));
          }

          System.out.println("Reversed string: " + strRev);

          break;
        }
        case 3: {
          System.out.print("Enter string to be compared: ");
          in.nextLine();
          String strCmp = in.nextLine();
          int a = str.compareTo(strCmp);

          System.out.println("\nThe difference between ASCII value is = " + Math.abs(a));

          break;
        }
        case 4: {
          System.out.print("Enter string to be inserted: ");
          in.nextLine();
          String strIns = in.nextLine();

          strIns = str + " " + strIns.trim();
          System.out.println("\nFinal string after insertion: " + strIns);

          break;
        }
        case 5: {
          System.out.println("Upper case conversion: " + str.toUpperCase());
          System.out.println("Lower case conversion: " + str.toLowerCase());

          break;
        }
        case 6: {
          System.out.print("Enter character to be searched: ");
          char sr = in.next().charAt(0);
          boolean bl = false;
          for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sr) {
              System.out.println("Character is present at index: " + i);
              bl = true;
            }
          }

          if(!bl){
            System.out.println("Character not present");
          }

          break;
        }
        case 7: {
          String strRev = "";
          for (int i = str.length() - 1; i >= 0; i--) {
            strRev = strRev.concat(String.valueOf(str.charAt(i)));
          }
          if (strRev.equals(str)) {
            System.out.println("Palindrome string");
          } else {
            System.out.println("String not palindrome");
          }

          break;
        }
        case 8: {
          int wordCnt = 0, vowelCnt = 0, consonantCnt = 0;
          str = " " + str;
          str = str.toLowerCase();
          char ch;
          for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
              vowelCnt++;
            } else {
              consonantCnt++;
            }
            if (ch == ' ') {
              wordCnt++;
            }
          }

          System.out.println("No of words = " + wordCnt);
          System.out.println("No of vowels = " + vowelCnt);
          System.out.println("No of consonants = " + consonantCnt);

          break;
        }
        default:
          System.out.println("Invalid choice");
      }
      System.out.print("Press y to continue else press n: ");
      char contCheck = in.next().charAt(0);
      if (contCheck == 'n') {
        break;
      }

    }
  }
}
