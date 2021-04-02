package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q5011 {
    public static char grid[][];
    public static int N;
    public static long divide;
    public static long dp[][];
    public static int dx[] = {1, 0};
    public static int dy[] = {0, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        grid = new char[N][N];
        dp = new long [N][N];
        divide = 2<<31-1;
        for (int i = 0; i < N; ++i) {
            String line = br.readLine();
            for (int j = 0; j < N; ++j) {
                grid[i][j] = line.charAt(j);
                dp[i][j] = -1;
            }
        }
        solve(0, 0);

        if (dp[0][0] == 0) {
            System.out.println("THIS GAME IS A LIE");
        } else {
            System.out.println(dp[0][0]);
        }
    }

    public static long solve(int x, int y) {
        if (x == N - 1 && y == N - 1) {
            return 1;
        }

        if (dp[x][y] != -1) {
            return dp[x][y] % divide;
        }

        dp[x][y] = 0;
        for (int i = 0; i < 2; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || N <= nx || ny < 0 || N <= ny) {
                continue;
            }

            if (grid[nx][ny] == '#') {
                continue;
            }
            dp[x][y] += solve(nx, ny) % divide ;
        }
        return dp[x][y] % divide;
    }
}
