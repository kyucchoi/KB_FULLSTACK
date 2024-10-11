package level0.중복된숫자개수;

public class Solution {
    public int solution(int[] array, int n) {
        int count = 0;

        for (int num : array) {
            if (num == n) {
                count++;
            }
        }

        return count;
    }
}
