package level2.jadenCase문자열만들기;

public class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean isNewWord = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                isNewWord = true;
            } else if (isNewWord) {
                result.append(Character.toUpperCase(c));
                isNewWord = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }
}
