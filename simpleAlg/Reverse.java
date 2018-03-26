import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    String reverse = scanner.next();
    for (int i = reverse.length() - 1; i >= 0; i--) {
      // System.out.print(Character.toLowerCase(reverse.charAt(i)));
      sb.append(reverse.charAt(i));
    }
    System.out.println(sb);
  }
}
