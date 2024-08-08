package level2.타겟넘버;

public class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, target, 0);
    }

    int dfs(int[] numbers, int index, int target, int cur) {
        if (numbers.length == index) {
            return (target == cur) ? 1 : 0;
        }

        int sum = 0;

        sum += dfs(numbers, index + 1, target, cur + numbers[index]);
        sum += dfs(numbers, index + 1, target, cur - numbers[index]);

        return sum;
    }
}
