package level0.두수의연산값비교하기;

public class Solution {
    public int solution(int a, int b) {
        // a ⊕ b 계산
        String concat = String.valueOf(a) + String.valueOf(b);
        int concatNum = Integer.parseInt(concat);

        // 2 * a * b 계산
        int multiply = 2 * a * b;

        // 두 값 중 더 큰 값 반환 (같으면 concatNum 반환)
        return Math.max(concatNum, multiply);
    }
}
