package study240823.climbingStairs;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int[] memo = new int[n + 1];
        int answer = 0;

        Arrays.fill(memo, -1);
        memo[1] = 1;
        memo[2] = 2;
        answer = dp(n, memo);

        return answer;
    }

    public int dp(int n, int[] memo) {
        if (memo[n] == -1) {
            memo[n] = dp(n - 1, memo) + dp(n - 2, memo);
        }
        
        return memo[n];
    }
}
