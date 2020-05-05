package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {
  public static void main(String[] args) {

    List<Integer> source = Arrays.asList(36, 37, 55, 59, 63, 75);
    System.out.println(gradingStudents(source));
  }

  public static List<Integer> gradingStudents(List<Integer> grades) {

    return grades.stream()
            .map(gr -> gr < 38 ? gr : gr % 5 > 2 ? (gr / 5 + 1) * 5 : gr)
            .collect(Collectors.toList());
  }
}
