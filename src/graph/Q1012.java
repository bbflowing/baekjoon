package graph;

//유기농 배추

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1012 {
    /*
    public static int[][] map;
    public static int[][] check;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static int R, C, size;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            int locations = Integer.parseInt(st.nextToken());
            map = new int[R][C];
            for (int i=0; i<locations; ++i) {
                st = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                map[r][c] = 1;
            }
            check = new int[R][C];
            int counter = 0;
            for (int r=0; r<R; ++r) {
                for (int c=0; c<C; ++c) {
                    if (map[r][c] == 1 && check[r][c] == 0) {
                        ++counter;
                        check[r][c] = counter;
                        dfs(r, c, counter);
                    }
                }
            }
            bw.append(String.valueOf(counter));
            bw.newLine();
        }
        bw.flush();
    }

    public static void dfs(int r, int c, int counter) {
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (check[nr][nc] != 0) continue;
            if (map[nr][nc] == 0) continue;
            check[nr][nc] = counter;
            dfs(nr, nc, counter);
        }
    }
     */
}
