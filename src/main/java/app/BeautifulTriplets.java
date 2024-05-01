package app;

import java.util.ArrayList;
import java.util.List;

public class BeautifulTriplets {
    public static void main(String[] args) {
        System.err.println(beautifulTriplets(3, List.of(1, 2, 3, 4, 5, 7, 8, 10)));
    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count = 0;

        for (int i = 0; i < arr.size(); i++) {
            int first = arr.get(i);
            int second = first + d;
            int third = second + d;

            if (arr.contains(second) && arr.contains(third)) {
                count++;
            }
        }

        return count;
    }

}
