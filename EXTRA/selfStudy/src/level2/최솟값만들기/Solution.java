package level2.최솟값만들기;

import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int n = A.length;

        // A를 오름차순으로 정렬
        Arrays.sort(A);

        // B를 내림차순으로 정렬
        Arrays.sort(B);

        for (int i = 0; i < n; i++) {
            answer += A[i] * B[n - 1 - i];
        }

        return answer;
    }
}