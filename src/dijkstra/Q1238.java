package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1238 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Pair>> list = new ArrayList<>(N+1);
        for (int i=0; i<=N; ++i) {
            list.add(new ArrayList<>());
        }
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.get(start).add(new Pair(end, cost));
        }
        int first [] = new int [N+1];
        int second [] = new int [N+1];
        for (int i=1; i<=N; ++i) {
            if (i != X) {
                first [i] = dijkstra(i, X, N, list);
                second [i] = dijkstra(X, i, N, list);
            }
        }
        int max = 0;
        for (int i=1; i<=N; ++i) {
            if (first[i] + second[i] > max) {
                max = first[i] + second[i];
            }
        }
        System.out.println(max);
    }

    public static int dijkstra (int start, int end, int N, ArrayList<ArrayList<Pair>> list) {
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        int distance [] = new int [N+1];
        Arrays.fill(distance, 987_654_321);
        boolean check [] = new boolean [N+1];
        distance[start] = 0;
        check[start] = true;
        queue.add(new Pair(start, 0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int currentEnd = current.dst;
            int currentCost = current.cost;

            if (check[currentEnd]) {
                continue;
            }
            check[currentEnd] = true;
            for (int i=0; i<list.get(currentEnd).size(); ++i) {
                Pair next = list.get(currentEnd).get(i);
                int nextEnd = next.dst;
                int nextCost = next.cost;
                if (check[nextEnd]) {
                    continue;
                }
                check[nextEnd] = true;
                if (distance[nextEnd] > currentCost + nextCost) {
                    distance[nextEnd] = currentCost + nextCost;
                }
            }
        }
        return distance[end];
    }
}
class Pair implements Comparable<Pair> {
    int dst;
    int cost;

    Pair (int dst, int cost) {
        this.dst = dst;
        this.cost = cost;
    }

    @Override
    public int compareTo (Pair p) {
        return this.cost - p.cost;
    }
}
