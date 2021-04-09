package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10748 {
    /*
    public static int R, C;
    public static int map [][];
    public static int dp [][];
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int [R+1][C+1];
        dp = new int [R+1][C+1];
        visited = new boolean [R+1][C+1];
        for (int i=1; i<=R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=C; ++j) {
                map[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        visited[1][1] = true;
        dfs(1, 1, map[1][1]);
        System.out.println(dp[1][1] % 1000000007);
    }

    public static int dfs (int x, int y, int before) {
        //System.out.println(x+","+y);
        if (x == R && y == C) {
            return 1;
        }
        if (x == R || y == C) {
            return 0;
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        dp[x][y] = 0;
        for (int i=x+1; i<=R; ++i) {
            for (int j=y+1; j<=C; ++j) {
                if (before != map[i][j]) {
                    visited[i][j] = true;
                    dp[x][y] = (dp[x][y] + dfs(i, j, map[i][j])) % 1000000007;
                    visited[i][j] = false;
                }
            }
        }
        return dp[x][y];
    }
     */
}
