package app;

import java.util.Arrays;

public class AngryProfessor {
  public static void main(String[] args) {
    int[] source = {0, 0, -1, -1, 1, 1, 1, -1, 0};
    int threshold = 2;
    System.out.println(angryProfessor(threshold, source));
  }


  static String angryProfessor(int k, int[] a) {

    return (int) Arrays.stream(a).filter(t -> t < 0).count() >=k ? "NO": "YES";

  }
}
