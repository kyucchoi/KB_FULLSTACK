package level0.최댓값만들기1;

import java.util.*;

public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;

        return numbers[length - 1] * numbers[length - 2];
    }
}
