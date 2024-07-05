package study240705.유효한괄호;

import java.util.Stack;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // for 반복문을 돌려서 문자 하나하나에 접근한다.
            // 열린 괄호면
                // 스택에 넣어준다
            // 닫힌 괄호면
                // 스택 팝()

        // s.isEmpty()

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    answer = false;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}
