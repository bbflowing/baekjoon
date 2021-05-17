package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q13905 {
    /*
    public static int N;
    public static ArrayList<ArrayList<Pair>> bridges;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        bridges = new ArrayList<>();
        for (int i = 0; i < N + 1; ++i) bridges.add(new ArrayList<>());
        st = new StringTokenizer(br.readLine());
        int begin = Integer.parseInt(st.nextToken());
        int dst = Integer.parseInt(st.nextToken());
        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            bridges.get(start).add(new Pair(end, cost));
            bridges.get(end).add(new Pair(start, cost));
        }
        dijkstra(begin, dst);
    }

    public static void dijkstra(int begin, int dst) {
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        int[] visited = new int[N + 1];
        Arrays.fill(visited, -1);
        visited[begin] = 0;
        for (int i = 0; i < bridges.get(begin).size(); ++i) {
            Pair target = bridges.get(begin).get(i);
            queue.add(new Pair(target.end, target.cost));
            visited[target.end] = target.cost;
        }
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            //System.out.println(p.end+","+p.cost);
            if (p.end == dst) {
                System.out.println(p.cost);
                return;
            }
            for (int i = 0; i < bridges.get(p.end).size(); ++i) {
                Pair next = bridges.get(p.end).get(i);
                if (p.cost <= next.cost && visited[next.end] < p.cost) {
                    visited[next.end] = p.cost;
                    queue.add(new Pair(next.end, p.cost));
                } else if (next.cost < p.cost && visited[next.end] < next.cost) {
                    visited[next.end] = next.cost;
                    queue.add(new Pair(next.end, next.cost));
                }

            }
        }
        System.out.println(0);
    }
     */
}

/*
class Pair implements Comparable<Pair> {
    int end, cost;

    Pair(int end, int cost) {
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(Pair p) {
        return p.cost - this.cost;
    }
}
 */
