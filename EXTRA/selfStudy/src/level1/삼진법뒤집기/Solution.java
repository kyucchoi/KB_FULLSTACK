package level1.삼진법뒤집기;

public class Solution {
    public int solution(int n) {
        String ternary = "";
        while (n > 0) {
            ternary = (n % 3) + ternary;
            n /= 3;
        }

        String reversed = new StringBuilder(ternary).reverse().toString();

        int answer = 0;
        int power = 0;

        for (int i = reversed.length() - 1; i >= 0; i--) {
            answer += (reversed.charAt(i) - '0') * Math.pow(3, power);
            power++;
        }

        return answer;
    }
}
