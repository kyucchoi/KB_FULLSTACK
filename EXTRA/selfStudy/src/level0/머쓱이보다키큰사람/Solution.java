package level0.머쓱이보다키큰사람;

public class Solution {
    public int solution(int[] array, int height) {
        int count = 0;

        for (int personHeight : array) {
            if (personHeight > height) {
                count++;
            }
        }

        return count;
    }
}
