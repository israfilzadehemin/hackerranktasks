package app;

import java.util.ArrayList;
import java.util.List;

public class FairRations {

    public static void main(String[] args) {
        System.err.println(fairRations(List.of(2,3,4,5,6)));
    }

    public static String fairRations(List<Integer> B) {
        List<Integer> breadDistribution = new ArrayList<>(B); // Creating a mutable copy

        int breads = 0;

        for (int i = 0; i < breadDistribution.size() - 1; i++) {
            if (breadDistribution.get(i) % 2 != 0) {
                breadDistribution.set(i, breadDistribution.get(i) + 1);
                breadDistribution.set(i + 1, breadDistribution.get(i + 1) + 1);
                breads += 2;
            }
        }

        if (breadDistribution.get(breadDistribution.size() - 1) % 2 != 0)
            return "NO";

        return String.valueOf(breads);
    }
}
