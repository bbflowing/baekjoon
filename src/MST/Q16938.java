package MST;

// 행성 연결

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q16938 {
    /*
    public static int N;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        if (N==1) {
            System.out.println(0);
            System.exit(0);
        }
        StringTokenizer st;
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                int cost = Integer.parseInt(st.nextToken());
                if (i < j) queue.add(new Pair(i, j, cost));
            }
        }
        parents = new int[N+1];
        for (int i=1; i<N+1; ++i) parents[i] = i;
        System.out.println(getMST(queue));
    }

    public static long getMST(PriorityQueue<Pair> queue) {
        long total = 0;
        int count = N;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (union(p.start, p.end)) {
                total += p.cost;
                --count;
                if (count == 1) {
                    return total;
                }
            }
        }
        return total;
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
