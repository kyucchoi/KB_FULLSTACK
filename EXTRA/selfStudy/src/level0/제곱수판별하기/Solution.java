package level0.제곱수판별하기;

public class Solution {
    public int solution(int n) {
        int sqrtN = (int) Math.sqrt(n);
        return (sqrtN * sqrtN == n) ? 1 : 2;
    }
}
