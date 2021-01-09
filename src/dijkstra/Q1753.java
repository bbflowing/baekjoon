package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1753 {
    /*
    public static ArrayList<Pair> list [];
    public static int distance [];
    public static int V;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int INF = 1_000_000;
        V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());
        distance = new int [V+1];
        Arrays.fill(distance, INF);
        list = new ArrayList[V+1];
        for (int i=0; i<=V; ++i) {
            list[i] = new ArrayList<>();
        }

        for (int i=0; i<E; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int destination = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            list[start].add(new Pair(destination, value));
        }
        dijkstra(K);
        String answer = "";
        for (int i=1; i<=V; ++i) {
            if (distance[i] == INF) {
                answer += "INF \n";
            } else {
                answer += distance[i]+"\n";
            }
        }
        System.out.println(answer);
    }
    public static void dijkstra (int start) {
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        boolean check [] = new boolean [V+1];
        queue.add(new Pair(start, 0));
        distance[start] = 0;

        while (!queue.isEmpty()) {
            Pair next = queue.poll();
            int current = next.destination;
            if (check[current]) {
                continue;
            }
            for (Pair pair: list[current]) {
                if (distance[pair.destination] > distance[current] + pair.value) {
                    distance[pair.destination] = distance[current] + pair.value;
                    queue.add(new Pair(pair.destination, distance[pair.destination]));
                }
            }
        }
    }

     */
}

/*
class Pair implements Comparable<Pair> {
    int destination;
    int value;

    Pair(int destination, int value) {
        this.destination = destination;
        this.value = value;
    }
    @Override
    public int compareTo(Pair p1) {
        return this.value - p1.value;
    }
}

 */
