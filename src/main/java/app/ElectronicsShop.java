package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ElectronicsShop {
  public static void main(String[] args) {
    int[] keyboards = {20, 35, 50};
    int[] drives = {5, 10, 15};
    int budget = 55;

    System.out.println(getMoneySpent(keyboards, drives, budget));
  }

  static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    List<Integer> accessible = new ArrayList<>();

    Arrays.stream(keyboards).forEach(k ->
      Arrays.stream(drives).filter(d -> k + d < b)
              .map(dr -> k + dr).forEach(accessible::add));

    return accessible.size() != 0 ? Collections.max(accessible) : -1;
  }
}
