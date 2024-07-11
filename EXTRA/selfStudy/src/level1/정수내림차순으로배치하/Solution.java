package level1.정수내림차순으로배치하;

import java.util.Arrays;

public class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return Long.parseLong(sb.reverse().toString());
    }
}
