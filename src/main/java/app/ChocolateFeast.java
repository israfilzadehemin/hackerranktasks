package app;

public class ChocolateFeast {

    public static void main(String[] args) {
        System.err.println(chocolateFeast(10,2,5));
    }

    public static int chocolateFeast(int initialMoney, int chocolatePrice, int priceWithWrapper) {

        int chocolateSum = initialMoney / chocolatePrice;
        int wrapperCount = chocolateSum;

        while (wrapperCount >= priceWithWrapper) {
            int chocolateFromWrappers = wrapperCount / priceWithWrapper;
            chocolateSum += chocolateFromWrappers;
            wrapperCount = chocolateFromWrappers + wrapperCount % priceWithWrapper;
        }

        return chocolateSum;
    }
}
