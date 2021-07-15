package graph;

// 섬의 개수

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4963 {
    /*
    public static int R, C, size;
    public static int[][] map;
    public static boolean[][] check;
    public static int[] dr = {-1, -1, -1, 0, 0, +1, +1, +1};
    public static int[] dc = {-1, 0, +1, -1, +1, -1, 0, +1};

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) break;
            st = new StringTokenizer(line);
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            map = new int[R][C];
            check = new boolean[R][C];
            for (int r=0; r<R; ++r) {
                st = new StringTokenizer(br.readLine());
                for (int c=0; c<C; ++c) map[r][c] = Integer.parseInt(st.nextToken());
            }
            int counter = 0;
            for (int r=0; r<R; ++r) {
                for (int c=0; c<C; ++c) {
                    if (map[r][c] == 1 && !check[r][c]) {
                        ++counter;
                        check[r][c] = true;
                        dfs(r, c);
                    }
                }
            }
            bw.append(String.valueOf(counter));
            bw.newLine();
        }
        bw.flush();
    }

    public static void dfs(int r, int c) {
        for (int dir=0; dir<8; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (map[nr][nc] == 0) continue;
            if (check[nr][nc]) continue;
            check[nr][nc] = true;
            dfs(nr, nc);
        }
    }
     */
}