package level1.폰켓몬;

import java.util.*;

public class Solution {
    public int solution(int[] nums) {
        Set<Integer> uniqueTypes = new HashSet<>();

        for (int num : nums) {
            uniqueTypes.add(num);
        }

        return Math.min(nums.length / 2, uniqueTypes.size());
    }
}
