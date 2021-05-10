package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14442 {
    /*
    public static int R, C;
    public static int[][] map;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c)-'0';
            }
        }
        bfs(K);
    }

    public static void bfs (int K) {
        boolean[][][] visited = new boolean[R][C][K+1];
        visited[0][0][0] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(0, 0, 0, 1));
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == R-1 && cur.c == C-1) {
                System.out.println(cur.distance);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (map[nr][nc] == 0) {
                    if (!visited[nr][nc][cur.broken]) {
                        visited[nr][nc][cur.broken] = true;
                        queue.add(new Coordinate(nr, nc, cur.broken, cur.distance+1));
                    }
                } else {
                    if (cur.broken+1 <= K) {
                        if (!visited[nr][nc][cur.broken+1]) {
                            visited[nr][nc][cur.broken+1] = true;
                            queue.add(new Coordinate(nr, nc, cur.broken+1, cur.distance+1));
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
class Coordinate {
    int r, c, broken, distance;

    Coordinate (int r, int c, int broken, int distance) {
        this.r = r;
        this.c = c;
        this.broken = broken;
        this.distance = distance;
    }
}
 */