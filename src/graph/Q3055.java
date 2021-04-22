package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q3055 {
    /*
    public static int R, C;
    public static char[][] map;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        String line;
        Queue<Coordinate> wq = new ArrayDeque<>();
        boolean[][] water = new boolean[R][C];
        Queue<Coordinate> hq = new ArrayDeque<>();
        boolean[][] hedgehog = new boolean[R][C];
        for (int r = 0; r < R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'S') {
                    hq.add(new Coordinate(r, c, 0));
                    hedgehog[r][c] = true;
                } else if (map[r][c] == '*') {
                    wq.add(new Coordinate(r, c, 0));
                    water[r][c] = true;
                }
            }
        }
        bfs(wq, water, hq, hedgehog);
    }

    public static void bfs(Queue<Coordinate> wq, boolean[][] water,
                           Queue<Coordinate> hq, boolean[][] hedgehog) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};

        int dir = 0;
        int i = 0;
        while (!hq.isEmpty()) {
            int wSize = wq.size();
            for (i = 0; i < wSize; ++i) {
                Coordinate w = wq.poll();
                for (dir = 0; dir < 4; ++dir) {
                    int nwx = w.x + dx[dir];
                    int nwy = w.y + dy[dir];

                    if (nwx < 0 || R <= nwx || nwy < 0 || C <= nwy) {
                        continue;
                    }
                    if (water[nwx][nwy]) {
                        continue;
                    }
                    if (map[nwx][nwy] == 'D' || map[nwx][nwy] == 'X') {
                        continue;
                    }
                    wq.add(new Coordinate(nwx, nwy, w.time + 1));
                    water[nwx][nwy] = true;
                }
            }

            int hSize = hq.size();
            for (i = 0; i < hSize; ++i) {
                Coordinate h = hq.poll();
                if (map[h.x][h.y] == 'D') {
                    System.out.println(h.time);
                    return;
                }
                for (dir = 0; dir < 4; ++dir) {
                    int nhx = h.x + dx[dir];
                    int nhy = h.y + dy[dir];

                    if (nhx < 0 || R <= nhx || nhy < 0 || C <= nhy) {
                        continue;
                    }
                    if (hedgehog[nhx][nhy] || water[nhx][nhy]) {
                        continue;
                    }
                    if (map[nhx][nhy] == 'X') {
                        continue;
                    }
                    hq.add(new Coordinate(nhx, nhy, h.time + 1));
                    hedgehog[nhx][nhy] = true;
                }
            }
        }
        System.out.println("KAKTUS");
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int time;

    Coordinate(int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }
}
 */