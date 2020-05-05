package app;

import java.util.Arrays;

public class TheHurdleRace {
  public static void main(String[] args) {
    int[] source = {3, 5, 1, 2, 3, 5, 7};
    int min = 3;
    System.out.println(hurdleRace(3, source));
  }

  static int hurdleRace(int k, int[] height) {
    int dose;
    int max = Arrays.stream(height).max().getAsInt();
    dose = max > k ? max - k : 0;
    return dose;
  }

}
