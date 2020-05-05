package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PickingNumbers {
  public static void main(String[] args) {
    List<Integer> source = Arrays.asList(1, 2, 2, 2, 3, 3, 5, 3, 1);

    System.out.println(pickingNumbers(source));
  }

  public static int pickingNumbers(List<Integer> a) {
    List<Integer> arrays = new ArrayList<>();

    a.forEach(a1 -> {
      int maxCheck = (int) a.stream()
              .filter(a2 -> a1 - a2 == 0 || a1 - a2 == 1).count();

      arrays.add(maxCheck);
    });

    return Collections.max(arrays);
  }
}
