package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Q10164 {
    /*
    public static int board [][];
    public static int dp [][];
    public static int N, M, K;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        board = new int [N][M];
        dp = new int [N][M];
        for (int i=0; i<N; ++i) {
            for (int j=1; j<=M; ++j) {
                board [i][j-1] = i*M+j;
                dp[i][j-1] = -1;
            }
        }
        System.out.println(solve(0, 0, 0));
    }
    public static int solve (int x, int y, int check) {
        if (board[x][y] == N*M) {
            if (check == 0) {
                if (K == 0) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 1;
            }
        }

        if (x*M+y+1 > K && K != 0 && check == 0) {
            return 0;
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        dp[x][y] = 0;
        if (x*M+y+1 == K) {
            if (x+1 <= N-1) {
                dp[x][y] += solve(x + 1, y, 1);
            }
            if (y+1 <= M-1) {
                dp[x][y] += solve(x, y + 1, 1);
            }
        } else {
            if (x+1 <= N-1) {
                dp[x][y] += solve(x + 1, y, check);
            }
            if (y+1 <= M-1) {
                dp[x][y] += solve(x, y + 1, check);
            }
        }
        return dp[x][y];
    }
     */
}
