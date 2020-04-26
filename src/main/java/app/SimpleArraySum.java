package app;

import java.util.Arrays;

public class SimpleArraySum {
  public static void main(String[] args) {

    int[] forSum = new int[] {1,2,3,4,5};
    System.out.println(simpleArraySum(forSum));
  }

  static int simpleArraySum(int[] ar) {

    return Arrays.stream(ar).sum();
  }
}
