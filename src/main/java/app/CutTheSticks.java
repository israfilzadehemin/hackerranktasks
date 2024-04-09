package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {
    public static void main(String[] args) {
        System.err.println(cutTheSticks(List.of(5, 4, 4, 2, 2, 8)));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> modified = arr;
        List<Integer> size = new ArrayList<>();
        while (!modified.isEmpty()) {
            Integer min = Collections.min(modified);
            size.add(modified.size());
            modified = modified
                    .stream()
                    .map(el -> el - min)
                    .filter(el -> el > 0).collect(Collectors.toList());
        }

        return size;
    }
}
