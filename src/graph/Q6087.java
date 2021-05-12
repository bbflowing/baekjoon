package graph;

import java.io.*;
import java.util.*;

public class Q6087 {
    /*
    public static int R, C;
    public static char[][] map;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        String line = "";
        Coordinate start = null;
        Coordinate end = null;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'C') {
                    if (start == null) start = new Coordinate(r, c, -1, 0);
                    else end = new Coordinate(r, c, -1,0);
                }
            }
        }
        bfs(start, end);
    }

    public static void bfs (Coordinate start, Coordinate end) {
        int[][] visited = new int[R][C];
        for (int r=0; r<R; ++r) Arrays.fill(visited[r], -1);
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        for (int i=0; i<4; ++i) {
            queue.add(new Coordinate(start.r, start.c, i, 0));
        }
        visited[start.r][start.c] = 0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == end.r && cur.c == end.c) {
                System.out.println(cur.changes);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (map[nr][nc] == '*') continue;

                if (cur.direction == dir) {
                    if (cur.changes <= visited[nr][nc] || visited[nr][nc] == -1) {
                        visited[nr][nc] = cur.changes;
                        queue.add(new Coordinate(nr, nc, cur.direction, cur.changes));
                    }
                } else {
                    if (cur.changes+1 <= visited[nr][nc] || visited[nr][nc] == -1) {
                        visited[nr][nc] = cur.changes+1;
                        queue.add(new Coordinate(nr, nc, dir, cur.changes+1));
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r, c, direction, changes;

    Coordinate (int r, int c, int direction, int changes) {
        this.r = r;
        this.c = c;
        this.direction = direction;
        this.changes = changes;
    }

    @Override
    public int compareTo (Coordinate c) {
        return this.changes - c.changes;
    }
}
 */