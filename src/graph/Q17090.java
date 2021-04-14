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
    public static char maze [][];
    public static int dp [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char [R][C];
        dp = new int [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                maze[i][j] = line.charAt(j);
                dp[i][j] = -1;
            }
        }
        int answer = 0;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                int result = solve(i, j);
                if (result != 0) {
                    ++answer;
                }
            }
        }
        System.out.println(answer);
    }

    public static int solve (int x, int y) {
        if (x<0 || R<=x || y<0 || C<=y) {
            return 1; // possible
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        dp[x][y] = 0; // set it as impossible
        int nx = x; int ny = y;
        if (maze[x][y] == 'D') {
            ++nx;
        } else if (maze[x][y] == 'U') {
            --nx;
        } else if (maze[x][y] == 'L') {
            --ny;
        } else if (maze[x][y] == 'R') {
            ++ny;
        }
        dp[x][y] = solve(nx, ny);
        return dp[x][y];
    }
     */

}

