package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1937 {
    /*
    public static int N;
    public static int forest [][];
    public static int dp [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        forest = new int [N][N];
        dp = new int [N][N];
        StringTokenizer st;
        dp = new int [N][N];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                forest[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        int answer = -1;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                int result = solve(i, j);
                if (answer < result) {
                    answer = result;
                }
            }
        }
        System.out.println(answer);
    }

    public static int solve (int x, int y) {
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        dp[x][y] = 1;

        for (int dir=0; dir<4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || N<=nx || ny<0 || N<=ny) {
                continue;
            }
            if (forest[nx][ny] > forest[x][y]) {
                dp[x][y] = Math.max(dp[x][y], solve(nx, ny)+1);
            }
        }
        return dp[x][y];
    }
     */
}