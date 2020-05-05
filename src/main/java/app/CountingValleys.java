package app;

public class CountingValleys {
  public static void main(String[] args) {

    String source = "DDUUDDUDUUUD";
    System.out.println(countingValleys(source.length(), source));
  }

  static int countingValleys(int n, String s) {

    int height = 0;
    int countValley = 0;

    for (int i = 0; i < n; i++) {
      switch (s.charAt(i)) {
        case 'U':
          height++;
          break;
        case 'B':
          height--;
          break;
      }
      if (s.charAt(i) == 'U' && height == 0) countValley++;
    }

    return countValley;
  }
}
