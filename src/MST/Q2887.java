package MST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q2887 {
    /*
    public static int N;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Coordinate> list = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            list.add(new Coordinate(x, y, z));
        }
        parents = new int[N+1];
        for (int i=1; i<N+1; ++i) parents[i] = i;
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        for (int i=0; i<N-1; ++i) {
            Coordinate first = list.get(i);
            for (int j=i+1; j<N; ++j) {
                Coordinate second = list.get(j);
                int distance = Math.min(Math.min(Math.abs(first.x - second.x), Math.abs(first.y-second.y)), Math.abs(first.z - second.z));
                queue.add(new Coordinate(i, j, distance));
            }
        }
        System.out.println(getMST(queue));
    }

    public static int find(int planet) {
        if (parents[planet] == planet) return planet;
        return parents[planet] = find(parents[planet]);
    }

    public static boolean union(int first, int second) {
        int parent1 = find(first);
        int parent2 = find(second);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;
    }

    public static long getMST(PriorityQueue<Coordinate> queue) {
        long total = 0;
        int count = N;
        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (union(cur.x, cur.y)) {
                total += cur.z;
                --count;
                if (count == 1) break;
            }
        }
        return total;
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int x,y,z;

    Coordinate (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int compareTo(Coordinate c) {
        return this.z - c.z;
    }
}
 */
