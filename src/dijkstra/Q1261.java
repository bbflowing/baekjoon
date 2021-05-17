package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 알고스팟

public class Q1261 {
    /*
    public static int R, C;
    public static int[][] maze;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        maze = new int[R][C];
        int[][] visited = new int[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            Arrays.fill(visited[r], -1);
            for (int c=0; c<C; ++c) maze[r][c] = line.charAt(c)-'0';
        }
        dijkstra(visited);
    }

    public static void dijkstra(int[][] visited) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        visited[0][0] = 0;
        queue.add(new Coordinate(0, 0, 0));

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == R-1 && cur.c == C-1) {
                System.out.println(cur.broken);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (maze[nr][nc] == 1) {
                    if (visited[nr][nc] == -1 || cur.broken+1 < visited[nr][nc]) {
                        visited[nr][nc] = cur.broken+1;
                        queue.add(new Coordinate(nr, nc, cur.broken+1));
                    }
                } else {
                    if (visited[nr][nc] == -1 || cur.broken < visited[nr][nc]) {
                        visited[nr][nc] = cur.broken;
                        queue.add(new Coordinate(nr, nc, cur.broken));
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r, c, broken;

    Coordinate (int r, int c, int broken) {
        this.r = r;
        this.c = c;
        this.broken = broken;
    }

    @Override
    public int compareTo(Coordinate c) {
        return this.broken-c.broken;
    }
}
 */