package app;

public class CatsAndAMouse {
  public static void main(String[] args) {
    int catA = 3;
    int catB = 5;
    int catC = 7;

    System.out.println(catAndMouse(3,5,7));
  }

  static String catAndMouse(int x, int y, int z) {
    if (Math.abs(z-x) > Math.abs(z-y)) return "Cat B";
    else if (Math.abs(z-y) > Math.abs(z-x)) return "Cat A";
    else return "Mouse C";

  }
}
