package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1987 {
    /*
    public static int R, C, answer;
    public static int[][] dp;
    public static char[][] board;
    public static boolean[] visited;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        dp = new int[R][C];
        board = new char[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                board[r][c] = line.charAt(c);
                dp[r][c] = -1;
            }
        }
        visited = new boolean[26];
        answer = 0;
        solve(0, 0, 1);
        System.out.println(answer);
    }

    public static void solve (int r, int c, int count) {
        if (count == 26) {
            System.out.println(26);
            System.exit(0);
        }
        answer = Math.max(answer, count);
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (visited[board[nr][nc]-'A']) continue;
            visited[board[nr][nc]-'A'] = true;
            solve(nr, nc, count+1);
            visited[board[nr][nc]-'A'] = false;
        }
    }
     */
}
