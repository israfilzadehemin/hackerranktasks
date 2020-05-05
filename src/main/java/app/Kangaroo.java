package app;

public class Kangaroo {
  public static void main(String[] args) {
    int beginning1 = 0;
    int beginning2 = 4;
    int jump1 = 3;
    int jump2 = 2;

    System.out.println(kangaroo(beginning1, jump1, beginning2, jump2));
  }

  static String kangaroo(int x1, int v1, int x2, int v2) {

    int k1Pos = x1;
    int k2Pos = x2;

    for (int i = 0; i < 10000; i++) {
      k1Pos = k1Pos + v1;
      k2Pos = k2Pos + v2;
      if (k1Pos == k2Pos) return "YES";
    }
    return "NO";
  }

}
