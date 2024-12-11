package level1.기사단원의무기;

public class Solution {
    public int solution(int number, int limit, int power) {
        int totalIron = 0;

        // 1부터 number까지 각 기사의 무기 공격력(약수 개수) 계산
        for (int knight = 1; knight <= number; knight++) {
            int divisorCount = countDivisors(knight);

            // 제한수치를 초과하면 power를, 아니면 약수 개수를 사용
            totalIron += (divisorCount > limit) ? power : divisorCount;
        }

        return totalIron;
    }

    // 약수의 개수를 계산하는 최적화된 함수
    private int countDivisors(int num) {
        int count = 0;
        int sqrt = (int) Math.sqrt(num);

        // 제곱근까지만 반복하여 약수 계산
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                count++;
                // i가 제곱근이 아닌 경우, 대칭되는 약수도 카운트
                if (i != num / i) {
                    count++;
                }
            }
        }

        return count;
    }
}
