package level1.추억점수;

import java.util.*;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> scoreMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        // 각 사진별 추억 점수 계산
        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            int score = 0;

            for (String person : photo[i]) {
                // getOrDefault를 사용하여 점수가 없는 경우 0을 반환
                score += scoreMap.getOrDefault(person, 0);
            }

            answer[i] = score;
        }

        return answer;
    }
}
