package study240705.유효한괄호;

import java.util.ArrayDeque;
import java.util.Deque;

public class SolutionAnswer {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        answer = stack.isEmpty();
        return answer;
    }
}
