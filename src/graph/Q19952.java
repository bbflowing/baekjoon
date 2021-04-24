package graph;

import java.io.*;
import java.util.*;

public class Q19952 {
    /*
    public static int R, C;
    public static int[][] elevations;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            elevations = new int[R+1][C+1];
            int O = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken());
            int startR = Integer.parseInt(st.nextToken());
            int startC  = Integer.parseInt(st.nextToken());
            int endR = Integer.parseInt(st.nextToken());
            int endC = Integer.parseInt(st.nextToken());
            for (int o=0; o<O; ++o) {
                st = new StringTokenizer(br.readLine());
                int r = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int l = Integer.parseInt(st.nextToken());
                elevations[r][c] = l;
            }
            String success = "잘했어!!";
            String fail = "인성 문제있어??";

            if (bfs(F, startR, startC, endR, endC)) {
                bw.append(success);
            } else {
                bw.append(fail);
            }
            bw.newLine();
        }
        bw.flush();
    }

    public static boolean bfs (int F, int startR, int startC, int endR, int endC) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(startR, startC, F));
        boolean[][] visited = new boolean[R+1][C+1];
        visited[startR][startC] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == endR && c.c == endC) {
                return true;
            }
            if (c.f == 0) {
                return false;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<1 || R<nr || nc<1 || C<nc) {
                    continue;
                }
                if (visited[nr][nc]) {
                    continue;
                }
                if (elevations[nr][nc] == 0) {
                    queue.add(new Coordinate(nr, nc, c.f-1));
                    visited[nr][nc] = true;
                } else {
                    if (c.f >= elevations[nr][nc]-elevations[c.r][c.c]) {
                        queue.add(new Coordinate(nr, nc, c.f-1));
                        visited[nr][nc] = true;
                    }
                }
            }
        }
        return false;
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int f;

    Coordinate (int r, int c, int f) {
        this.r = r;
        this.c = c;
        this.f = f;
    }
}
 */