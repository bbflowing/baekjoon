package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 벽 부수고 이동하기

public class Q2206 {
    /*
    public static int R, C;
    public static char[][] map;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) map[r][c] = line.charAt(c);
        }
        bfs();
    }

    public static void bfs() {
        boolean[][][] visited = new boolean[2][R][C];
        Queue<Location> queue = new ArrayDeque<>();
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        queue.add(new Location(0, 0, 0, 1));
        visited[0][0][0] = true;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == R-1 && cur.c == C-1) {
                System.out.println(cur.distance);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (!visited[cur.broken][nr][nc] && map[nr][nc] == '0') {
                    visited[cur.broken][nr][nc] = true;
                    queue.add(new Location(nr, nc, cur.broken, cur.distance+1));
                }
                if (cur.broken == 0 && map[nr][nc] == '1') {
                    if (!visited[1][nr][nc]) {
                        visited[1][nr][nc] = true;
                        queue.add(new Location(nr, nc, 1, cur.distance+1));
                    }
                }
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Location {
    int r, c, broken, distance;

    Location(int r, int c, int broken, int distance) {
        this.r = r;
        this.c = c;
        this.broken = broken;
        this.distance = distance;
    }
}

 */
