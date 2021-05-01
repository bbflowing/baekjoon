package graph;

import java.io.*;
import java.util.*;

public class Q6087 {
    /*
    // 레이저 통신
    public static int R, C;
    public static char[][] map;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        int[][] visited = new int[R][C];
        String line = "";
        Coordinate start = null;
        boolean flag = false;
        for (int r = 0; r < R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) {
                map[r][c] = line.charAt(c);
                visited[r][c] = Integer.MAX_VALUE;
                if (map[r][c] == 'C') {
                    if (!flag) {
                        visited[r][c] = 0;
                        start = new Coordinate(r, c, -1, 0);
                        flag = true;
                    }
                }
            }
        }
        bfs(start, visited);
    }

    public static void bfs(Coordinate start, int[][] visited) throws IOException {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        int nr = 0;
        int nc = 0;
        int dir = 0;
        for (dir = 0; dir < 4; ++dir) {
            nr = start.r + dr[dir];
            nc = start.c + dc[dir];
            if (!check(nr, nc) || map[nr][nc] == '*') continue;
            visited[nr][nc] = 0;
            queue.add(new Coordinate(nr, nc, dir, 0));
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (map[c.r][c.c] == 'C') {
                StringBuilder sb = new StringBuilder().append(c.mirrors);
                bw.append(sb).flush();
                return;
            }
            for (dir = 0; dir < 4; ++dir) {
                nr = c.r + dr[dir];
                nc = c.c + dc[dir];
                if (!check(nr, nc) || map[nr][nc] == '*') continue;
                int nmirrors = c.mirrors;
                if (c.direction != dir) ++nmirrors;
                if (visited[nr][nc] < nmirrors) continue;
                visited[nr][nc] = nmirrors;
                queue.add(new Coordinate(nr, nc, dir, nmirrors));
            }
        }
    }

    public static boolean check(int r, int c) {
        if (r < 0 || R <= r || c < 0 || C <= c) {
            return false;
        }
        return true;
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
