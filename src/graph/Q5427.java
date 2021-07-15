package graph;

import java.io.*;
import java.util.*;

public class Q5427 {
    /*
    public static int R, C;
    public static char[][] building;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String line = "";
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            building = new char[R][C];
            Queue<Blank> sq = new ArrayDeque<>();
            Queue<Blank> fq = new ArrayDeque<>();
            boolean[][] sv = new boolean[R][C];
            boolean[][] fv = new boolean[R][C];
            for (int r=0; r<R; ++r) {
                line = br.readLine();
                for (int c=0; c<C; ++c) {
                    building[r][c] = line.charAt(c);
                    if (building[r][c] == '*') {
                        fv[r][c] = true;
                        fq.add(new Blank(r, c));
                    } else if (building[r][c] == '@') {
                        sv[r][c] = true;
                        sq.add(new Blank(r, c));
                    }
                }
            }
            int result = bfs(sq, fq, sv, fv);
            if (result != -1) bw.append(String.valueOf(result));
            else bw.append("IMPOSSIBLE");
            bw.newLine();
        }
        bw.flush();
    }

    public static int bfs (Queue<Blank> sq, Queue<Blank> fq, boolean[][] sv, boolean[][] fv) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int time = 0;
        while (!sq.isEmpty()) {
            ++time;
            int fs = fq.size();
            for (int i=0; i<fs; ++i) {
                Blank cf = fq.poll();
                for (int dir = 0; dir < 4; ++dir) {
                    int nfr = cf.r + dr[dir];
                    int nfc = cf.c + dc[dir];
                    if (nfr < 0 || R <= nfr || nfc < 0 || C <= nfc) continue;
                    if (fv[nfr][nfc]) continue;
                    if (building[nfr][nfc] == '#') continue;
                    fv[nfr][nfc] = true;
                    fq.add(new Blank(nfr, nfc));
                }
            }

            int ss = sq.size();
            for (int i=0; i<ss; ++i) {
                Blank cs = sq.poll();
                for (int dir=0; dir<4; ++dir) {
                    int nsr = cs.r + dr[dir];
                    int nsc = cs.c + dc[dir];
                    if (nsr<0 || R<=nsr || nsc<0 || C<=nsc) return time;
                    if (fv[nsr][nsc] || sv[nsr][nsc]) continue;
                    if (building[nsr][nsc] == '#') continue;
                    sv[nsr][nsc] = true;
                    sq.add(new Blank(nsr, nsc));
                }
            }
        }
        return -1;
    }
     */
}

/*
class Blank {
    int r, c;

    Blank(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */