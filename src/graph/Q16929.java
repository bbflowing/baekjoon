package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16929 {
    /*
    public static int R, C;
    public static char[][] board;
    public static boolean[][] visited;
    public static int[][] dp;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        visited = new boolean[R][C];
        dp = new int[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                board[r][c] = line.charAt(c);
            }
        }

        int counter = 0;
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (dp[r][c] == 0) {
                    ++counter;
                    visited[r][c] = true;
                    dp[r][c] = counter;
                    solve(r, c, -1, -1, counter);
                    visited[r][c] = false;
                }
            }
        }
        System.out.println("No");
    }

    public static void solve (int r, int c, int br, int bc, int counter) {
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (visited[nr][nc]) {
                if (nr == br && nc == bc) continue;
                else if (nr != br || nc != bc) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
            if (board[nr][nc] == board[r][c]) {
                dp[nr][nc] = counter;
                visited[nr][nc] = true;
                solve(nr, nc, r, c, counter);
                visited[nr][nc] = false;
            }
        }
    }
     */
}
