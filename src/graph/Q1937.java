package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1937 {
    /*
    public static int N;
    public static int[][] forest;
    public static int[][] dp;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        forest = new int[N][N];
        dp = new int[N][N];
        StringTokenizer st;
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                forest[r][c] = Integer.parseInt(st.nextToken());
                dp[r][c] = -1;
            }
        }
        int answer = -1;
        for (int r=0; r<N; ++r) {
            for (int c=0; c<N; ++c) {
                if (dp[r][c] == -1) answer = Math.max(answer, solve(r, c));
            }
        }
        System.out.println(answer);
    }

    public static int solve (int r, int c) {
        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        dp[r][c] = 1;
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
            if (forest[r][c] < forest[nr][nc]) {
                dp[r][c] = Math.max(dp[r][c], solve(nr, nc)+1);
            }
        }
        return dp[r][c];
    }
     */
}