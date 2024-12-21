package level0.n번째원소부터;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        // n번째 원소부터 마지막까지의 길이 계산
        int length = num_list.length - (n - 1);
        int[] result = new int[length];

        // n-1은 0-based 인덱스로 변환하기 위함
        for (int i = 0; i < length; i++) {
            result[i] = num_list[i + (n-1)];
        }

        return result;
    }
}
