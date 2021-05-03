package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1103 {
    /*
    public static int R, C;
    public static int[][] board;
    public static boolean[][] visited;
    public static int[][] dp;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new int[R][C];
        String line = "";
        dp = new int[R][C];
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                dp[r][c] = -1;
                char target = line.charAt(c);
                if (target != 'H') board[r][c] = target - '0';
            }
        }
        visited = new boolean[R][C];
        System.out.println(solve(0, 0));
    }

    public static int solve (int r, int c) {
        if (r<0 || R<=r || c<0 || C<=c) return 0;

        if (visited[r][c]) {
            System.out.println(-1);
            System.exit(0);
        }
        if (board[r][c] == 0) return 0;
        if (dp[r][c] != -1) return dp[r][c];

        visited[r][c] = true;
        dp[r][c] = 0;
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir]*board[r][c];
            int nc = c + dc[dir]*board[r][c];
            dp[r][c] = Math.max(dp[r][c], solve(nr, nc)+1);
        }
        visited[r][c] = false;
        return dp[r][c];
    }
     */
}