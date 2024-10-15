package level0.짝수는싫어요;

import java.util.*;

public class Solution {
    public int[] solution(int n) {
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 1; i <= n; i += 2) {
            oddNumbers.add(i);
        }

        return oddNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
