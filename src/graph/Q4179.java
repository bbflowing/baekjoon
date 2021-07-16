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
    public static char[][] map;

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        String line = "";
        map = new char[R][C];
        Queue<Location> fq = new ArrayDeque<>();
        Queue<Location> pq = new ArrayDeque<>();
        boolean[][] fv = new boolean[R][C];
        boolean[][] pv = new boolean[R][C];

        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'J') {
                    pq.add(new Location(r, c));
                    pv[r][c] = true;
                } else if (map[r][c] == 'F') {
                    fq.add(new Location(r, c));
                    fv[r][c] = true;
                }
            }
        }
        bfs(fq, pq, fv, pv);
    }

    public static void bfs(Queue<Location> fq, Queue<Location> pq, boolean[][] fv, boolean[][] pv) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int time = 0;

        while (!pq.isEmpty()) {
            ++time;
            int fs = fq.size();
            for (int i=0; i<fs; ++i) {
                Location f = fq.poll();
                for (int dir=0; dir<4; ++dir) {
                    int nfr = f.r + dr[dir];
                    int nfc = f.c + dc[dir];
                    if (nfr<0 || R<=nfr || nfc<0 || C<=nfc) continue;
                    if (fv[nfr][nfc]) continue;
                    if (map[nfr][nfc] == '#') continue;
                    fv[nfr][nfc] = true;
                    fq.add(new Location(nfr, nfc));
                }
            }
            int ps = pq.size();
            for (int i=0; i<ps; ++i) {
                Location p = pq.poll();
                for (int dir=0; dir<4; ++dir) {
                    int npr = p.r + dr[dir];
                    int npc = p.c + dc[dir];
                    if (npr<0 || R<=npr || npc<0 || C<=npc) {
                        System.out.println(time);
                        return;
                    }
                    if (fv[npr][npc] || pv[npr][npc]) continue;
                    if (map[npr][npc] == '#') continue;
                    pv[npr][npc] = true;
                    pq.add(new Location(npr, npc));
                }
            }
        }
        System.out.println("IMPOSSIBLE");
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