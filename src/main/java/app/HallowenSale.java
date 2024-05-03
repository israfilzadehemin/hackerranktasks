package app;

public class HallowenSale {

    public static void main(String[] args) {
        System.err.println(howManyGames(20,3,6,80));
    }

    public static int howManyGames(int price, int discount, int minimumPrice, int wallet) {

        int count = 0;
        return buyGame(price, discount, minimumPrice, wallet, count);
    }

    static int buyGame(int price, int discount, int minimumPrice, int wallet, int count) {

        if (wallet >= price) {
            count++;
            wallet -= price;

            price = Math.max(price - discount, minimumPrice);

            return buyGame(price, discount, minimumPrice, wallet, count);
        } else {
            return count;
        }
    }
}
