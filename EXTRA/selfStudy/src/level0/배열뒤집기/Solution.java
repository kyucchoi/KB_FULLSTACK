package level0.배열뒤집기;

import java.util.*;

public class Solution {
    public int[] solution(int[] num_list) {
        Integer[] boxed = Arrays.stream(num_list).boxed().toArray(Integer[]::new);
        Collections.reverse(Arrays.asList(boxed));

        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
    }
}
