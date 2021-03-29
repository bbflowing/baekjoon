package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1520 {
    public static int map [][];
    public static int dp [][];
    public static int M, N;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int [M][N];
        dp = new int [M][N]; // the number of routes to (N, M) starting from the coordinate
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                map[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        System.out.println(solve(0, 0));
    }

    public static int solve (int x, int y) {
        if (x == M-1 && y == N-1) {
            return 1;
        }

        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        dp[x][y] = 0;
        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || M<=nx || ny<0 || N<=ny) {
                continue;
            }
            if (map[x][y] <= map[nx][ny]) {
                continue;
            }
            dp[x][y] += solve(nx, ny);
        }

        return dp[x][y];
    }
}
