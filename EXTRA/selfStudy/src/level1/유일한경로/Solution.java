package level1.유일한경로;

public class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];

        // 첫 번째 행 초기화
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // 나머지 행 계산
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return dp[n - 1];
    }
}
