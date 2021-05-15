package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q11779 {
    /*
    public static int N;
    public static ArrayList<ArrayList<Pair>> list;
    public static ArrayList<Integer> result;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for (int i=0; i<=N; ++i) list.add(new ArrayList<>());
        StringTokenizer st;
        int start = 0;
        int dst = 0;
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            dst = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.get(start).add(new Pair(dst, cost));
        }
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        dst = Integer.parseInt(st.nextToken());
        result = new ArrayList<>();
        System.out.println(solve(start, dst));
        System.out.println(result.size());
        String answer = "";
        for (int i=result.size()-1; 0<=i; --i) answer += result.get(i)+" ";
        System.out.println(answer);
    }

    public static long solve(int start, int dst) {
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        long[] distance = new long[N+1];
        int[] route = new int[N+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;
        route[start] = 0;
        queue.add(new Pair(start, 0));

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            for (int i=0; i<list.get(p.dst).size(); ++i) {
                Pair next = list.get(p.dst).get(i);
                if (next.cost + p.cost < distance[next.dst]) {
                    distance[next.dst] = next.cost + p.cost;
                    queue.add(new Pair(next.dst, next.cost + p.cost));
                    route[next.dst] = p.dst;
                }
            }
        }
        int node = dst;
        while (node != 0) {
            result.add(node);
            node = route[node];
        }
        return distance[dst];
    }
     */
}

/*
class Pair implements Comparable<Pair> {
    int dst, cost;

    Pair(int dst, int cost) {
        this.dst = dst;
        this.cost = cost;
    }

    @Override
    public int compareTo(Pair p) {
        return this.cost - p.cost;
    }
}
 */
