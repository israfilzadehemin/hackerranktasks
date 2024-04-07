package app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PermutationEquation {
    public static void main(String[] args) {
        System.err.println(permutationEquation(List.of(4, 3, 5, 1, 2)));
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        return IntStream.rangeClosed(1, p.size())
                .map(index -> p.indexOf(index) + 1)
                .mapToObj(x -> p.indexOf(x) + 1)
                .collect(Collectors.toList());

    }
}
