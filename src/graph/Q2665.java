package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2665 {
    /*
    public static int N;
    public static int[][] rooms;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        rooms = new int[N][N];
        String line = "";
        int[][] visited = new int[N][N];
        for (int r=0; r<N; ++r) {
            line =br.readLine();
            for (int c=0; c<N; ++c) {
                rooms[r][c] = line.charAt(c)-'0';
                visited[r][c] = -1;
            }
        }
        bfs(visited);
    }
    public static void bfs(int[][] visited) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add(new Coordinate(0, 0, 0));
        visited[0][0] = 0;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == N-1 && cur.c == N-1) {
                System.out.println(cur.changes);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                int nchanges = cur.changes;

                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (rooms[nr][nc] == 0) {
                    ++nchanges;
                }
                if (visited[nr][nc] == -1 || nchanges < visited[nr][nc]) {
                    visited[nr][nc] = nchanges;
                    queue.add(new Coordinate(nr, nc, nchanges));
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r;
    int c;
    int changes;

    Coordinate (int r, int c, int changes) {
        this.r = r;
        this.c = c;
        this.changes = changes;
    }

    @Override
    public int compareTo (Coordinate c) {
        return this.changes - c.changes;
    }
}
 */
