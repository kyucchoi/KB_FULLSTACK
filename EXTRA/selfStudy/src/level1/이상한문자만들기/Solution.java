package level1.이상한문자만들기;

public class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        int wordIndex = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                wordIndex = 0;
            } else {
                if (wordIndex % 2 == 0) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                
                wordIndex++;
            }
        }

        return result.toString();
    }
}
