package graph;

// 구슬 탈출3

import java.io.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q15644 {
    /*
    public static int R, C;
    public static boolean result;
    public static char[][] board;
    public static boolean[][][][] visited;
    public static Queue<Location> queue;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static char[] direction = {'U', 'D', 'L', 'R'};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        String line = "";
        int redR = 0; int redC = 0;
        int blueR = 0; int blueC = 0;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                board[r][c] = line.charAt(c);
                if (board[r][c] == 'B') {
                    blueR = r; blueC = c;
                } else if (board[r][c] == 'R') {
                    redR = r; redC = c;
                }
            }
        }
        visited = new boolean[R][C][R][C];
        queue = new ArrayDeque<>();
        queue.add(new Location(redR, redC, blueR, blueC, ""));
        visited[redR][redC][blueR][blueC] = true;
        int times = 0;
        result = false;
        while (true) {
            ++times;
            String route = move();
            if (result && times <= 10) {
                bw.append(String.valueOf(times));
                bw.newLine();
                bw.append(route);
                break;
            } else if (times == 10) {
                bw.append(String.valueOf(-1));
                break;
            }
        }
        bw.flush();
    }

    public static String move() {
        int size = queue.size();
        for (int i=0; i<size; ++i) {
            Location cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nbr = cur.br;
                int nbc = cur.bc;
                int nrr = cur.rr;
                int nrc = cur.rc;
                String nroute = cur.route;

                while (true) {
                    nbr += dr[dir];
                    nbc += dc[dir];

                    if (board[nbr][nbc] == 'O') break;
                    else if (board[nbr][nbc] == '#') {
                        if (dir == 0) ++nbr;
                        else if (dir == 1) --nbr;
                        else if (dir == 2) ++nbc;
                        else --nbc;
                        break;
                    }
                }
                if (board[nbr][nbc] == 'O') continue;

                while (true) {
                    nrr += dr[dir];
                    nrc += dc[dir];

                    if (board[nrr][nrc] == 'O') {
                        result = true;
                        return nroute+direction[dir];
                    } else if (board[nrr][nrc] == '#') {
                        if (dir == 0) ++nrr;
                        else if (dir == 1) --nrr;
                        else if (dir == 2) ++nrc;
                        else --nrc;
                        break;
                    }
                }

                if (nbr == nrr && nbc == nrc) {
                    if (dir == 0) {
                        if (cur.br < cur.rr) ++nrr;
                        else ++nbr;
                    } else if (dir == 1) {
                        if (cur.br < cur.rr) --nbr;
                        else --nrr;
                    } else if (dir == 2) {
                        if (cur.bc < cur.rc) ++nrc;
                        else ++nbc;
                    } else {
                        if (cur.bc < cur.rc) --nbc;
                        else --nrc;
                    }
                }

                if (!visited[nrr][nrc][nbr][nbc]) {
                    visited[nrr][nrc][nbr][nbc] = true;
                    nroute += direction[dir];
                    queue.add(new Location(nrr, nrc, nbr, nbc, nroute));
                }
            }
        }
        return "";
    }
     */
}

/*
class Location {
    int rr, rc, br, bc;
    String route;

    Location (int rr, int rc, int br, int bc, String route) {
        this.rr = rr;
        this.rc = rc;
        this.br = br;
        this.bc = bc;
        this.route = route;
    }
}
 */