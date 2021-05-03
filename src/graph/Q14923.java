package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14923 {
    /*
    public static int R, C;
    public static int[][] maze;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new int[R+1][C+1];
        st = new StringTokenizer(br.readLine());
        int startR = Integer.parseInt(st.nextToken());
        int startC = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int endR = Integer.parseInt(st.nextToken());
        int endC = Integer.parseInt(st.nextToken());
        for (int r=1; r<=R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=1; c<=C; ++c) {
                maze[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        bfs (startR, startC, endR, endC);
    }

    public static void bfs (int startR, int startC, int endR, int endC) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][][] visited = new boolean[2][R+1][C+1];
        visited[0][startR][startC] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(startR, startC, 0, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == endR && c.c == endC) {
                System.out.println(c.distance);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];
                int nbroken = c.broken;

                if (nr<1 || R<nr || nc<1 || C<nc) continue;
                if (maze[nr][nc] == 1) {
                    if (c.broken == 1) continue;
                    nbroken = 1;
                }
                if (visited[nbroken][nr][nc]) continue;
                visited[nbroken][nr][nc] = true;
                queue.add(new Coordinate(nr, nc, nbroken,c.distance+1));
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
    int broken;
    int distance;

    Coordinate (int r, int c, int broken, int distance) {
        this.r = r;
        this.c = c;
        this.broken = broken;
        this.distance = distance;
    }
}
 */