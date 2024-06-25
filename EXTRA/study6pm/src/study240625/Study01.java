package study240625;

import java.util.Stack;

public class Study01 {
    static int N, M, count;
    static StringBuilder sb = new StringBuilder();
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        // 입력값 선언
        N = 7;
        M = 6;
        int[][] input = {
                {1, 2},
                {2, 3},
                {1, 5},
                {5, 2},
                {5, 6},
                {4, 7}
        };

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int a = input[i][0];
            int b = input[i][1];
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        // 입력구간종료


        // dfs 파트

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (!visited[top]) {
                visited[top] = true;

                System.out.println(top);

                for (int i = N; i >= 1; i--) {
                    if (graph[top][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
    }

    public static void dfs(int start) {
        if (!visited[start])
            visited[start] = true;

        for (int i = 1; i <= N; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}
