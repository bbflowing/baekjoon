package MST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q4386 {
    /*
    public static int N;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ArrayList<Star> stars = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            double r = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            stars.add(new Star(r, c));
        }
        PriorityQueue<Star> queue = new PriorityQueue<>();
        for (int i = 0; i < N - 1; ++i) {
            Star start = stars.get(i);
            for (int j = i + 1; j < N; ++j) {
                Star next = stars.get(j);
                double distance = Math.sqrt(Math.pow(start.r - next.r, 2) + Math.pow(start.c - next.c, 2));
                queue.add(new Star(i, j, distance));
            }
        }
        parents = new int[N + 1];
        for (int i = 1; i < N + 1; ++i) parents[i] = i;
        getMST(queue);
    }

    public static void getMST(PriorityQueue<Star> queue) {
        double answer = 0;
        int count = N;
        while (!queue.isEmpty()) {
            Star s = queue.poll();
            if (union(s.start, s.end)) {
                --count;
                answer += s.distance;
                if (count == 1) {
                    System.out.println(String.format("%.2f", answer));
                    return;
                }
            }
        }
    }

    public static int find(int star) {
        if (parents[star] == star) return star;
        else return parents[star] = find(parents[star]);
    }

    public static boolean union(int star1, int star2) {
        int parent1 = find(star1);
        int parent2 = find(star2);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;
    }
     */
}

/*
class Star implements Comparable<Star> {
    double r, c, distance;
    int start, end;

    Star(double r, double c) {
        this.r = r;
        this.c = c;
    }

    Star(int start, int end, double distance) {
        this.start = start;
        this.end = end;
        this.distance = distance;
    }

    @Override
    public int compareTo(Star s) {
        if (this.distance - s.distance > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
 */
