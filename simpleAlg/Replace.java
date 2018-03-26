import java.util.Scanner;

public class Replace {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input string: ");
    String input = sc.next();
    String num = "1";
    // replace h with i
    String newStr = input.replace("h", "i");
    // capitalize output
    System.out.print(newStr.substring(0,1).toUpperCase());
    System.out.println(newStr.substring(1));
    // parse string to int
    System.out.println(Integer.parseInt(num) + 1);
    System.out.println(Integer.decode(num) + 1);
    // parse Integer to string
    System.out.println(Integer.toString(1).getClass());
  }
}
