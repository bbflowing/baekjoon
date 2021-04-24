package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2206 {
    /*
    public static int R, C;
    public static int[][] map;


    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R+1][C+1];
        String line;
        for (int r=1; r<=R; ++r) {
            line = br.readLine();
            for (int c=1; c<=C; ++c) {
                map[r][c] = line.charAt(c-1)-'0';
            }
        }
        bfs();
    }

    public static void bfs() {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        boolean visited[][][] = new boolean[2][R+1][C+1];
        visited[0][1][1] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(1, 1, 0, 1));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == R && c.c == C) {
                System.out.println(c.distance);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dx[dir];
                int nc = c.c + dy[dir];

                if (nr<1 || R<nr || nc<1 || C<nc) {
                    continue;
                }
                if (map[nr][nc] == 0) {
                    if (!visited[c.broke][nr][nc]) {
                        visited[c.broke][nr][nc] = true;
                        queue.add(new Coordinate(nr, nc, c.broke, c.distance+1));
                    }
                } else {
                    if (c.broke == 0) {
                        if (!visited[1][nr][nc]) {
                            visited[1][nr][nc] = true;
                            queue.add(new Coordinate(nr, nc, 1, c.distance+1));
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
    int r;
    int c;
    int broke;
    int distance;

    Coordinate (int r, int c, int broke, int distance) {
        this.r = r;
        this.c = c;
        this.broke = broke;
        this.distance = distance;
    }
}
 */