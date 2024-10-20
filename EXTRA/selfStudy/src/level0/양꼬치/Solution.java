package level0.양꼬치;

public class Solution {
    private static final int LAMB_SKEWER_PRICE = 12000;
    private static final int DRINK_PRICE = 2000;
    private static final int SERVICE_THRESHOLD = 10;

    public int solution(int n, int k) {
        int totalLambPrice = n * LAMB_SKEWER_PRICE;
        int totalDrinkPrice = k * DRINK_PRICE;
        int serviceDrinks = n / SERVICE_THRESHOLD;

        return totalLambPrice + totalDrinkPrice - (serviceDrinks * DRINK_PRICE);
    }
}
