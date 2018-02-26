import java.util.*;
import java.io.*;

class LongestWord {

  public static String longestWord(String sentence) {
    // remove punctuation and split on spaces
    String[] sen = sentence.replaceAll("[^a-zA-Z ]", "").split(" ");
    String longest = sen[0];
    for (String s : sen) {
      if (s.length() > longest.length()) {
        longest = s;
      }
    }
    return longest;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print(longestWord(s.nextLine()));
  }
}
