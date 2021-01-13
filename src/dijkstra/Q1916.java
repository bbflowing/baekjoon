package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1916 {
    public static ArrayList<ArrayList<Coordinate>> input;
    public static int N;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        input = new ArrayList<>();
        for (int i=0; i<=N; ++i) {
            input.add(new ArrayList<>());
        }
        int start = 0;
        int dst = 0;
        for (int i=0; i<M; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            dst = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            input.get(start).add(new Coordinate(dst, value));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        dst = Integer.parseInt(st.nextToken());
        dijkstra(start, dst);
    }

    public static void dijkstra (int start, int dst) {
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add (new Coordinate(start, 0));
        boolean check [] = new boolean [N+1];
        int INF = 987_654_321;
        int distance [] = new int [N+1];
        Arrays.fill(distance, INF);

        while (!queue.isEmpty()) {
            Coordinate previous = queue.poll();
            int current = previous.dst;
            int currentV = previous.value;
            //System.out.println(current);
            if (current == dst) {
                System.out.println(currentV);
                break;
            }
            check[current] = true;

            for (int i=0; i<input.get(current).size(); ++i) {
                Coordinate next = input.get(current).get(i);
                if (distance[next.dst] > currentV + next.value && !check[next.dst]) {
                    distance[next.dst] = currentV + next.value;
                    queue.add(new Coordinate(next.dst, distance[next.dst]));
                }
            }
        }
    }
}
class Coordinate implements Comparable<Coordinate> {
    int dst;
    int value;

    Coordinate (int dst, int value) {
        this.dst = dst;
        this.value = value;
    }

    @Override
    public int compareTo (Coordinate c) {
        return this.value - c.value;
    }
}
