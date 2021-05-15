package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1238 {
    /*
    public static int N;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Pair>> list = new ArrayList<>(N+1);
        ArrayList<ArrayList<Pair>> reverse = new ArrayList<>(N+1);
        for (int i=0; i<=N; ++i) {
            list.add(new ArrayList<>());
            reverse.add(new ArrayList<>());
        }
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            list.get(start).add(new Pair(end, time));
            reverse.get(end).add(new Pair(start, time));
        }
        int[] come = solve(X, list);
        int[] go = solve(X, reverse);
        int max = 0;
        for (int i=1; i<=N; ++i) {
            if (i != X) max = Math.max(come[i]+go[i], max);
        }
        System.out.println(max);
    }

    public static int[] solve(int start, ArrayList<ArrayList<Pair>> list) {
        int[] dp = new int[N+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[start] = 0;
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        for (int i=0; i<list.get(start).size(); ++i) {
            Pair target = list.get(start).get(i);
            dp[target.dst] = target.time;
            queue.add(target);
        }

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            for (int i=0; i<list.get(p.dst).size(); ++i) {
                Pair next = list.get(p.dst).get(i);
                if (p.time + next.time < dp[next.dst]) {
                    dp[next.dst] = p.time+next.time;
                    queue.add(new Pair(next.dst, p.time+next.time));
                }
            }
        }
        return dp;
    }
     */
}

/*
class Pair implements Comparable<Pair> {
    int dst, time;

    Pair (int dst, int time) {
        this.dst = dst;
        this.time = time;
    }

    @Override
    public int compareTo(Pair p) {
        return this.time - p.time;
    }
}
 */