package study240705.주식가격;

import java.util.*;

public class SolutionAnswer {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty()) {
                int j = stack.peek();
                if (prices[j] > prices[i]) {
                    stack.pop();
                } else break;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int i = stack.pop();
            answer[i] = prices.length - i - 1;
        }

        return answer;
    }
}