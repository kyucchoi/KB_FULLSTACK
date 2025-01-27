package level1.최소직사각형;

public class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] card : sizes) {
            int width = Math.max(card[0], card[1]);
            int height = Math.min(card[0], card[1]);

            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        return maxWidth * maxHeight;
    }
}
