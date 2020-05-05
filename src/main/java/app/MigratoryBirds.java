package app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MigratoryBirds {
  public static void main(String[] args) {

    List<Integer> source = Arrays.asList(1,3,3,5,6,7,6,5,4,3,7,5,7);

    System.out.println(migratoryBirds(source));

  }

  static int migratoryBirds(List<Integer> arr) {

    Map<Integer, Long> id_count = arr.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
    long max = id_count.values().stream().max(Comparator.comparingLong(a -> a)).orElseThrow(RuntimeException::new);

    return id_count.entrySet().stream()
            .filter(e -> e.getValue() == max)
            .map(e -> e.getKey())
            .min(Comparator.comparing(a -> a))
            .orElseThrow(RuntimeException::new);
  }
}
