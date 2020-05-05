package app;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BeautifulDaysAtTheMovies {
  public static void main(String[] args) {
    int beginning = 20;
    int end = 23;
    int divisor = 6;

    System.out.println(findReverse(20));
    System.out.println(beautifulDays(beginning, end, divisor));

    //hackerrank has no idea about IntStream. It should be replaced by conventional for
  }

  static int findReverse(int num) {
    String val = String.valueOf(num);
    String rev = IntStream.iterate(val.length() - 1, i -> i >= 0, i -> i - 1).mapToObj(i -> String.valueOf(val.charAt(i))).collect(Collectors.joining());

    return Integer.parseInt(rev);
  }

  static int beautifulDays(int i, int j, int k) {
    return (int) IntStream.rangeClosed(i, j)
            .filter(l -> (l - findReverse(l)) % k == 0)
            .count();


  }
}
