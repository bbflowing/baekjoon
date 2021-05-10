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
        int[][] dp = new int[N][N];
        for (int r=0; r<N; ++r) {
            line = br.readLine();
            for (int c=0; c<N; ++c) {
                rooms[r][c] = line.charAt(c)-'0';
                dp[r][c] = -1;
            }
        }
        bfs(dp);
    }

    public static void bfs(int[][] dp) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add(new Coordinate(0, 0, 0));
        dp[0][0] = 0;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == N-1 && cur.c == N-1) {
                System.out.println(cur.changes);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (rooms[nr][nc] == 0) {
                    if (dp[nr][nc] == -1 || cur.changes+1 < dp[nr][nc]) {
                        dp[nr][nc] = cur.changes+1;
                        queue.add(new Coordinate(nr, nc, cur.changes+1));
                    }
                } else {
                    if (dp[nr][nc] == -1 || cur.changes < dp[nr][nc]) {
                        dp[nr][nc] = cur.changes;
                        queue.add(new Coordinate(nr, nc, cur.changes));
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r, c, changes;

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