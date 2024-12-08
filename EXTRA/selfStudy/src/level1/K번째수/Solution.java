package level1.K번째수;

import java.util.*;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];

            // 배열 자르기
            int[] temp = new int[j - i + 1];
            for (int t = 0; t < temp.length; t++) {
                temp[t] = array[i - 1 + t];
            }

            // 정렬
            Arrays.sort(temp);

            // k번째 수 저장
            answer[idx] = temp[k - 1];
        }

        return answer;
    }
}
