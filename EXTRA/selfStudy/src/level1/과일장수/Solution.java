package level1.과일장수;

import java.util.*;

public class Solution {
    public int solution(int k, int m, int[] score) {
        // 점수를 내림차순으로 정렬
        Arrays.sort(score);

        int totalProfit = 0;
        int length = score.length;

        // 뒤에서부터 m개씩 묶어서 상자 만들기
        for (int i = length - m; i >= 0; i -= m) {
            // m개씩 묶었을 때의 최소값(상자의 가격 결정)은 i번째 값
            totalProfit += score[i] * m;
        }

        return totalProfit;
    }
}
