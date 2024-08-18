package study240816.pathWithMaximumProbability;

import java.util.*;

public class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        double[] probability = new double[n];

        for (int i = 0; i < edges.length; i++) {
            graph.putIfAbsent(edges[i][0], new ArrayList<>());
            graph.putIfAbsent(edges[i][1], new ArrayList<>());
            graph.get(edges[i][0]).add(new Edge(edges[i][1], succProb[i]));
            graph.get(edges[i][1]).add(new Edge(edges[i][0], succProb[i]));
        }
        Queue<Entry> pq = new PriorityQueue<>();
        pq.add(new Entry(start_node, 1.0));
        probability[start_node] = 1.0;
        while (!pq.isEmpty()) {
            Entry cur = pq.remove();
            if (probability[cur.node] > cur.prob) continue;
            if (!graph.containsKey(cur.node)) continue;

            for (Edge edge : graph.get(cur.node)) {
                double nextProb = cur.prob * edge.weight;
                if (probability[edge.node] < nextProb) {
                    probability[edge.node] = nextProb;
                    pq.add(new Entry(edge.node, nextProb));
                }
            }
        }

        return probability[end_node];
    }

    static class Edge {
        int node;
        double weight;

        public Edge(int node, double weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    static class Entry implements Comparable<Entry> {
        int node;
        double prob;

        public Entry(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }

        public int compareTo(Entry o) {
            return (o.prob == this.prob) ? 0
                    : ((o.prob < this.prob) ? -1 : 1);
        }
    }
}
