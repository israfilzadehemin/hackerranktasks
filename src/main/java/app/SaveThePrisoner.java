package app;

public class SaveThePrisoner {
    public static void main(String[] args) {
        System.err.println(saveThePrisoner(352926151, 380324688, 94730870));
    }


    public static int saveThePrisoner(int n, int m, int s) {

        int unlucky = (m + s - 1) % n;
        return unlucky == 0 ? n : unlucky;

    }

}
