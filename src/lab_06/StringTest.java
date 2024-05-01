package lab_06;

public class StringTest {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer(30);
    System.out.println(sb1.capacity());
    StringBuffer sb2 = new StringBuffer("Souradip Saha");

    StringBuffer sb = new StringBuffer();
    sb.append("WeMake Devs");
    sb.append(" is nice!");
    System.out.println(sb);
    sb.insert(2, "    ");
    sb.replace(1, 5, "Souradip");
    String str = sb.toString();
    System.out.println(str);

    sb.delete(1, 5);
    System.out.println(sb.insert(4, "ahws"));
    System.out.println(sb.deleteCharAt(2));

    System.out.println(sb.reverse());

    String sentence = "Hi! How are you?";
    System.out.println(sentence.replaceAll("\\s", ""));


    String st = "To character array";
    char[] ch = st.toCharArray();

    if (st.contains("To")) {
      System.out.println("Successful");
    }

//    String a = "abc";
//    String b = "abc";
    /*StringBuilder a = new StringBuilder("abc");
    StringBuilder b = new StringBuilder("abc");
    if(a==b){
      System.out.println(true);
    }*/
  }

}
