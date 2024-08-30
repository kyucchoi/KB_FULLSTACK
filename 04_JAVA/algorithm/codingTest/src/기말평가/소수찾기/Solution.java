package 기말평가.소수찾기;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(String numbers) {
        Set<Integer> prime = new HashSet<>();
        p("", numbers, prime);

        return prime.size();
    }

    private void p(String pfix, String str, Set<Integer> prime) {
        int n = str.length();

        if (!prime.equals("")) {
            int number = Integer.parseInt(str);

            if (isPrime(number)) {
                prime.add(number);
            }
        }

        for (int i = 0; i < n; i++) {
            p(pfix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), prime);
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}