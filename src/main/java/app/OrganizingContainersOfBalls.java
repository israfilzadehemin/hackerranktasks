package app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class OrganizingContainersOfBalls {
    public static void main(String[] args) {

    }

    public static String organizingContainers(List<List<Integer>> container) {
        long[] sortedContainerCounts =
                container
                        .stream()
                        .mapToLong(c -> c.stream().mapToLong(Integer::longValue).sum())
                        .sorted()
                        .toArray();


        long[] sortedTypeCounts =
                IntStream
                        .range(0, container.size())
                        .mapToLong(index ->
                                container
                                        .stream()
                                        .mapToLong(c -> c.get(index).longValue())
                                        .sum())
                        .sorted()
                        .toArray();

        return Arrays.equals(sortedContainerCounts, sortedTypeCounts) ?
                "Possible" : "Impossible";
    }
}
