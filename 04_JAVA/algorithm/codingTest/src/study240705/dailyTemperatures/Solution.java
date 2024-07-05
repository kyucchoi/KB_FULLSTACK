package study240705.dailyTemperatures;

import java.util.Stack;

public class Solution {
    public int[] solution(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<Integer>();

        for (int day = 0; day < temperatures.length; day++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[day]) {
                int prevDay = stack.pop();
                answer[prevDay] = day - prevDay;
            }

            stack.push(day);
        }

        return answer;
    }
}
