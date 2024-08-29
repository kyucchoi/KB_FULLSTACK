package 기말평가.네트워크;

public class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, visited, i);
                answer++;
            }
        }

        return answer;
    }

    private void dfs(int[][] computers, boolean[] visited, int i) {
        visited[i] = true;

        for (int j = 0; j < computers.length; j++) {
            if (computers[i][j] == 1 && !visited[j]) {
                dfs(computers, visited, j);
            }
        }
    }
}