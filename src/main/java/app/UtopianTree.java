package app;

public class UtopianTree {
  public static void main(String[] args) {
    int period = 3;
    System.out.println(utopianTree(period));
  }

  static int utopianTree(int n) {
    int height = 1;

    for (int i = 1; i <= n; i++) {
      height = i % 2 != 0 ? height * 2 : height + 1;
    }

    return height;
  }
}
