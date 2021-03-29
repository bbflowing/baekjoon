package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q17090 {
    /*
    public static char maze [][];
    public static int dp [][];
    public static int N, M;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new char [N][M];
        dp = new int [N][M];
        for (int i=0; i<N; ++i) {
            Arrays.fill(dp[i], -1);
        }
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                maze[i][j] = line.charAt(j);
            }
        }
        int answer = 0;

        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (solve(i, j) > 0) {
                    ++answer;
                }

            }
        }
        System.out.println(answer);
    }

    public static int solve (int x, int y) {
        if (x<0 || N<=x || y<0 || M<=y) {
            return 1;
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        dp[x][y] = 0;
        char direction = maze[x][y];

        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        int nx = x; int ny = y;
        if (direction == 'U') {
            nx += dx[0]; ny += dy[0];
        } else if (direction == 'D') {
            nx += dx[1]; ny += dy[1];
        } else if (direction == 'L') {
            nx += dx[2]; ny += dy[2];
        } else if (direction == 'R') {
            nx += dx[3]; ny += dy[3];
        }
        dp[x][y] += solve(nx, ny);
        return dp[x][y];
    }
     */
}
