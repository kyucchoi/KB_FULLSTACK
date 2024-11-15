package level1.콜라문제;

public class Solution {
    public int solution(int a, int b, int n) {
        int totalCola = 0;

        while (n >= a) {
            // 교환 가능한 콜라 수 계산
            int exchangeCount = (n / a) * b;
            // 남은 병 수 계산
            n = n % a + exchangeCount;
            // 받은 콜라 누적
            totalCola += exchangeCount;
        }

        return totalCola;
    }
}
