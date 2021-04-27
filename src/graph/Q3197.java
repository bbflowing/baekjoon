package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q3197 {
    /*
    public static int R, C;
    public static char[][] lake;
    public static Queue<Coordinate> swan;
    public static boolean[][] swanV;
    public static Queue<Coordinate> water;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        lake = new char[R][C];
        swan = new ArrayDeque<>();
        swanV = new boolean[R][C];
        water = new ArrayDeque<>();
        String line;
        boolean flag = false;
        Coordinate dst = null;

        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                lake[r][c] = line.charAt(c);
                if (lake[r][c] == 'L') {
                    lake[r][c] = '.';
                    if (!flag) {
                        swan.add(new Coordinate(r, c));
                        swanV[r][c] = true;
                        flag = true;
                    } else {
                        dst = new Coordinate(r, c);
                    }
                }
                if (lake[r][c] == '.') {
                    water.add(new Coordinate(r, c));
                }
            }
        }
        int days = 0;
        while (true) {
            if (swim(dst)) {
                break;
            }
            melt();
            ++days;
        }
        System.out.println(days);
    }

    public static boolean swim (Coordinate dst) {
        Queue<Coordinate> next = new ArrayDeque<>();
        while (!swan.isEmpty()) {
            Coordinate s = swan.poll();
            if (s.r == dst.r && s.c == dst.c) {
                return true;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = s.r + dr[dir];
                int nc = s.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) {
                    continue;
                }
                if (swanV[nr][nc]) {
                    continue;
                }
                swanV[nr][nc] = true;
                if (lake[nr][nc] == 'X') {
                    next.add(new Coordinate(nr, nc));
                } else if (lake[nr][nc] == '.') {
                    swan.add(new Coordinate(nr, nc));
                }
            }
        }
        swan = next;
        return false;
    }

    public static void melt () {
        int size = water.size();
        for (int i=0; i<size; ++i) {
            Coordinate w = water.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = w.r + dr[dir];
                int nc = w.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) {
                    continue;
                }
                if (lake[nr][nc] == 'X') {
                    lake[nr][nc] = '.';
                    water.add(new Coordinate(nr, nc));
                }
            }
        }
    }
     */
}

/*
class Coordinate {
    int r;
    int c;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */