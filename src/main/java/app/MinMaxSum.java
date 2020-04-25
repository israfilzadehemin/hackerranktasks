package app;

import java.util.Arrays;
import java.util.Collections;

public class MinMaxSum {
  public static void main(String[] args) {
    int[] source = new int[]{6, 5, 8, 9, 7};
  }


  static void miniMaxSum(int[] arr) {

    long[] longArray = Arrays.stream(arr).mapToLong(i -> i).toArray();

    Arrays.sort(longArray);

    long maxSum = Arrays.stream(arr).sum() - arr[0];
    long minSum = Arrays.stream(arr).sum() - arr[arr.length - 1];

    System.out.println(minSum + " " + maxSum);

  }
}
