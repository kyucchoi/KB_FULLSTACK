package level0.약수구하기;

import java.util.*;

public class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);

                if (i != n/i) {
                    divisors.add(n/i);
                }
            }
        }

        Collections.sort(divisors);
        return divisors.stream().mapToInt(Integer::intValue).toArray();
    }
}
