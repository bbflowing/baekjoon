package graph;

// 불!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4179 {
    /*
    public static int R, C;
    public static char[][] maze;
    public static Queue<Location> pq;
    public static Queue<Location> fq;
    public static boolean[][] pv;
    public static boolean[][] fv;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char[R][C];
        pq = new ArrayDeque<>();
        fq = new ArrayDeque<>();
        pv = new boolean[R][C];
        fv = new boolean[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                maze[r][c] = line.charAt(c);
                if (maze[r][c] == 'J') {
                    pq.add(new Location(r, c));
                    pv[r][c] = true;
                } else if (maze[r][c] == 'F') {
                    fq.add(new Location(r, c));
                    fv[r][c] = true;
                }
            }
        }
        int time = 0;
        while (!pq.isEmpty()) {
            ++time;
            int result = bfs();
            if (result == -1 || result == 1) {
                if (result == -1) System.out.println("IMPOSSIBLE");
                else System.out.println(time);
                break;
            }
        }
    }

    public static int bfs() {
        int fs = fq.size();
        for (int i=0; i<fs; ++i) {
            Location cur = fq.poll();
            for (int dir=0; dir<4; ++dir) {
                int nfr = cur.r + dr[dir];
                int nfc = cur.c + dc[dir];
                if (nfr<0 || R<=nfr || nfc<0 || C<=nfc) continue;
                if (maze[nfr][nfc] == '#') continue;
                if (fv[nfr][nfc]) continue;
                fq.add(new Location(nfr, nfc));
                fv[nfr][nfc] = true;
            }
        }
        int ps = pq.size();
        for (int i=0; i<ps; ++i) {
            Location cur = pq.poll();
            for (int dir=0; dir<4; ++dir) {
                int npr = cur.r + dr[dir];
                int npc = cur.c + dc[dir];
                if (npr<0 || R<=npr || npc<0 || C<=npc) return 1;
                if (maze[npr][npc] == '#') continue;
                if (fv[npr][npc] || pv[npr][npc]) continue;
                pq.add(new Location(npr, npc));
                pv[npr][npc] = true;
            }
        }
        if (pq.isEmpty()) return -1;
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