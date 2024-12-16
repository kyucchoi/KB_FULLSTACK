package level0.홀수vs짝수;

public class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0; // 홀수 번째 원소들의 합
        int evenSum = 0; // 짝수 번째 원소들의 합

        // 배열을 순회하면서 홀수/짝수 번째 원소들의 합을 각각 계산
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {  // 인덱스가 0부터 시작하므로 인덱스는 홀수 번째와 반대
                oddSum += num_list[i];
            } else {
                evenSum += num_list[i];
            }
        }

        // 두 합 중 큰 값을 반환 (같으면 그 값을 반환)
        return Math.max(oddSum, evenSum);
    }
}
