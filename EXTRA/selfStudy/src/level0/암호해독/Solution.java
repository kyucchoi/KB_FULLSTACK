package level0.암호해독;

public class Solution {
    public String solution(String cipher, int code) {
        StringBuilder result = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            result.append(cipher.charAt(i));
        }

        return result.toString();
    }
}
