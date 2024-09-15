package level1.같은숫자는싫어;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> tempList = new ArrayList<>();

        // 첫 번째 원소 추가
        tempList.add(arr[0]);

        // 나머지 원소들 처리
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                tempList.add(arr[i]);
            }
        }

        // ArrayList를 배열로 변환
        int[] answer = new int[tempList.size()];
        
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }

        return answer;
    }
}
