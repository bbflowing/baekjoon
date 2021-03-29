package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1890 {
    /*
    public static int board [][];
    public static long dp [][];
    public static int N;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int [N][N];
        dp = new long [N][N];
        StringTokenizer st;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        System.out.println(solve(0, 0));
    }

    public static long solve (int x, int y) {
        if (x == N-1 && y == N-1) {
            return 1;
        }

        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        dp[x][y] = 0;
        if (y+board[x][y] <= N-1) {
            dp[x][y] += solve(x, y+board[x][y]);
        }
        if (x+board[x][y] <= N-1) {
            dp[x][y] += solve(x+board[x][y], y);
        }
        return dp[x][y];
    }
     */
}
