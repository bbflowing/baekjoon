package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1103 {
    /*
    public static int R, C;
    public static int[][] map;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static boolean[][] visited;
    public static int[][] dp;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        dp = new int[R][C];
        visited = new boolean[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                dp[r][c] = -1;
                char target = line.charAt(c);
                if (target == 'H') map[r][c] = -1;
                else map[r][c] = target-'0';
            }
        }
        System.out.println(solve(0, 0));
    }

    public static int solve (int r, int c) {
        if (r<0 || R<=r || c<0 || C<=c) return 0;
        if (map[r][c] == -1) return 0;
        if (visited[r][c]) {
            System.out.println(-1);
            System.exit(0);
        }
        if (dp[r][c] != -1) return dp[r][c];
        dp[r][c] = 0;
        visited[r][c] = true;

        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir]*map[r][c];
            int nc = c + dc[dir]*map[r][c];
            dp[r][c] = Math.max(dp[r][c], solve(nr, nc)+1);
        }
        visited[r][c] = false;
        return dp[r][c];
    }
     */
}