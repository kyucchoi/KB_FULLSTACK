package level0.순서바꾸기;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[num_list.length];
        int index = 0;

        // n번째 이후의 원소들을 먼저 복사
        for (int i = n; i < num_list.length; i++) {
            result[index++] = num_list[i];
        }

        // n번째까지의 원소들을 뒤에 복사
        for (int i = 0; i < n; i++) {
            result[index++] = num_list[i];
        }

        return result;
    }
}
