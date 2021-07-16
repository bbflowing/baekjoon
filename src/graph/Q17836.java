package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 공주님을 구해라!

public class Q17836 {
    /*
    public static int R, C, T;
    public static int[][] castle;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        castle = new int[R][C];
        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) castle[r][c] = Integer.parseInt(st.nextToken());
        }
        int result = bfs();
        if (result == -1) System.out.println("Fail");
        else System.out.println(result);
    }

    public static int bfs() {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Location> queue = new ArrayDeque<>();
        boolean[][][] visited = new boolean[2][R][C];
        visited[0][0][0] = true;
        queue.add(new Location(0, 0, 0, 0));

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == R-1 && cur.c == C-1) return cur.time;
            if (cur.time > T) return -1;
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[cur.sword][nr][nc]) continue;
                if (castle[nr][nc] == 2) {
                    visited[0][nr][nc] = true;
                    visited[1][nr][nc] = true;
                    queue.add(new Location(1, nr, nc, cur.time+1));
                } else if (castle[nr][nc] == 1) {
                    if (cur.sword == 1) {
                        visited[1][nr][nc] = true;
                        queue.add(new Location(1, nr, nc, cur.time+1));
                    }
                } else {
                    visited[cur.sword][nr][nc] = true;
                    queue.add(new Location(cur.sword, nr, nc, cur.time+1));
                }
            }
        }
        return -1;
    }
     */
}

/*
class Location {
    int r, c, sword, time;

    Location(int sword, int r, int c, int time) {
        this.r = r;
        this.c = c;
        this.sword = sword;
        this.time = time;
    }
}
 */