package app;

public class TaumAndBDay {
    public static void main(String[] args) {

        System.err.println(taumBday(27984, 1402, 619246, 615589, 247954));
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {

        return (long) b * Math.min(bc, wc + z) + (long) w * Math.min(wc, bc + z);
    }
}
