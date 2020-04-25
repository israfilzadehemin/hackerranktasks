package app;

public class Staircase {
  public static void main(String[] args) {

    staircase(5);
  }

  static void staircase(int n) {

    for (int i = 0; i < n; i++) {

      for (int j = n-1; j > i; j--) {
        System.out.print(" ");
      }

      for (int j = 0; j <= i; j++) {
        System.out.print("#");
      }

      System.out.println();
    }
  }
}
