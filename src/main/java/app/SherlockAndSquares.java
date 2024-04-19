package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SherlockAndSquares {
    public static void main(String[] args) {

        System.err.println(squares(3, 9));

    }

    public static int squares(int a, int b) {
        return (int) IntStream.range(0, b)
                .takeWhile(i -> i * i <= b)
                .filter(i -> i * i >= a && i * i <= b)
                .mapToObj(i -> i * i)
                .count();

    }
}
