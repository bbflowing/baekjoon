package MST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 최소 스패닝 트리

public class Q1197 {
    /*
    public static int V;
    public static PriorityQueue<Node> queue;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        queue = new PriorityQueue<>();
        for (int i=0; i<E; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            queue.add(new Node(start, end, cost));
        }
        parents = new int[V+1];
        for (int i=1; i<V+1; ++i) parents[i] = i;
        System.out.println(getMST());
    }

    public static int getMST() {
        int count = V;
        int cost = 0;
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (union(cur.start, cur.end)) {
                cost += cur.cost;
                --count;
            }
            if (count == 1) return cost;
        }
        return -1;
    }

    public static int find(int node) {
        if (parents[node] == node) return node;
        else return parents[node] = find(parents[node]);
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
class Node implements Comparable<Node>{
    int start, end, cost;

    Node (int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo (Node n) {
        if (this.cost > n.cost) return 1;
        else return -1;
    }
}
 */