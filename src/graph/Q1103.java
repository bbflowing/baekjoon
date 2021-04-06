package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1103 {
    /*
    public static int R, C, max;
    public static char board [][];
    public static boolean visited [][];
    public static int dp [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char [R][C];
        dp = new int [R][C];
        visited = new boolean [R][C];

        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                board[i][j] = line.charAt(j);
            }
        }

        max = 0;
        solve(0, 0, 0);
        for (int i=0; i<R; ++i) {
            System.out.println(Arrays.toString(dp[i]));
        }
        if (max != -1) {
            for (int i = 0; i < R; ++i) {
                for (int j = 0; j < C; ++j) {
                    max = Math.max(max, dp[i][j]);
                }
            }
            ++max;
        }
        System.out.println(max);
    }

    public static void solve(int x, int y, int distance) {
        visited [x][y] = true;
        for (int i=0; i<4; ++i) {
            int nx = x + (board[x][y]-'0')*dx[i];
            int ny = y + (board[x][y]-'0')*dy[i];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (board[nx][ny] == 'H') {
                continue;
            }
            if (dp[nx][ny] > distance+1) {
                continue;
            }
            if (visited[nx][ny]) {
                max = -1;
                return;
            }
            dp[x][y] = Math.max(dp[nx][ny], distance+1);
            solve(nx, ny, distance+1);
        }
        visited[x][y] = false;
    }
     */
}
