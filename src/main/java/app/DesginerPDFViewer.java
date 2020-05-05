package app;

public class DesginerPDFViewer {
  public static void main(String[] args) {
    int[] height = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
    String source = "emin";
    System.out.println(designerPdfViewer(height, source));
  }

  static int designerPdfViewer(int[] h, String word) {

    int maxHeight = 0;

    for (int i = 0; i < word.length(); i++) {
      int index = (int) word.charAt(i) - (int) 'a';
      int height = h[index];
      maxHeight = Math.max(maxHeight, height);
    }

    return maxHeight * word.length();
  }

}
