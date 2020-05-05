package app;

public class ViralAdvertising {
  public static void main(String[] args) {
    int source = 3;
    System.out.println(viralAdvertising(source));
  }

  static int viralAdvertising(int n) {
    int liked = 2;
    int cumulative = 2;

    for (int i=1; i<n; i++) {
      liked = (int)Math.floor((liked * 3) >> 1);
      cumulative += liked;
    }

    return cumulative;
  }

}
