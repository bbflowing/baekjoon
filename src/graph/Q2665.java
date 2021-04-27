package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2665 {
    /*
    public static int N;
    public static int[][] room;

    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String line;
        room = new int[N][N];
        for (int r=0; r<N; ++r) {
            line = br.readLine();
            for (int c=0; c<N; ++c) {
                if (line.charAt(c) == '1') {
                    room[r][c] = 1;
                }
            }
        }
        bfs();
    }

    public static void bfs() {
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        int[][] visited = new int[N][N];
        for (int i=0; i<N; ++i) {
            Arrays.fill(visited[i], Integer.MAX_VALUE);
        }
        queue.add(new Coordinate(0, 0, 0));
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

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
                if (room[nr][nc] == 0) {
                    if (c.changes+1 < visited[nr][nc]) {
                        visited[nr][nc] = c.changes+1;
                        queue.add(new Coordinate(nr, nc, c.changes+1));
                    }
                } else {
                    if (c.changes < visited[nr][nc]) {
                        visited[nr][nc] = c.changes;
                        queue.add(new Coordinate(nr, nc, c.changes));
                    }
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