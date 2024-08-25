package study240823.coinChange;

import java.util.*;

public class Solution {
    public int solution(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        int answer = dp(coins, amount, memo);
        
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    public int dp(int[] coins, int amount, int[] memo) {
        int result = Integer.MAX_VALUE;

        if (amount == 0) return 0;

        for (int coin : coins) {
            if (amount - coin >= 0) {
                if (memo[amount - coin] == Integer.MAX_VALUE) {
                    memo[amount - coin] = dp(coins, amount - coin, memo);
                }

                result = Math.min(result, memo[amount - coin]);
            }
        }

        return result == Integer.MAX_VALUE ? result : result + 1;
    }
}
