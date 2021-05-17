package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 벽 부수고 이동하기

public class Q2206 {
    /*
    public static int R, C;
    public static int[][] map;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        String line = "";
        for (int r = 0; r < R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) map[r][c] = line.charAt(c) - '0';
        }
        bfs();
    }

    public static void bfs() {
        boolean[][][] visited = new boolean[2][R][C];
        Queue<Coordinate> queue = new ArrayDeque<>();
        visited[0][0][0] = true;
        queue.add(new Coordinate(0, 0, 0, 1));
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == R - 1 && cur.c == C - 1) {
                System.out.println(cur.distance);
                return;
            }
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                if (map[nr][nc] == 1) {
                    if (cur.broken == 0 && !visited[1][nr][nc]) {
                        visited[1][nr][nc] = true;
                        queue.add(new Coordinate(1, nr, nc, cur.distance + 1));

                    }
                } else {
                    if (!visited[cur.broken][nr][nc]) {
                        visited[cur.broken][nr][nc] = true;
                        queue.add(new Coordinate(cur.broken, nr, nc, cur.distance + 1));
                    }
                }
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Coordinate {
    int broken, r, c, distance;

    Coordinate(int broken, int r, int c, int distance) {
        this.broken = broken;
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */