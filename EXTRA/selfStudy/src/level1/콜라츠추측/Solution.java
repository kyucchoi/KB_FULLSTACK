package level1.콜라츠추측;

public class Solution {
    public int solution(long N) {
        int answer = 0;

        while (N != 1) {
            if (N % 2 == 0) {
                N /= 2;
            } else {
                N = N * 3 + 1;
            } answer++;

            if (answer > 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}