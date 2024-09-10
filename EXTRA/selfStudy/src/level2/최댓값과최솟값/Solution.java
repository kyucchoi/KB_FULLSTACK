package level2.최댓값과최솟값;

import java.util.*;

public class Solution {
    public String solution(String s) {
        int[] numbers = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        return min + " " + max;
    }
}
