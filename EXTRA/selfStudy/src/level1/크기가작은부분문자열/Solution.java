package level1.크기가작은부분문자열;

public class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int pLength = p.length();

        for (int i = 0; i <= t.length() - pLength; i++) {
            String substring = t.substring(i, i + pLength);

            if (substring.compareTo(p) <= 0) {
                count++;
            }
        }

        return count;
    }
}
