package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14948 {
    /*
    public static int R, C;
    public static int[][] army;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        army = new int[R][C];
        for (int r = 0; r < R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < C; ++c) army[r][c] = Integer.parseInt(st.nextToken());
        }
        bfs();
    }

    public static void bfs() {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int[][][][] dp = new int[2][2][R][C];
        for (int i=0; i<2; ++i) {
            for (int j=0; j<2; ++j) {
                for (int r=0; r<R; ++r) {
                    for (int c=0; c<C; ++c) dp[i][j][r][c] = -1;
                }
            }
        }
        PriorityQueue<Location> queue = new PriorityQueue<>();
        queue.add(new Location(0, 0, 0, army[0][0]));

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == R - 1 && cur.c == C - 1) {
                System.out.println(cur.max);
                return;
            }
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                int next = 0;
                if (cur.skipped == 0) {
                    next = Math.max(cur.max, army[nr][nc]);
                    if (dp[0][0][nr][nc] == -1 || next < dp[0][0][nr][nc]) {
                        dp[0][0][nr][nc] = next;
                        queue.add(new Location(0, nr, nc, next));
                    }
                    nr += dr[dir];
                    nc += dc[dir];
                    if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                    next = Math.max(cur.max, army[nr][nc]);
                    if (dp[1][1][nr][nc] == -1 || next < dp[1][1][nr][nc]) {
                        dp[1][1][nr][nc] = next;
                        queue.add(new Location(1, nr, nc, next));
                    }
                } else {
                    next = Math.max(cur.max, army[nr][nc]);
                    if (dp[1][0][nr][nc] == -1 || next < dp[1][0][nr][nc]) {
                        dp[1][0][nr][nc] = next;
                        queue.add(new Location(1, nr, nc, next));
                    }
                }

            }
        }
    }
     */
}

/*
class Location implements Comparable<Location> {
    int skipped, r, c, max;

    Location(int skipped, int r, int c, int max) {
        this.skipped = skipped;
        this.r = r;
        this.c = c;
        this.max = max;
    }

    @Override
    public int compareTo(Location l) {
        if (this.max > l.max) return 1;
        else if (this.max == l.max) return 0;
        else return -1;
    }
}
 */