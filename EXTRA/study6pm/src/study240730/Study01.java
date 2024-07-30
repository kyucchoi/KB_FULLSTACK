package study240730;

import java.util.ArrayDeque;
import java.util.Deque;

public class Study01 {
    public int solution(String[] maps) {
        int answer = 0;
        int N = maps.length;
        int M = maps[0].length();
        boolean[][] visited = new boolean[N][M];
        int[][] route = new int[N][M]; // 최단거리용 route
        int startX = 0, startY = 0, targetX = 0, targetY = 0, leverX = 0, leverY = 0;
        // start = 출발, target = 최종 목적지, lever = 레버

        // 시작점, 레버, 종료 지점 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 시작점 = S
                if (maps[i].charAt(j) == 'S') {
                    startX = j;
                    startY = i;
                }

                // 레버 위치 = L
                else if (maps[i].charAt(j) == 'L') {
                    leverX = j;
                    leverY = i;
                }

                // 종료 지점 = E
                else if (maps[i].charAt(j) == 'E') {
                    targetX = j;
                    targetY = i;
                }
            }
        }

        bfs(maps, visited, route, startX, startY, 0);
        if (!visited[leverY][leverX]) {
            return -1;
        }

        visited = new boolean[N][M];
        bfs(maps, visited, route, leverX, leverY, route[leverY][leverX]);

        if (!visited[targetY][targetX]) {
            return -1;
        }

        return route[targetY][targetX];
    }

    public void bfs(String[] maps, boolean[][] visited, int[][] route, int x, int y, int init) {
        int[] xrr = {1, -1, 0, 0};
        int[] yrr = {0, 0, 1, -1};

        // 가로 세로의 길이 정의
        int M = maps.length; // 세로
        int N = maps[0].length(); // 가로

        // bfs를 사용할거니 큐를 사용할 것
        Deque<int[]> q = new ArrayDeque<>();

        q.offer(new int[]{x, y});
        visited[y][x] = true;
        route[y][x] = init;

        while (!q.isEmpty()) {
            int[] top = q.poll(); // 큐 제일 맨 앞의 값 poll

            for (int i = 0; i < 4; i++) {  // 상하좌우 탐색
                int dx = top[0] + xrr[i];
                int dy = top[1] + yrr[i];

                if (dx >= 0 && dx < N && dy < M && dy >= 0 && !visited[dy][dx] // 이동한 거리가 배열범위 안에 있고 방문하지 않았으며, 막혀있지 않다면
                        && maps[dy].charAt(dx) != 'X') {
                    visited[dy][dx] = true; //방문 표시
                    route[dy][dx] = route[top[1]][top[0]] + 1; //거리값 갱신, 한칸이동이므로 +1
                    q.offer(new int[]{dx, dy}); //큐에 넣어줌
                }
            }
        }
    }
}
