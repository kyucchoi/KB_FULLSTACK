package level0.카운트다운;

public class Solution {
    public int[] solution(int start_num, int end_num) {
        int size = start_num - end_num + 1;
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = start_num - i;
        }

        return result;
    }
}
