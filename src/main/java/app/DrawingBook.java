package app;

import java.util.stream.IntStream;

public class DrawingBook {
  public static void main(String[] args) {
    int count = 6;  //18183;
    int goal =  4;  //18042;

    System.out.println(pageCount(count, goal));
  }

  static int pageCount(int n, int p) {
    int counterL;
    int counterR;

    counterL = (int) IntStream.iterate(2, i -> i <= p, i -> i + 2).count();

    if (n%2==0) {
      counterR = (int) IntStream.iterate(n, i -> i > p, i -> i - 2).count();
    }
    else {
      counterR = (int) IntStream.iterate(n - 1, i -> i > p, i -> i - 2).count();
    }

    return Math.min(counterL, counterR);

  }}
