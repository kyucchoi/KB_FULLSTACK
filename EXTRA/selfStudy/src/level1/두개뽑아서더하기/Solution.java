package level1.두개뽑아서더하기;

import java.util.*;

public class Solution {
    public int[] solution(int[] numbers) {
        // HashSet을 사용하여 중복된 합을 제거
        Set<Integer> sumSet = new HashSet<>();

        // 모든 가능한 두 수의 조합을 확인
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }

        // Set을 배열로 변환
        int[] answer = new int[sumSet.size()];
        int index = 0;

        for (int num : sumSet) {
            answer[index++] = num;
        }

        // 오름차순 정렬
        Arrays.sort(answer);

        return answer;
    }
}
