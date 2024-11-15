package level1.명예의전당1;

import java.util.*;

public class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            // 현재 점수를 명예의 전당에 추가
            hallOfFame.offer(score[i]);

            // k개 이상이면 가장 낮은 점수 제거
            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }

            // 현재 명예의 전당의 최하위 점수 저장
            answer[i] = hallOfFame.peek();
        }

        return answer;
    }
}
