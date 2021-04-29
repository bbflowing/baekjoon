package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11048 {
    /*
    public static int R, C;
    public static int[][] maze;
    public static int[][] candies;
    public static int[] dr = {1, 0, 1};
    public static int[] dc = {0, 1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new int[R][C];
        candies = new int[R][C];
        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) {
                maze[r][c] = Integer.parseInt(st.nextToken());
                candies[r][c] = -1;
            }
        }
        solve(0, 0);
        System.out.println(candies[0][0]);


    }

    public static int solve (int r, int c) {
        if (candies[r][c] != -1) {
            return candies[r][c];
        }
        if (r == R-1 && c == C-1) {
            return maze[r][c];
        }
        candies[r][c] = maze[r][c];
        for (int dir=0; dir<3; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<0 || R<=nr || nc<0 || C<=nc) {
                continue;
            }
            candies[r][c] = Math.max(candies[r][c], maze[r][c] + solve(nr, nc));
        }
        return candies[r][c];
    }
     */
}
