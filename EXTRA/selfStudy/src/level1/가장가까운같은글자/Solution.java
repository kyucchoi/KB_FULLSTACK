package level1.가장가까운같은글자;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        // 각 알파벳의 마지막 등장 위치를 저장할 배열
        // 영어 소문자 26개에 대해 초기값 -1
        int[] lastPosition = new int[26];

        for (int i = 0; i < 26; i++) {
            lastPosition[i] = -1;
        }

        // 문자열의 각 위치를 순회
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int charIndex = currentChar - 'a';  // 현재 문자의 인덱스 (0-25)

            // 이전에 나온 적이 없는 경우
            if (lastPosition[charIndex] == -1) {
                answer[i] = -1;
            } else {
                // 현재 위치와 마지막 등장 위치의 차이를 저장
                answer[i] = i - lastPosition[charIndex];
            }

            // 현재 문자의 위치를 lastPosition에 업데이트
            lastPosition[charIndex] = i;
        }

        return answer;
    }
}
