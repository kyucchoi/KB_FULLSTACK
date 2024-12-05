package level0.이어붙인수;

public class Solution {
    public int solution(int[] num_list) {
        StringBuilder odds = new StringBuilder();
        StringBuilder evens = new StringBuilder();

        // 홀수와 짝수를 각각 분리하여 문자열로 이어붙임
        for (int num : num_list) {
            if (num % 2 == 0) {
                evens.append(num);
            } else {
                odds.append(num);
            }
        }

        // 문자열을 정수로 변환하여 더함
        return Integer.parseInt(odds.toString()) +
                Integer.parseInt(evens.toString());
    }
}
