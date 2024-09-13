package level2.숫자의표현;

public class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i % 2 == 1) count++;

                if (n / i != i && (n / i) % 2 == 1) count++;
            }
        }

        return count;
    }
}
