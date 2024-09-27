package level0.특정문자제거하기;

public class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder result = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (c != letter.charAt(0)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
