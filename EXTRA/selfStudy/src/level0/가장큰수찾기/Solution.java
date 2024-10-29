package level0.가장큰수찾기;

public class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        return new int[]{max, maxIndex};
    }
}
