package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BonApetit {
  public static void main(String[] args) {
    List<Integer> source = Arrays.asList(2, 3, 6, 10, 5);
    int out = 2;
    int amount = 13;

    bonAppetit(source, out, amount);
  }

  static void bonAppetit(List<Integer> bill, int k, int b) {
    int sum = bill.stream().mapToInt(Integer::intValue).sum();
    int sumExcluded = bill.stream().mapToInt(Integer::intValue).sum()-bill.get(k);

    if (sumExcluded/2<b) {
      System.out.println(sum/2-sumExcluded/2);

    } else {
      System.out.println("Bon Appetit");
    }
  }
}
