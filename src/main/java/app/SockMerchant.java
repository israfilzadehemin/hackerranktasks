package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SockMerchant {
  public static void main(String[] args) {
    int[] source = {10, 20, 20, 10, 10, 30, 50, 10, 20};

    System.out.println(sockMerchant(source.length, source));
  }

  static int sockMerchant(int n, int[] ar) {
    HashSet<Integer> unique = Arrays.stream(ar).boxed()
            .collect(Collectors.toCollection(HashSet::new));

    return unique.stream()
            .mapToInt(uni -> (int) Arrays.stream(ar).filter(a -> a == uni).count())
            .filter(count -> count / 2 != 0)
            .map(count -> count / 2).sum();

  }
}
