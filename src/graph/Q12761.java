package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q12761 {
    public static int A, B;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        bfs(N, M);
    }

    public static void bfs (int start, int end) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Pair> queue = new LinkedList<>();
        int visited [] = new int [100_000+1];
        Arrays.fill(visited, 987_654_321);
        visited[start] = 0;
        queue.add(new Pair(start, 0));

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (p.location == end) {
                System.out.println(p.distance);
                return;
            }

            int nl = p.location+1;
            if (nl <= 100_000) {
                if (p.distance+1 < visited[nl]) {
                    visited[nl] = p.distance+1;
                    queue.add(new Pair(nl, p.distance+1));
                }
            }

            nl = p.location-1;
            if (0<=nl) {
                if (p.distance+1 < visited[nl]) {
                    visited[nl] = p.distance+1;
                    queue.add(new Pair(nl, p.distance+1));
                }
            }

            nl = p.location+A;
            if (nl <= 100_000) {
                if (p.distance+1 < visited[nl]) {
                    visited[nl] = p.distance+1;
                    queue.add(new Pair(nl, p.distance+1));
                }
            }

            nl = p.location+B;
            if (nl <= 100_000) {
                if (p.distance+1 < visited[nl]) {
                    visited[nl] = p.distance+1;
                    queue.add(new Pair(nl, p.distance+1));
                }
            }

            nl = p.location-A;
            if (0 <= nl) {
                if (p.distance+1 < visited[nl]) {
                    visited[nl] = p.distance+1;
                    queue.add(new Pair(nl, p.distance+1));
                }
            }

            nl = p.location-B;
            if (0 <= nl) {
                if (p.distance+1 < visited[nl]) {
                    visited[nl] = p.distance+1;
                    queue.add(new Pair(nl, p.distance+1));
                }
            }

            nl = p.location*A;
            if (nl <= 100_000) {
                if (p.distance+1 < visited[nl]) {
                    visited[nl] = p.distance+1;
                    queue.add(new Pair(nl, p.distance+1));
                }
            }

            nl = p.location*B;
            if (nl <= 100_000) {
                if (p.distance+1 < visited[nl]) {
                    visited[nl] = p.distance+1;
                    queue.add(new Pair(nl, p.distance+1));
                }
            }
        }
    }
}

class Pair {
    int location;
    int distance;

    Pair (int location, int distance) {
        this.location = location;
        this.distance = distance;
    }
}
