package app;

public class DivisibleSumPairs {
  public static void main(String[] args) {
    int[] source = {1, 3, 2, 6, 1, 2};
    int factor = 3;
    System.out.println(divisibleSumPairs(args.length, factor, source));
  }

  static int divisibleSumPairs(int n, int k, int[] ar) {

    int counter =0;

    for (int i =0; i<ar.length; i++) {
      for (int j =i; j<ar.length; j++) {
        if (i!=j && (ar[i]+ar[j])%k==0) counter++;
      }
    }

    return counter;
  }
}
