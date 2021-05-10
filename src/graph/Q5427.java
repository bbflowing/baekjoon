package graph;

import java.io.*;
import java.util.*;

public class Q5427 {
    /*
    public static int C, R;
    public static char[][] map;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            map = new char[R][C];
            String line = "";
            boolean[][] fireV = new boolean[R][C];
            boolean[][] personV = new boolean[R][C];
            Queue<Coordinate> fire = new ArrayDeque<>();
            Queue<Coordinate> person = new ArrayDeque<>();
            for (int r=0; r<R; ++r) {
                line = br.readLine();
                for (int c=0; c<C; ++c) {
                    map[r][c] = line.charAt(c);
                    if (map[r][c] == '@') {
                        person.add(new Coordinate(r, c, 0));
                        personV[r][c] = true;
                    } else if (map[r][c] == '*') {
                        fire.add(new Coordinate(r, c, 0));
                        fireV[r][c] = true;
                    }
                }
            }
            int answer = bfs(fire, person, fireV, personV);
            if (answer == -1) {
                bw.append("IMPOSSIBLE");
            } else {
                bw.append(String.valueOf(answer));
            }
            bw.newLine();
        }
        bw.flush();
    }

    public static int bfs (Queue<Coordinate> fire, Queue<Coordinate> person,
                            boolean[][] fireV, boolean[][] personV) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!person.isEmpty()) {
            int fireS = fire.size();
            for (int i = 0; i < fireS; ++i) {
                Coordinate f = fire.poll();
                for (int dir = 0; dir < 4; ++dir) {
                    int nfr = f.r + dr[dir];
                    int nfc = f.c + dc[dir];

                    if (nfr < 0 || R <= nfr || nfc < 0 || C <= nfc) continue;
                    if (fireV[nfr][nfc]) continue;
                    if (map[nfr][nfc] == '#') continue;
                    fireV[nfr][nfc] = true;
                    fire.add(new Coordinate(nfr, nfc, f.time + 1));
                }
            }

            int personS = person.size();
            for (int i = 0; i < personS; ++i) {
                Coordinate p = person.poll();
                for (int dir = 0; dir < 4; ++dir) {
                    int npr = p.r + dr[dir];
                    int npc = p.c + dc[dir];

                    if (npr < 0 || R <= npr || npc < 0 || C <= npc) {
                        return (p.time + 1);
                    }
                    if (fireV[npr][npc] || personV[npr][npc]) continue;
                    if (map[npr][npc] == '#') continue;
                    personV[npr][npc] = true;
                    person.add(new Coordinate(npr, npc, p.time + 1));
                }
            }
        }
        return -1;
    }
     */
}

/*
class Coordinate {
    int r, c, time;

    Coordinate (int r, int c, int time) {
        this.r = r;
        this.c = c;
        this.time = time;
    }
}
 */