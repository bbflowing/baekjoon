package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q18405 {
    /*
    public static int N;
    public static int[][] laboratory;
    public static PriorityQueue<Coordinate> queue;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        laboratory = new int[N + 1][N + 1];
        queue = new PriorityQueue<>();
        for (int r=1; r<=N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=1; c<=N; ++c) {
                laboratory[r][c] = Integer.parseInt(st.nextToken());
                if (laboratory[r][c] != 0) queue.add(new Coordinate(r, c, laboratory[r][c]));
            }
        }
        st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        for (int t=0; t<S; ++t) bfs();
        System.out.println(laboratory[X][Y]);
    }

    public static void bfs() {
        PriorityQueue<Coordinate> next = new PriorityQueue<>();
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<1 || N<nr || nc<1 || N<nc) continue;
                if (laboratory[nr][nc] != 0) continue;
                laboratory[nr][nc] = cur.type;
                next.add(new Coordinate(nr, nc, cur.type));
            }
        }
        queue = next;
    }
}

class Coordinate implements Comparable<Coordinate> {
    int r, c, type;

    Coordinate(int r, int c, int type) {
        this.r = r;
        this.c = c;
        this.type = type;
    }

    @Override
    public int compareTo(Coordinate c) {
        return this.type - c.type;
    }
     */
}