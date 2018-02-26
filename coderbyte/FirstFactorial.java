import java.util.*;
import java.io.*;

class FirstFactorial {
  public static int firstFactorial(int num) {
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact *= i;
    }
    return fact;
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(firstFactorial(Integer.parseInt(s.nextLine())));
  }
}
