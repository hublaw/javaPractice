import java.util.List;
import java.util.ArrayList;

public class Fib {
  public static void main(String[] args) {
    List<Integer> fibList= new ArrayList<Integer>();
    int max = 400;
    int num = 6;
    fibList.add(0);
    fibList.add(1);
    int i = 1;

    // print fib numbers less than max
    do {
      ++i;
      fibList.add(fibList.get(i-1) + fibList.get(i-2));
    } while (fibList.get(i) < max);
    int j = 0;
    while (fibList.get(j) < max) {
      System.out.println(fibList.get(j));
      ++j;
    }

    // print first num fib numbers
    // for (int k = 2; k < num; k ++) {
    //   fibList.add(fibList.get(k-1) + fibList.get(k-2));
    // }
    // for (int m = 0; m < fibList.size(); m++) {
    //   System.out.println(fibList.get(m));
    // }

    // add the first num fib numbers
    // for (int k = 2; k < num; k ++) {
    //   fibList.add(fibList.get(k-1) + fibList.get(k-2));
    // }
    // int total = 0;
    // for (int m = 0; m < fibList.size(); m++) {
    //   total += fibList.get(m);
    //   System.out.println(fibList.get(m));
    // }
    // System.out.println(total);
  }
}
