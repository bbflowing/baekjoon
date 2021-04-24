package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q6087 {
    /*
    public static int R, C;
    public static char[][] map;

    public static void main (String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        String line;
        boolean flag = false;
        Coordinate start = null; Coordinate end = null;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'C') {
                    if (!flag) {
                        flag = true;
                        start = new Coordinate(r, c);
                    } else {
                        end = new Coordinate(r, c);
                    }
                }
            }
        }
        solve(start, end);
    }

    public static void solve (Coordinate start, Coordinate end) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int[][] visited = new int[R][C];
        for (int r=0; r<R; ++r) {
            Arrays.fill(visited[r], Integer.MAX_VALUE);
        }
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add(new Coordinate(start.r, start.c, -1, 0));
        visited[start.r][start.c] = 0;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == end.r && c.c == end.c) {
                System.out.println(c.mirrors);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) {
                    continue;
                }
                if (map[nr][nc] == '*') {
                    continue;
                }
                if (c.direction == -1) {
                    visited[nr][nc] = 0;
                    queue.add(new Coordinate(nr, nc, dir, 0));
                } else if (c.direction != dir) {
                    if (visited[nr][nc] >= c.mirrors+1) {
                        visited[nr][nc] = c.mirrors+1;
                        queue.add(new Coordinate(nr, nc, dir, c.mirrors+1));
                    }
                } else {
                    if (visited[nr][nc] >= c.mirrors) {
                        visited[nr][nc] = c.mirrors;
                        queue.add(new Coordinate(nr, nc, dir, c.mirrors));
                    }
                }
            }
        }
    }
    */
}

/*
class Coordinate implements Comparable<Coordinate>{
    int r;
    int c;
    int direction;
    int mirrors;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }

    Coordinate (int r, int c, int direction, int mirrors) {
        this.r = r;
        this.c = c;
        this.direction = direction;
        this.mirrors = mirrors;
    }

    @Override
    public int compareTo (Coordinate c) {
        return this.mirrors - c.mirrors;
    }
}
 */