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
        for (int r=0; r<N; ++r) {
            String line = br.readLine();
            for (int c=0; c<N; ++c) {
                rooms[r][c] = line.charAt(c) - '0';
            }
        }
        bfs();
    }

    public static void bfs() {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int[][] changes = new int[N][N];
        for (int r=0; r<N; ++r) {
            Arrays.fill(changes[r], Integer.MAX_VALUE);
        }
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add(new Coordinate(0, 0, 0));
        changes[0][0] = 0;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == N-1 && c.c == N-1) {
                System.out.println(c.changes);
                return;
            }

            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) {
                    continue;
                }
                if (rooms[nr][nc] == 0) {
                    if (changes[nr][nc] > c.changes+1) {
                        changes[nr][nc] = c.changes+1;
                        queue.add(new Coordinate(nr, nc, c.changes+1));
                    }
                } else {
                    if (changes[nr][nc] > c.changes) {
                        changes[nr][nc] = c.changes;
                        queue.add(new Coordinate(nr, nc, c.changes));
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate>{
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
