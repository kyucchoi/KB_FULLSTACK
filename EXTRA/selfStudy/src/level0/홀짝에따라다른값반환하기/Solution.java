package level0.홀짝에따라다른값반환하기;

public class Solution {
    public int solution(int n) {
        int sum = 0;

        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        } else {
            for (int i = 2; i <= n; i += 2) {
                sum += i * i;
            }
        }

        return sum;
    }
}
