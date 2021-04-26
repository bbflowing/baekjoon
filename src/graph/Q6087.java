package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        int[][] mirrors = new int[R][C];
        boolean flag = false;
        Coordinate start = null;
        Coordinate end = null;
        String line;

        for (int r = 0; r < R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) {
                map[r][c] = line.charAt(c);
                mirrors[r][c] = -1;
                if (map[r][c] == 'C') {
                    if (!flag) {
                        start = new Coordinate(r, c, -1, 0);
                        flag = true;
                    } else {
                        end = new Coordinate(r, c, -1, 0);
                    }
                }
            }
        }
        bfs(start, end, mirrors);
    }

    public static void bfs(Coordinate start, Coordinate end, int[][] mirrors) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        mirrors[start.r][start.c] = 0;
        for (int dir = 0; dir < 4; ++dir) {
            int nr = start.r + dr[dir];
            int nc = start.c + dc[dir];

            if (nr < 0 || R <= nr || nc < 0 || C <= nc) {
                continue;
            }
            if (map[nr][nc] == '*') {
                continue;
            }
            mirrors[nr][nc] = 0;
            queue.add(new Coordinate(nr, nc, dir, 0));
        }

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == end.r && c.c == end.c) {
                System.out.println(c.mirrors);
                return;
            }
            for (int dir = 0; dir < 4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr < 0 || R <= nr || nc < 0 || C <= nc) {
                    continue;
                }
                if (map[nr][nc] == '*') {
                    continue;
                }
                if (c.direction == dir) {
                    if (mirrors[nr][nc] >= c.mirrors || mirrors[nr][nc] == -1) {
                        mirrors[nr][nc] = c.mirrors;
                        queue.add(new Coordinate(nr, nc, dir, c.mirrors));
                    }
                } else {
                    if (mirrors[nr][nc] >= c.mirrors + 1 || mirrors[nr][nc] == -1) {
                        mirrors[nr][nc] = c.mirrors + 1;
                        queue.add(new Coordinate(nr, nc, dir, c.mirrors + 1));
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r;
    int c;
    int direction;
    int mirrors;

    Coordinate(int r, int c, int direction, int mirrors) {
        this.r = r;
        this.c = c;
        this.direction = direction;
        this.mirrors = mirrors;
    }

    @Override
    public int compareTo(Coordinate c) {
        return this.mirrors - c.mirrors;
    }
}
 */