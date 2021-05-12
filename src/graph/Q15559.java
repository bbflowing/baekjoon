package graph;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15559 {
    /*
    public static int R, C, answer;
    public static char[][] map;
    public static int[][] dp;

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        dp = new int[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                dp[r][c] = -1;
                map[r][c] = line.charAt(c);
            }
        }
        int counter = 0;
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (dp[r][c] == -1) {
                    ++counter;
                    dp[r][c] = counter;
                    solve(r, c, counter);
                }
            }
        }
        System.out.println(answer);
    }

    public static void solve (int r, int c, int counter) {
        int nr = r; int nc = c;
        if (map[r][c] == 'S') ++nr;
        else if (map[r][c] == 'N') --nr;
        else if (map[r][c] == 'W') --nc;
        else ++nc;

        if (dp[nr][nc] == counter) {
            ++answer;
            return;
        } else if (dp[nr][nc] != counter && dp[nr][nc] != -1) {
            return;
        } else {
            dp[nr][nc] = counter;
            solve(nr, nc, counter);
        }
    }
     */
}