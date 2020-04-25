package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BirthdayCakeCandles {
  public static void main(String[] args) {

    int[] candles = new int[] {9,3,3,5,5,5,9,7,9,2,2,1};

    System.out.println(birthdayCakeCandles(candles));
  }

  static int birthdayCakeCandles(int[] ar) {

    int max = Arrays.stream(ar).max().orElseThrow(RuntimeException::new);

    return (int)Arrays.stream(ar).filter(a -> a==max).count();

  }
}
