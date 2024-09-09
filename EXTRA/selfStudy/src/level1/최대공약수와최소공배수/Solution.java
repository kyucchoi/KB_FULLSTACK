package level1.최대공약수와최소공배수;

public class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n, m);
        int lcm = (n * m) / gcd;  // n * (m / gcd)와 동일하지만, 이 방식이 더 명확합니다.

        return new int[]{gcd, lcm};
    }

    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
