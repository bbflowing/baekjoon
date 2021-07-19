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
    public static PriorityQueue<Line> queue;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        queue = new PriorityQueue<>();
        StringTokenizer st;
        for (int i=0; i<E; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            queue.add(new Line(start, end, cost));
        }
        parents = new int[N+1];
        for (int i=1; i<N+1; ++i) parents[i] = i;
        System.out.println(getMST());
    }

    public static int getMST() {
        int count = N;
        int cost = 0;

        while (!queue.isEmpty()) {
            Line cur = queue.poll();
            if (union(cur.start, cur.end)) {
                --count;
                cost += cur.cost;
            }
            if (count == 1) return cost;
        }
        return -1;
    }

    public static boolean union(int start, int end) {
        int parent1 = find(start);
        int parent2 = find(end);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;
    }

    public static int find(int computer) {
        if (parents[computer] == computer) return computer;
        else return parents[computer] = find(parents[computer]);
    }
     */
}

/*
class Line implements Comparable<Line>{
    int start, end, cost;

    Line(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo (Line l) {
        if (this.cost > l.cost) return 1;
        else return -1;
    }
}
 */
