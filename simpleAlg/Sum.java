import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int total = 0;

    // using a loop and the index to sum all indices to n
    // for (int i = 1; i <= n; i++) {
    //   total += i;
    // }

    // sum of a sequence from 1 to n = (n squared + n)/2
    total = (n * n + n) / 2;
    System.out.println(total);
  }
}
