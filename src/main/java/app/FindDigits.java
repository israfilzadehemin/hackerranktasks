package app;

import java.util.stream.IntStream;

public class FindDigits {
  public static void main(String[] args) {
    int source = 1505;
    System.out.println(findDigits(source));
  }

  static int findDigits(int n) {
    String value = String.valueOf(n);

    return (int) IntStream.range(0, value.length())
            .filter(i -> value.charAt(i) != '0')
            .map(i -> Integer.parseInt(String.valueOf(value.charAt(i))))
            .filter(x -> n % x == 0).count();


  }
}
