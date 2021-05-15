package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1261 {
    /*
    public static int R, C;
    public static int[][] maze;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        maze = new int[R][C];
        int[][] dp = new int[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            Arrays.fill(dp[r], -1);
            for (int c=0; c<C; ++c) maze[r][c] = line.charAt(c)-'0';
        }
        solve(dp);
    }

    public static void solve(int[][] dp) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        dp[0][0] = 0;
        queue.add(new Coordinate(0, 0, 0));

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == R-1 && cur.c == C-1) {
                System.out.println(cur.broken);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (maze[nr][nc] == 0) {
                    if (dp[nr][nc] == -1 || cur.broken < dp[nr][nc]) {
                        dp[nr][nc] = cur.broken;
                        queue.add(new Coordinate(nr, nc, cur.broken));
                    }
                } else {
                    if (dp[nr][nc] == -1 || cur.broken+1 < dp[nr][nc]) {
                        dp[nr][nc] = cur.broken+1;
                        queue.add(new Coordinate(nr, nc, cur.broken+1));
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r, c, broken;

    Coordinate(int r, int c, int broken) {
        this.r = r;
        this.c = c;
        this.broken = broken;
    }

    public int compareTo(Coordinate c) {
        return this.broken - c.broken;
    }
}
 */
