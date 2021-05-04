package graph;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q2583 {
    /*
    public static int R, C, size;
    public static int[][] grid;
    public static int[][] groups;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        grid = new int[R][C];
        for (int k=0; k<K; ++k) {
            st = new StringTokenizer(br.readLine());
            int sc = Integer.parseInt(st.nextToken());
            int sr = R-1-Integer.parseInt(st.nextToken());
            int ec = Integer.parseInt(st.nextToken())-1;
            int er = R-Integer.parseInt(st.nextToken());
            for (int i=er; i<=sr; ++i) {
                for (int j=sc; j<=ec; ++j) {
                    grid[i][j] = 1;
                }
            }
        }
        groups = new int[R][C];
        ArrayList<Integer> sizes = new ArrayList<>();
        int counter = 0;

        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (grid[r][c] == 0 && groups[r][c] == 0) {
                    ++counter;
                    size = 1;
                    groups[r][c] = counter;
                    dfs(r, c, counter);
                    sizes.add(size);
                }
            }
        }
        Collections.sort(sizes);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(String.valueOf(sizes.size()));
        bw.newLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<sizes.size(); ++i) {
            sb.append(sizes.get(i)+" ");
        }
        bw.append(sb);
        bw.flush();
    }

    public static void dfs (int r, int c, int counter) {
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (groups[nr][nc] != 0) continue;
            if (grid[nr][nc] == 1) continue;

            groups[nr][nc] = counter;
            ++size;
            dfs(nr, nc, counter);
        }
    }
     */
}