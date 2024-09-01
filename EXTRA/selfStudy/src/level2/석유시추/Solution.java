package level2.석유시추;

import java.util.*;

public class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int solution(int[][] land) {
        int n = land.length;
        int m = land[0].length;
        boolean[][] visited = new boolean[n][m];
        int[] oilPerColumn = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    bfs(land, visited, i, j, oilPerColumn);
                }
            }
        }

        int maxOil = 0;

        for (int oil : oilPerColumn) {
            maxOil = Math.max(maxOil, oil);
        }

        return maxOil;
    }

    private void bfs(int[][] land, boolean[][] visited, int x, int y, int[] oilPerColumn) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        int size = 0;
        int minCol = y, maxCol = y;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            size++;
            minCol = Math.min(minCol, curr[1]);
            maxCol = Math.max(maxCol, curr[1]);

            for (int i = 0; i < 4; i++) {
                int nx = curr[0] + dx[i];
                int ny = curr[1] + dy[i];

                if (nx >= 0 && nx < land.length && ny >= 0 && ny < land[0].length
                        && land[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }

        for (int col = minCol; col <= maxCol; col++) {
            oilPerColumn[col] += size;
        }
    }
}
