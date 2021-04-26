package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1103 {
    /*
    public static int R, C;
    public static char[][] board;
    public static boolean[][] visited;
    public static int[][] dp;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R+1][C+1];
        dp = new int[R+1][C+1];
        visited = new boolean[R+1][C+1];
        String line = "";
        for (int r=1; r<=R; ++r) {
            line = br.readLine();
            for (int c=1; c<=C; ++c) {
                board[r][c] = line.charAt(c-1);
                dp[r][c] = -1;
            }
        }
        solve(1, 1);
        System.out.println(dp[1][1]);
    }

    public static int solve (int r, int c) {
        if (r<1 || R<r || c<1 || C<c) return 0;
        if (board[r][c] == 'H') return 0;
        if (visited[r][c]) {
            System.out.println(-1);
            System.exit(0);
        }
        if (dp[r][c] != -1) return dp[r][c];
        dp[r][c] = 0;
        visited[r][c] = true;
        int times = board[r][c] - '0';
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir]*times;
            int nc = c + dc[dir]*times;

            dp[r][c] = Math.max(solve(nr, nc)+1, dp[r][c]);
        }
        visited[r][c] = false;
        return dp[r][c];
    }
     */
}