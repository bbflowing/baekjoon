package MST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 우주신과의 교감

public class Q1774 {
    /*
    public static int N;
    public static ArrayList<Coordinate> gods;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        gods = new ArrayList<>(N+1);
        gods.add(new Coordinate(-1, -1));
        for (int i=1; i<=N; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            gods.add(new Coordinate(x, y));
        }
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        parents = new int[N+1];
        double total = 0;
        int count = N;
        for (int i=1; i<N+1; ++i) parents[i] = i;
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            Coordinate start = gods.get(first);
            Coordinate end = gods.get(second);
            if (union(first, second)) --count;
        }
        for (int i=1; i<N; ++i) {
            Coordinate start = gods.get(i);
            for (int j=i+1; j<N+1; ++j) {
                Coordinate end = gods.get(j);
                double distance = Math.sqrt(Math.pow(start.x-end.x, 2) + Math.pow(start.y-end.y, 2));
                queue.add(new Coordinate(i, j, distance));
            }
        }
        double answer = getMST(queue, count);
        if (answer != -1) System.out.println(String.format("%.2f", answer));
    }
    public static double getMST(PriorityQueue<Coordinate> queue, int count) {
        double total = 0;
        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (union(cur.x, cur.y)) {
                total += cur.distance;
                --count;
                if (count == 1) return total;
            }
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

    public static int find(int node) {
        if (parents[node] == node) return node;
        else return parents[node] = find(parents[node]);
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate>{
    int x, y;
    double distance;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate(int start, int end, double distance) {
        this.x = start;
        this.y = end;
        this.distance = distance;
    }

    @Override
    public int compareTo(Coordinate c) {
        if (this.distance - c.distance > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
 */
