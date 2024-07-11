package level1.없는숫자더하기;

public class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }

        return sum;
    }
}
