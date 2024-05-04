package app;

import java.util.List;

public class FairRations {

    public static void main(String[] args) {
        System.err.println(fairRations(List.of(2,3,4,5,6)));
    }

    public static String fairRations(List<Integer> B) {
        int breads = 0;

        for (int i = 0; i < B.size() - 1; i++) {
            if (B.get(i) % 2 != 0) {
                B.set(i, B.get(i) + 1);
                B.set(i + 1, B.get(i + 1) + 1);
                breads += 2;
            }
        }

        if (B.get(B.size() - 1) % 2 != 0)
            return "NO";

        return String.valueOf(breads);
    }
}
