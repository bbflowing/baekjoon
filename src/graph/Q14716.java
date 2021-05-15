package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14716 {
    /*
    public static int R, C;
    public static int[][] banner;
    public static int[] dr = {-1, -1, -1, 0, 0, +1, +1, +1};
    public static int[] dc = {-1, 0, +1, -1, +1, -1, 0, +1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        banner = new int[R][C];
        for (int r = 0; r < R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < C; ++c) {
                if (Integer.parseInt(st.nextToken()) == 1) banner[r][c] = -1;
            }
        }
        int counter = 0;
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c < C; ++c) {
                if (banner[r][c] == -1) {
                    ++counter;
                    dfs(r, c, counter);
                }
            }
        }
        System.out.println(counter);
    }

    public static void dfs(int r, int c, int counter) {
        banner[r][c] = counter;
        for (int dir = 0; dir < 8; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
            if (banner[nr][nc] != -1) continue;
            dfs(nr, nc, counter);
        }
    }
     */
}