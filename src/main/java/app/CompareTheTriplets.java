package app;

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
  public static void main(String[] args) {

    List<Integer> c1 = Arrays.asList(5, 6, 9);
    List<Integer> c2 = Arrays.asList(3, 7, 5);

    System.out.println(compareTriplets(c1, c2));

  }

  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

    int counter1 = 0;
    int counter2 = 0;

    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) counter1++;
      if (a.get(i) < b.get(i)) counter2++;
    }

    return Arrays.asList(counter1, counter2);
  }
}
