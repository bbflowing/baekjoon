package graph;

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
    public static Queue<Coordinate> person;
    public static Queue<Coordinate> fire;
    public static boolean[][] fireV;
    public static boolean[][] personV;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        person = new ArrayDeque<>();
        fire = new ArrayDeque<>();
        String line = "";
        personV = new boolean[R][C];
        fireV = new boolean[R][C];
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'J') {
                    person.add(new Coordinate(r, c));
                    personV[r][c] = true;
                } else if (map[r][c] == 'F') {
                    fire.add(new Coordinate(r, c));
                    fireV[r][c] = true;
                }
            }
        }
        int seconds = 0;
        while (true) {
            ++seconds;
            int result = bfs();
            if (result == 1) {
                System.out.println(seconds);
                break;
            } else if (result == -1) {
                System.out.println("IMPOSSIBLE");
                break;
            }
        }
    }

    public static int bfs() {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int size = fire.size();
        for (int i=0; i<size; ++i) {
            Coordinate f = fire.poll();
            for (int dir=0; dir<4; ++dir) {
                int nfr = f.r + dr[dir];
                int nfc = f.c + dc[dir];

                if (nfr<0 || R<=nfr || nfc<0 || C<=nfc) {
                    continue;
                }
                if (map[nfr][nfc] == '#') {
                    continue;
                }
                if (fireV[nfr][nfc]) {
                    continue;
                }
                fireV[nfr][nfc] = true;
                fire.add(new Coordinate(nfr, nfc));
            }
        }
        size = person.size();
        for (int i=0; i<size; ++i) {
            Coordinate p = person.poll();
            for (int dir=0; dir<4; ++dir) {
                int npr = p.r + dr[dir];
                int npc = p.c + dc[dir];

                if (npr<0 || R<=npr || npc<0 || C<=npc) {
                    return 1;
                }
                if (map[npr][npc] == '#') {
                    continue;
                }
                if (fireV[npr][npc] || personV[npr][npc]) {
                    continue;
                }
                personV[npr][npc] = true;
                person.add(new Coordinate(npr, npc));
            }
        }
        if (person.size() == 0) return -1;
        return 0;
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

