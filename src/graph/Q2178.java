package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
    /*
    public static int R, C;
    public static int[][] maze;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new int[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                maze[r][c] = line.charAt(c) - '0';
            }
        }
        bfs();
    }

    public static void bfs () {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][] visited = new boolean[R][C];
        visited[0][0] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(0, 0, 1));

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
                if (visited[nr][nc]) continue;
                if (maze[nr][nc] == 0) continue;
                visited[nr][nc] = true;
                queue.add(new Coordinate(nr, nc, cur.distance+1));
            }
        }
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int distance;

    Coordinate (int r, int c, int distance) {
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */