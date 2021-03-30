package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2186 {
    /*
    public static char board [][];
    public static int dp [][][];
    public static char word [];
    public static int N, M, K;
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        board = new char [N][M];

        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                board[i][j] = line.charAt(j);
            }
        }
        word = br.readLine().toCharArray();
        dp = new int [N][M][word.length];
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        int answer = 0;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (board[i][j] == word[0]) {
                    answer += solve(i, j, 0);
                }
            }
        }
        System.out.println(answer);
    }

    public static int solve (int x, int y, int index) {
        if (index == word.length-1) {
            return 1;
        }
        if (dp[x][y][index] != -1) {
            return dp[x][y][index];
        }
        dp[x][y][index] = 0;


        for (int i=0; i<4; ++i) {
            int nx = x;
            int ny = y;

            for (int j=1; j<=K; ++j) {
                nx += dx[i];
                ny += dy[i];

                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    break;
                }
                if (board[nx][ny] == word[index+1]) {
                    dp[x][y][index] += solve(nx, ny, index+1);
                }
            }
        }
        return dp[x][y][index];
    }
     */
}
