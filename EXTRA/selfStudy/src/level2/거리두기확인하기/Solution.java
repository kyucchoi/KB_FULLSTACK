package level2.거리두기확인하기;

import java.util.*;

public class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        //✅ 각 대기실 별로 거리두기 준수 여부를 확인한다.
        for (int i = 0; i < answer.length; i++) {
            //✅ 현재 대기실이 거리두기 규칙을 준수했다면 1을 추가하고, 아니라면 0을 추가한다.
            if (check(places[i])) answer[i] = 1;
        }

        return answer;
    }

    boolean check(String[] place) {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                //✅ 현재 위치가 응시자 위치 P일 때, BFS를 수행한다.
                if (place[r].charAt(c) == 'P') {
                    //✅ BFS 완료 후, False가 반환됐다면, 즉시 False를 반환한다.
                    if (!bfs(r, c, place)) return false;
                }
            }
        }
        //✅ 대기실의 모든 위치에서 거리두기 규칙을 준수했다면, True를 반환한다.
        return true;
    }

    boolean bfs(int r, int c, String[] place) {
        final int[] dr = {0, 1, 0, -1};
        final int[] dc = {1, 0, -1, 0};
        boolean[][] visited = new boolean[5][5];
        Queue<int[]> queue = new ArrayDeque<>();
        //✅ 응시자 위치의 맨해튼 거리를 0으로 초기화하여 큐에 넣고, 방문 표시를 한다.
        queue.add(new int[]{r, c, 0});
        visited[r][c] = true;

        //✅ 큐가 빌 때까지 반복문을 수행한다.
        while (!queue.isEmpty()) {
            int[] cur = queue.remove();
            		//✅상하좌우 방향으로 다음 위치를 구하고, 맨해튼 거리를 1 증가시킨다.
            for (int i = 0; i < 4; i++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];
                int ndist = cur[2] + 1;
                //✅ 다음 위치가 범위 내에 존재하고, 파티션이 아니며, 방문하지 않았을 때, 다음 코드를 수행한다.
                if (inRange(nr, nc) && place[nr].charAt(nc) != 'X' && !visited[nr][nc]) {
                    //✅ 맨해튼 거리가 2보다 크다면, 아래의 과정을 생략한다.
                    if (ndist > 2) continue;
                    //✅ 다음 위치의 맨해튼 거리가 2 이하인데, 응시자가 있다면,
                    //✅ 거리두기를 준수하지 않았기 때문에 False를 반환한다.
                    if (place[nr].charAt(nc) == 'P') return false;
                    //✅ 아니라면, 다음 위치와 맨해튼 거리를 큐에 추가한다.
                    queue.add(new int[]{nr, nc, ndist});
                    //✅ 다음 위치를 방문 표시한다.
                    visited[nr][nc] = true;
                }
            }
        }

        //✅ BFS를 완료했다면, 거리두기를 준수했기 때문에 True를 반환한다.
        return true;
    }

    boolean inRange(int r, int c) {
        return (r >= 0) && (r < 5) && (c >= 0) && (c < 5);
    }
}
