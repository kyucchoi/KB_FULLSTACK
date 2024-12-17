package level0.n개간격의원소들;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        // 결과 배열의 크기 계산
        int resultSize = (num_list.length + n - 1) / n;
        int[] result = new int[resultSize];

        // n개 간격으로 원소 선택
        int idx = 0;
        for (int i = 0; i < num_list.length; i += n) {
            result[idx++] = num_list[i];
        }

        return result;
    }
}
