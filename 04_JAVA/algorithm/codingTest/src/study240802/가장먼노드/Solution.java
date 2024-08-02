package study240802.가장먼노드;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int n, int[][] edge) {
        int maxDepth = 0;
        int answer = 0;
        HashMap<Integer, Set<Integer>> graph = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            graph.put(i, new HashSet<>());
        }

        for (int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        ArrayDeque<Pair> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n + 1];

        queue.add(new Pair(1, 1));
        visited[1] = true;

        while (!queue.isEmpty()) {
            Pair cur = queue.remove();
            int node = cur.node, depth = cur.depth;

            if (depth > maxDepth) {
                maxDepth = depth;
                answer = 0;
            }

            answer++;

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    queue.add(new Pair(neighbor, depth + 1));
                    visited[neighbor] = true;
                }
            }
        }

        return answer;
    }

    class Pair {
        int node;
        int depth;

        public Pair(int node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}
