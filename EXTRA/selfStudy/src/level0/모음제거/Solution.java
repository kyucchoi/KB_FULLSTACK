package level0.모음제거;

public class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiou";

        for (char c : my_string.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
