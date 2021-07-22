package dijkstra;

// 택배 배송

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q5972 {
    /*
    public static int N;
    public static ArrayList<ArrayList<Barn>> list;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        for (int i=0; i<N+1; ++i) list.add(new ArrayList<>());
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.get(start).add(new Barn(end, cost));
            list.get(end).add(new Barn(start, cost));
        }
        dijkstra();
    }

    public static void dijkstra() {
        PriorityQueue<Barn> queue = new PriorityQueue<>();
        queue.add(new Barn(1, 0));
        int[] visited = new int[N+1];
        Arrays.fill(visited, Integer.MAX_VALUE);
        visited[1] = 0;

        while (!queue.isEmpty()) {
            Barn cur = queue.poll();
            if (cur.number == N) {
                System.out.println(cur.cost);
                return;
            }
            ArrayList<Barn> target = list.get(cur.number);
            for (int i=0; i<target.size(); ++i) {
                Barn next = target.get(i);
                if (cur.cost + next.cost < visited[next.number]) {
                    visited[next.number] = cur.cost + next.cost;
                    queue.add(new Barn(next.number, visited[next.number]));
                }
            }
        }
    }
     */
}

/*
class Barn implements Comparable<Barn> {
    int number, cost;

    Barn(int number, int cost) {
        this.number = number;
        this.cost = cost;
    }

    @Override
    public int compareTo (Barn b) {
        if (this.cost > b.cost) return 1;
        else return -1;
    }
}
 */
