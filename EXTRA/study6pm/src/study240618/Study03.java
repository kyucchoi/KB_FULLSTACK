package study240618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Study03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }
//        System.out.println(stack);

        int first = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            int a = stack.pop();

            if (a > first) {
                first = a;
                result += 1;
            }
        }
            System.out.println(result);
    }
}
