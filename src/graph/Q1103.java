package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1103 {
    /*
    public static int R, C;
    public static int[][] board;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static boolean[][] route;
    public static int[][] distance;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new int[R][C];
        route = new boolean[R][C];
        distance = new int[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) {
                char target = line.charAt(c);
                if (target != 'H') board[r][c] = target - '0';
                distance[r][c] = -1;
            }
        }
        solve(0,0);
        System.out.println(distance[0][0]);
    }

    public static int solve (int r, int c) {
        if (r<0 || R<=r || c<0 || C<=c || board[r][c] == 0) {
            return 0;
        }
        if (route[r][c]) {
            System.out.println(-1);
            System.exit(0);
        }
        if (distance[r][c] != -1) {
            return distance[r][c];
        }
        distance[r][c] = 0;
        route[r][c] = true;
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir]*board[r][c];
            int nc = c + dc[dir]*board[r][c];
            distance[r][c] = Math.max(distance[r][c], solve(nr, nc)+1);
        }
        route[r][c] = false;
        return distance[r][c];
    }
     */
}