package level0.개미군단;

public class Solution {
    public int solution(int hp) {
        int count = 0;

        // 장군개미(5)
        count += hp / 5;
        hp %= 5;

        // 병정개미(3)
        count += hp / 3;
        hp %= 3;

        // 일개미(1)
        count += hp;

        return count;
    }
}
