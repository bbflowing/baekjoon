package MST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q10423 {
    /*
    public static int N, count;
    public static int[] costs;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        parents = new int[N + 1];
        for (int i = 1; i < N + 1; ++i) parents[i] = i;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; ++i) parents[Integer.parseInt(st.nextToken())] = -1;
        PriorityQueue<Pipe> pipes = new PriorityQueue<>();
        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            pipes.add(new Pipe(start, end, cost));
        }
        int count = K;
        getMST(pipes);
    }

    public static void getMST(PriorityQueue<Pipe> pipes) {
        int total = 0;
        while (!pipes.isEmpty()) {
            Pipe p = pipes.poll();
            if (union(p.start, p.dst)) {
                total += p.cost;
                if (connected()) {
                    System.out.println(total);
                    break;
                }
            }
        }
    }

    public static boolean connected() {
        for (int i=1; i<=N; ++i) {
            if (find(i) != -1) return false;
        }
        return true;
    }

    public static boolean union(int building1, int building2) {
        int parent1 = find(building1);
        int parent2 = find(building2);

        if (parent1 != parent2) {
            if (parent1 == -1) parents[parent2] = parent1;
            else if (parent2 == -1) parents[parent1] = parent2;
            else if (parent1 < parent2) parents[parent2] = parent1;
            else if (parent2 < parent1) parents[parent1] = parent2;
            return true;
        }
        return false;
    }

    public static int find(int building) {
        if (parents[building] == -1) return -1;
        else if (parents[building] == building) return building;
        return parents[building] = find(parents[building]);
    }
     */
}

/*
class Pipe implements Comparable<Pipe> {
    int start, dst, cost;

    Pipe(int start, int dst, int cost) {
        this.start = start;
        this.dst = dst;
        this.cost = cost;
    }

    @Override
    public int compareTo(Pipe p) {
        return this.cost - p.cost;
    }
}
 */
