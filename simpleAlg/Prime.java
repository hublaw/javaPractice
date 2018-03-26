import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    Boolean result = true;

    for (int i = 2; i < input; i++) {
      if (input % i == 0) {
        result = false;
        break;
      }
    }

    System.out.println(result);

  }
}
