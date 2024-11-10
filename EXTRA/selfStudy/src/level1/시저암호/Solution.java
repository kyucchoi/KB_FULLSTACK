package level1.시저암호;

public class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            // 공백인 경우 그대로 추가
            if (ch == ' ') {
                result.append(ch);
                continue;
            }

            // 문자의 기준점 설정 (대문자: 'A', 소문자: 'a')
            char base = Character.isUpperCase(ch) ? 'A' : 'a';

            // n만큼 밀기 + 26으로 나눈 나머지 연산으로 알파벳 순환
            char shifted = (char) (base + (ch - base + n) % 26);

            result.append(shifted);
        }

        return result.toString();
    }
}
