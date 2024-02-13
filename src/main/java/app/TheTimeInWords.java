package app;

import java.util.HashMap;
import java.util.Map;

public class TheTimeInWords {
    public static void main(String[] args) {
        System.err.println(timeInWords(5, 30));
    }


    public static String timeInWords(int h, int m) {
        Map hours = getHours();
        Map minutes = getMinutes();


        String first = m == 0 ? hours.get(h).toString() : minutes.get(getMinutesRest(m)).toString();
        String second = m == 0 ? "" : m <= 30 ? " past" : " to";
        String third = m == 0 ?  minutes.get(m).toString() :
                h == 12
                        ? "0"
                        : m > 30 ?  hours.get(h + 1).toString() : hours.get(h).toString();


        return String.format("%s%s %s", first, second, third);
    }

    static int getMinutesRest(int m) {
        int i = m < 30 ? m : 60 - m;
        return i;
    }

    private static Map getMinutes() {
        HashMap<Integer, String> minutes = new HashMap<>();
        minutes.put(1, "one minute");
        minutes.put(2, "two minutes");
        minutes.put(3, "three minutes");
        minutes.put(4, "four minutes");
        minutes.put(5, "five minutes");
        minutes.put(6, "six minute");
        minutes.put(7, "seven minutes");
        minutes.put(8, "eight minutes");
        minutes.put(9, "nine minutes");
        minutes.put(10, "ten minutes");
        minutes.put(11, "eleven minutes");
        minutes.put(12, "twelve minutes");
        minutes.put(13, "thirteen minutes");
        minutes.put(14, "fourteen minutes");
        minutes.put(15, "quarter");
        minutes.put(16, "sixteen minute");
        minutes.put(17, "seventeen minutes");
        minutes.put(18, "eighteen minutes");
        minutes.put(19, "nineteen minutes");
        minutes.put(20, "twenty minutes");
        minutes.put(21, "twenty one minutes");
        minutes.put(22, "twenty two minutes");
        minutes.put(23, "twenty three minutes");
        minutes.put(24, "twenty four minutes");
        minutes.put(25, "twenty five minutes");
        minutes.put(26, "twenty six minutes");
        minutes.put(27, "twenty seven minutes");
        minutes.put(28, "twenty eight minutes");
        minutes.put(29, "twenty nine minutes");
        minutes.put(30, "half");

        minutes.put(31, "thirty one minutes");
        minutes.put(32, "thirty two minutes");
        minutes.put(33, "thirty three minutes");
        minutes.put(34, "thirty four minutes");
        minutes.put(35, "thirty five minutes");
        minutes.put(36, "thirty six minutes");
        minutes.put(37, "thirty seven minutes");
        minutes.put(38, "thirty eight minutes");
        minutes.put(39, "thirty nine minutes");
        minutes.put(40, "forty");

        minutes.put(41, "forty one minutes");
        minutes.put(42, "forty two minutes");
        minutes.put(43, "forty three minutes");
        minutes.put(44, "forty four minutes");
        minutes.put(45, "quarter");
        minutes.put(46, "forty six minutes");
        minutes.put(47, "forty seven minutes");
        minutes.put(48, "forty eight minutes");
        minutes.put(49, "forty nine minutes");
        minutes.put(50, "forty");

        minutes.put(51, "fifty one minutes");
        minutes.put(52, "fifty two minutes");
        minutes.put(53, "fifty three minutes");
        minutes.put(54, "fifty four minutes");
        minutes.put(55, "fifty five");
        minutes.put(56, "fifty six minutes");
        minutes.put(57, "fifty seven minutes");
        minutes.put(58, "fifty eight minutes");
        minutes.put(59, "fifty nine minutes");
        minutes.put(00, "o' clock");

        return minutes;
    }

    private static Map getHours() {
        HashMap<Integer, String> hours = new HashMap<>();
        hours.put(1, "one");
        hours.put(2, "two");
        hours.put(3, "three");
        hours.put(4, "four");
        hours.put(5, "five");
        hours.put(6, "six");
        hours.put(7, "seven");
        hours.put(8, "eight");
        hours.put(9, "nine");
        hours.put(10, "ten");
        hours.put(11, "eleven");
        hours.put(12, "twelve");

        return hours;
    }
}
