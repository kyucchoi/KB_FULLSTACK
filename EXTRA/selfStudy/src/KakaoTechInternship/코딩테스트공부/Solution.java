package KakaoTechInternship.코딩테스트공부;

import java.util.*;

class Solution {
    public int solution(int alp, int cop, int[][] problems) {
        // 목표 알고력과 코딩력 찾기
        int maxAlp = alp;
        int maxCop = cop;
        
        for (int[] problem : problems) {
            maxAlp = Math.max(maxAlp, problem[0]);
            maxCop = Math.max(maxCop, problem[1]);
        }

        // 초기 알고력과 코딩력이 이미 목표를 달성한 경우 처리
        alp = Math.min(alp, maxAlp);
        cop = Math.min(cop, maxCop);

        // DP 테이블 초기화
        int[][] dp = new int[maxAlp + 1][maxCop + 1];

        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dp[alp][cop] = 0;

        // DP 테이블 채우기
        for (int i = alp; i <= maxAlp; i++) {
            for (int j = cop; j <= maxCop; j++) {
                if (i < maxAlp) {
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + 1);
                }
                if (j < maxCop) {
                    dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j] + 1);
                }

                for (int[] problem : problems) {
                    int alpReq = problem[0], copReq = problem[1];
                    int alpRwd = problem[2], copRwd = problem[3];
                    int cost = problem[4];

                    if (i >= alpReq && j >= copReq) {
                        int nextAlp = Math.min(maxAlp, i + alpRwd);
                        int nextCop = Math.min(maxCop, j + copRwd);
                        dp[nextAlp][nextCop] = Math.min(dp[nextAlp][nextCop], dp[i][j] + cost);
                    }
                }
            }
        }

        return dp[maxAlp][maxCop];
    }
}