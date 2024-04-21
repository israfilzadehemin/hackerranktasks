package app;

import java.util.stream.IntStream;

public class RepeatedString {
    public static void main(String[] args) {
        System.err.println(repeatedString("abcac", 999));
    }

    public static long repeatedString(String s, long n) {

        int counter = (int) IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == 'a')
                .count();

        long repetition = n / s.length();
        long repeatingCount = repetition * counter;
        long mod = n - repetition * s.length();

        String substring = s.substring(0, (int) mod);

        int subCounter = (int) IntStream.range(0, substring.length())
                .filter(i -> substring.charAt(i) == 'a')
                .count();

        return subCounter + repeatingCount;
    }
}
