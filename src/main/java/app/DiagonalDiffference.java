package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DiagonalDiffference {
  public static void main(String[] args) {
    List<List<Integer>> source = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 9, 6),
            Arrays.asList(9, 8, 9)
    );

    System.out.println(diagonalDifference(source));
  }

  public static int diagonalDifference(List<List<Integer>> arr) {
    int length = arr.size();
    return Math.abs(IntStream.range(0, length).map(m ->
            arr.get(m).get(m) - arr.get(m).get(length-m-1)
    ).sum());
  }
}
