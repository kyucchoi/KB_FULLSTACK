package level0.조건에맞게수열변환하기1;

public class Solution {
    public int[] solution(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                // 50 이상의 짝수는 2로 나눔
                result[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                // 50 미만의 홀수는 2를 곱함
                result[i] = arr[i] * 2;
            } else {
                // 나머지는 그대로 유지
                result[i] = arr[i];
            }
        }

        return result;
    }
}
