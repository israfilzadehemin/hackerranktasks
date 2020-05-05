package app;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AppleAndOrange {
  public static void main(String[] args) {
    int beginning = 6;
    int end = 8;
    int apple = 2;
    int orange = 10;
    int[] apples = {3, 5, 7};
    int[] oranges = {-3, -2, -1};

    countApplesAndOranges(beginning, end, apple, orange, apples, oranges);

  }

  //s-beginning of house
  //t-end of house
  //a apple tree
  //b orange tree
  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    System.out.println(Arrays.stream(apples).filter(ap -> ap>=s-a && ap<=t-a).count());
    System.out.println(Arrays.stream(oranges).filter(or -> or<=t-b && or>=s-b).count());
  }
}
