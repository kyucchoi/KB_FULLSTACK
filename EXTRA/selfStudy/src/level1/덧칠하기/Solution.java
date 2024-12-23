package level1.덧칠하기;

public class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;      // 페인트칠 횟수
        int lastPainted = 0;  // 마지막으로 칠한 위치

        for (int pos : section) {
            // 현재 위치가 마지막으로 칠한 범위를 벗어난 경우
            if (pos > lastPainted) {
                count++;
                // 현재 위치부터 롤러 길이만큼 칠함
                lastPainted = pos + m - 1;
            }
        }

        return count;
    }
}
