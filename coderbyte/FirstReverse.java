import java.util.*;
import java.io.*;

class FirstReverse {
  public static String firstReverse(String str) {
    String string = "";
    for (int i = str.length()-1; i >= 0; i--) {
      string += str.charAt(i);
    }
    return string;
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(firstReverse(s.nextLine()));
  }
}
