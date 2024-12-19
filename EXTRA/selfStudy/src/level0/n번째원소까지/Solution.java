package level0.n번째원소까지;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = num_list[i];
        }

        return result;
    }
}
