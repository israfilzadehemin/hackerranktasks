package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirthdayChocolate {
  public static void main(String[] args) {

    List<Integer> source = Arrays.asList(1,4);
    int day = 4;
    int month = 1;

    System.out.println(birthday(source, day, month));
  }

  static int birthday(List<Integer> s, int d, int m) {
    int counter = 0;

    for (int mainEl = 0; mainEl < s.size(); mainEl++) {
      List<Integer> temp = new ArrayList<>();

      for (int subEl = mainEl; subEl < mainEl+m; subEl++) {
        if (subEl<s.size()) {
          temp.add(s.get(subEl));

          Integer sum = temp.stream().mapToInt(Integer::intValue).sum();

          if (d == sum && temp.size() == m) counter++;
        }
      }
    }

    return counter;
  }
}
