package graph;

// 벽 부수고 이동하기2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14442 {
    /*
    public static int R, C, K;
    public static char[][] map;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        String line = "";
        for (int r = 0; r < R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) map[r][c] = line.charAt(c);
        }
        bfs();
    }

    public static void bfs() {
        Queue<Location> queue = new ArrayDeque<>();
        boolean[][][] visited = new boolean[K+1][R][C];
        queue.add(new Location(0, 0, 0, 1));
        visited[0][0][0] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

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
                if (map[nr][nc] == '0') {
                    if (!visited[cur.broken][nr][nc]) {
                        visited[cur.broken][nr][nc] = true;
                        queue.add(new Location(cur.broken, nr, nc, cur.distance + 1));
                    }
                } else {
                    if (cur.broken+1 <= K) {
                        if (!visited[cur.broken+1][nr][nc]) {
                            visited[cur.broken+1][nr][nc] = true;
                            queue.add(new Location(cur.broken+1, nr, nc, cur.distance+1));
                        }
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

    Location(int broken, int r, int c, int distance) {
        this.r = r;
        this.c = c;
        this.broken = broken;
        this.distance = distance;
    }
}
 */
