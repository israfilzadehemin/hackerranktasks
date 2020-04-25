package app;

import java.util.Arrays;

public class PlusMinus {
  public static void main(String[] args) {

    int[] source = new int[]{1, -5, 0, -3, 7, 0, 5, 2, -1, 3};
    plusMinus(source);

  }

  static void plusMinus(int[] arr) {
    float length = arr.length;
    float pos = 0;
    float neg = 0;
    float zero = 0;

    for (int i : arr) {
      if (i > 0) pos++;
      if (i < 0) neg++;
      if (i == 0) zero++;
    }

    System.out.printf("%.6f\n",pos/length);
    System.out.printf("%.6f\n",neg/length);
    System.out.printf("%.6f\n",zero/length);

  }
}
