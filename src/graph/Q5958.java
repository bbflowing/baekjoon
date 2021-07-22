package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5958 {
    /*
    public static int N;
    public static int[][] sector;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        sector = new int[N][N];
        String line = "";
        for (int r=0; r<N; ++r) {
            line = br.readLine();
            for (int c=0; c<N; ++c) {
                if (line.charAt(c) == '*') sector[r][c] = -1;
            }
        }
        int asteroids = 0;
        for(int r=0; r<N; ++r) {
            for (int c=0; c<N; ++c) {
                if (sector[r][c] == -1) {
                    ++asteroids;
                    sector[r][c] = asteroids;
                    dfs(r, c, asteroids);
                }
            }
        }
        System.out.println(asteroids);
    }

    public static void dfs(int r, int c, int asteroids) {
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
            if (sector[nr][nc] != -1) continue;
            sector[nr][nc] = asteroids;
            dfs(nr, nc, asteroids);
        }
    }
     */
}
