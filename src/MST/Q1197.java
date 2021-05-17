package MST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 최소 스패닝 트리

public class Q1197 {
    public static int V;
    public static int[] parents;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        for (int i=0; i<E; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            queue.add(new Pair(start, dst, cost));
        }
        parents = new int[V+1];
        for (int i=1; i<V+1; ++i) parents[i] = i;
        getMST(queue);
    }

    public static void getMST(PriorityQueue<Pair> queue) {
        int count = V;
        int answer = 0;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (union(p.start, p.dst)) {
                --count;
                answer += p.cost;
                if (count == 1) {
                    System.out.println(answer);
                    return;
                }
            }
        }
    }

    public static boolean union (int start, int dst) {
        int parent1 = find(start);
        int parent2 = find(dst);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;
    }

    public static int find(int node) {
        if (parents[node] == node) return node;
        else return parents[node] = find(parents[node]);
    }
}

class Pair implements Comparable<Pair> {
    int start, dst, cost;

    Pair (int start, int dst, int cost) {
        this.start = start;
        this.dst = dst;
        this.cost = cost;
    }

    @Override
    public int compareTo (Pair p) {
        return this.cost - p.cost;
    }
}
