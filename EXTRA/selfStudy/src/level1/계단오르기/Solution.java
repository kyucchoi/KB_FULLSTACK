package level1.계단오르기;

public class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int prev = 1, curr = 2;

        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}
