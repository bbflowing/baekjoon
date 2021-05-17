package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1647 {
    /*
    public static int N;
    public static int[] parents;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        parents = new int[N+1];
        for (int i=1; i<N+1; ++i) parents[i] = i;
        int M = Integer.parseInt(st.nextToken());
        PriorityQueue<Pair> queue = new PriorityQueue<>(M);
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            queue.add(new Pair(start, end, cost));
        }
        System.out.println(getMST(queue));
    }

    public static int getMST(PriorityQueue<Pair> queue) {
        int total = 0;
        int max = -1;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (union(p.start, p.end)) {
                total += p.cost;
                max = Math.max(max, p.cost);
            }
        }
        total -= max;
        return total;
    }

    public static int find(int house) {
        if (parents[house] == house) return house;
        return parents[house] = find(parents[house]);
    }

    public static boolean union(int start, int end) {
        int parent1 = find(start);
        int parent2 = find(end);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;
    }
     */
}

/*
class Pair implements Comparable<Pair> {
    int start, end, cost;

    Pair (int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo (Pair p) {
        return this.cost - p.cost;
    }
}
 */

