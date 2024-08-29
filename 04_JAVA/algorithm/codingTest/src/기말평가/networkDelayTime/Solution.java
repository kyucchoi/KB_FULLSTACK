package 기말평가.networkDelayTime;

import java.util.Arrays;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] distances = new int[n + 1];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[k] = 0;

        for (int i = 0; i < n; i++) {
            for (int[] time : times) {
                int source = time[0];
                int target = time[1];
                int weight = time[2];

                if (distances[source] != Integer.MAX_VALUE &&
                        distances[source] + weight < distances[target]) {
                    distances[target] = distances[source] + weight;
                }
            }
        }

        int maxTime = 0;
        
        for (int i = 1; i <= n; i++) {
            if (distances[i] == Integer.MAX_VALUE) return -1;
            maxTime = Math.max(maxTime, distances[i]);
        }

        return maxTime;
    }
}
