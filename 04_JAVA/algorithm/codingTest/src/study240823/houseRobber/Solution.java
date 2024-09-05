package study240823.houseRobber;

import java.util.*;

public class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        int n = nums.length;
        Map<Integer, Integer> memo = new HashMap<>();

        return dp(n - 1, nums, memo);
    }

    public int dp(int n, int[] nums, Map<Integer, Integer> memo) {
        // base case
        if (n == 0) return nums[0];
        if (n == 1) return Math.max(nums[0], nums[1]);

        if (!memo.containsKey(n)) {
            memo.put(n, Math.max(dp(n - 1, nums, memo), dp(n - 2, nums, memo) + nums[n]));
        }

        return memo.get(n);
    }
}
