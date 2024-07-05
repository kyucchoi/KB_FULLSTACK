package study240705.두큐합같게만들기;

import java.util.ArrayDeque;
import java.util.Queue;

public class SolutionAnswer {
    public int solution(int[] queue1, int[] queue2) {
        int n = queue1.length;
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        int q1Sum = 0;
        int q2Sum = 0;

        for (int value : queue1) {
            q1.add(value);
            q1Sum += value;
        }

        for (int value : queue2) {
            q2.add(value);
            q2Sum += value;
        }

        for (int i = 0; i < 4 * n; i++) {
            if (q1Sum > q2Sum) {
                int value = q1.remove();
                q2.add(value);
                q1Sum -= value;
                q2Sum += value;
            } else if (q1Sum < q2Sum) {
                int value = q2.remove();
                q1.add(value);
                q1Sum += value;
                q2Sum -= value;
            } else {
                return i;
            }
        }

        return -1;
    }
}
