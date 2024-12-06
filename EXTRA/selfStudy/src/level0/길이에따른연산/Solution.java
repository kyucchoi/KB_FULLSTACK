package level0.길이에따른연산;

public class Solution {
    public int solution(int[] num_list) {
        if (num_list.length >= 11) {
            // 리스트 길이가 11 이상이면 합 계산
            int sum = 0;

            for (int num : num_list) {
                sum += num;
            }
            return sum;
        } else {
            // 리스트 길이가 10 이하이면 곱 계산
            int product = 1;

            for (int num : num_list) {
                product *= num;
            }

            return product;
        }
    }
}
