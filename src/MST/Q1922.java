package MST;

// 네트워크 연결

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1922 {
    /*
    public static int N;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if (start == end) continue;
            int cost = Integer.parseInt(st.nextToken());
            queue.add(new Pair(start, end, cost));
        }
        parents = new int[N+1];
        for (int i=1; i<N+1; ++i) parents[i] = i;
        getMST(queue);
    }

    public static void getMST(PriorityQueue<Pair> queue) {
        int answer = 0;
        int count = N;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (union(p.start, p.end)) {
                --count;
                answer += p.cost;
                if (count == 1) {
                    System.out.println(answer);
                    return;
                }
            }
        }
    }

    public static boolean union(int start, int end) {
        int parent1 = find(start);
        int parent2 = find(end);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;
    }

    public static int find(int node) {
        if (parents[node] == node) return node;
        else return parents[node] = find(parents[node]);
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
    public int compareTo(Pair p) {
        return this.cost - p.cost;
    }
}
 */
