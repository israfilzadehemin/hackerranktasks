package app;

import java.util.Arrays;

public class BreakingTheRecords {
  public static void main(String[] args) {

    int[] source = {10, 10, 25, 5, 30, 5, 3, 10, 25, 35, 20};
    System.out.println(Arrays.toString(breakingRecords(source)));
  }

  static int[] breakingRecords(int[] scores) {
    var max = scores[0];
    var min = scores[0];
    var maxCounter = 0;
    var minCounter = 0;

    for (int record : scores) {

      if (record > max) {
        max = record;
        maxCounter++;
      }

      if (record < min) {
        min = record;
        minCounter++;
      }
    }

    return new int[]{maxCounter, minCounter};

  }
}
