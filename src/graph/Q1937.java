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
        for (int i=0; i<N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                forest[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = -1;
        dp = new int [N][N];
        for (int i=0; i<N; ++i) {
            Arrays.fill(dp[i], -1);
        }

        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                int answer = dfs(i, j);
                if (max < answer) {
                    max = answer;
                }
            }
        }
        System.out.println(max);
    }

    public static int dfs (int x, int y) {
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        dp[x][y] = 1;

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < N && 0 <= ny && ny < N) {
                if (forest[x][y] < forest[nx][ny]) {
                    dp[x][y] = Math.max(dp[x][y], dfs(nx, ny)+1);
                }
            }
        }
        return dp[x][y];
    }
     */
}