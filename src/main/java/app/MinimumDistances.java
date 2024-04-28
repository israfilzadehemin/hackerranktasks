package app;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistances {
    public static void main(String[] args) {

        System.err.println(minimumDistances(List.of(7,1,3,4,1,7)));
    }

    public static int minimumDistances(List<Integer> a) {
        List<Integer> list = new ArrayList<>();
        int distance = Integer.MAX_VALUE;

        for (int i = 0; i < a.size(); i++) {
            Integer current = a.get(i);

            if (list.contains(current))
                distance = Math.min(distance, i - list.lastIndexOf(current));
            list.add(a.get(i));
        }

        return distance == Integer.MAX_VALUE ? -1 : distance;
    }
}
