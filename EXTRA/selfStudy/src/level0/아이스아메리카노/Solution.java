package level0.아이스아메리카노;

public class Solution {
    private static final int AMERICANO_PRICE = 5500;

    public int[] solution(int money) {
        int cups = money / AMERICANO_PRICE;
        int change = money % AMERICANO_PRICE;

        return new int[]{cups, change};
    }
}
