package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11048 {
    public static int R, C;
    public static int[][] maze;
    public static int[][] dp;
    public static boolean[][] visited;
    public static int[] dr = {1, 0, 1};
    public static int[] dc = {0, 1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new int[R][C];
        dp = new int[R][C];
        visited = new boolean[R][C];
        for (int r = 0; r < R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < C; ++c) {
                maze[r][c] = Integer.parseInt(st.nextToken());
                dp[r][c] = -1;
            }
        }
        System.out.println(solve(0, 0));
    }

    public static int solve(int r, int c) {
        if (visited[r][c]) {
            return 0;
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        if (r == R - 1 && c == C - 1) {
            return maze[r][c];
        }
        visited[r][c] = true;
        dp[r][c] = maze[r][c];

        for (int dir = 0; dir < 3; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr < 0 || R <= nr || nc < 0 || C <= nc) {
                continue;
            }
            dp[r][c] = Math.max(dp[r][c], maze[r][c] + solve(nr, nc));
        }
        visited[r][c] = false;
        return dp[r][c];
    }
}
