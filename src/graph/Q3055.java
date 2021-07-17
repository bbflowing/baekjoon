package graph;

// 탈출

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q3055 {
    /*
    public static int R, C;
    public static char[][] map;
    public static Queue<Location> hq, wq;
    public static boolean[][] hv, wv;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        String line = "";
        hq = new ArrayDeque<>();
        wq = new ArrayDeque<>();
        hv = new boolean[R][C];
        wv = new boolean[R][C];
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'S') {
                    hv[r][c] = true;
                    hq.add(new Location(r, c));
                } else if (map[r][c] == '*') {
                    wv[r][c] = true;
                    wq.add(new Location(r, c));
                }
            }
        }
        int time = 0;
        while (true) {
            ++time;
            int result = bfs();
            if (result != 0) {
                if (result == -1) System.out.println("KAKTUS");
                else System.out.println(time);
                break;
            }
        }
    }

    public static int bfs() {
        int ws = wq.size();
        for (int i=0; i<ws; ++i) {
            Location w = wq.poll();
            for (int dir=0; dir<4; ++dir) {
                int nwr = w.r + dr[dir];
                int nwc = w.c + dc[dir];
                if (nwr<0 || R<=nwr || nwc<0 || C<=nwc) continue;
                if (wv[nwr][nwc]) continue;
                if (map[nwr][nwc] == 'D' || map[nwr][nwc] == 'X') continue;
                wv[nwr][nwc] = true;
                wq.add(new Location(nwr, nwc));
            }
        }

        int hs = hq.size();
        for (int i=0; i<hs; ++i) {
            Location h = hq.poll();
            for (int dir=0; dir<4; ++dir) {
                int nhr = h.r + dr[dir];
                int nhc = h.c + dc[dir];
                if (nhr<0 || R<=nhr || nhc<0 || C<=nhc) continue;
                if (wv[nhr][nhc] || hv[nhr][nhc]) continue;
                if (map[nhr][nhc] == 'X') continue;
                else if (map[nhr][nhc] == 'D') return 1;
                hv[nhr][nhc] = true;
                hq.add(new Location(nhr, nhc));
            }
        }
        if (hq.size() == 0) return -1;
        return 0;
    }
     */
}

/*
class Location {
    int r, c;

    Location (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */