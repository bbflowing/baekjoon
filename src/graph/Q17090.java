package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17090 {
    /*
    public static int R, C;
    public static char[][] maze;
    public static int[][] dp;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char[R][C];
        dp = new int[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                maze[r][c] = line.charAt(c);
                dp[r][c] = -1;
            }
        }
        int answer = 0;
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (dp[r][c] == -1) answer += dfs(r, c);
                else if (dp[r][c] == 1) ++answer;
            }
        }
        System.out.println(answer);
    }

    public static int dfs(int r, int c) {
        if (r<0 || R<=r || c<0 || C<=c) return 1;
        if (dp[r][c] != -1) return dp[r][c];
        dp[r][c] = 0;
        int nr = r; int nc = c;
        if (maze[r][c] == 'D') ++nr;
        else if (maze[r][c] == 'L') --nc;
        else if (maze[r][c] == 'R') ++nc;
        else --nr;
        dp[r][c] = dfs(nr, nc);
        return dp[r][c];
    }
     */
}