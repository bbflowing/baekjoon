package graph;

// 구슬 탈출4

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q15653 {
    /*
    public static int R, C;
    public static char[][] board;
    public static boolean[][][][] visited;
    public static Queue<Location> rq, bq;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C  = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        visited = new boolean[R][C][R][C];
        String line = "";
        Location blue = null; Location red = null;
        bq = new ArrayDeque<>();
        rq = new ArrayDeque<>();

        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                board[r][c] = line.charAt(c);
                if (board[r][c] == 'R') {
                    rq.add(new Location(r, c));
                    red = new Location(r, c);
                } else if (board[r][c] == 'B') {
                    bq.add(new Location(r, c));
                    blue = new Location(r, c);
                }
            }
        }
        visited[red.r][red.c][blue.r][blue.c] = true;
        int times = 0;
        while (true) {
            ++times;
            if (move()) {
                System.out.println(times);
                break;
            }
            if (rq.size() == 0) {
                System.out.println(-1);
                break;
            }
        }
    }

    public static boolean move() {
        int size = rq.size();
        for (int i=0; i<size; ++i) {
            Location b = bq.poll();
            Location r = rq.poll();
            for (int dir=0; dir<4; ++dir) {
                int nbr = b.r;
                int nbc = b.c;
                int nrr = r.r;
                int nrc = r.c;

                while (true) {
                    nbr += dr[dir];
                    nbc += dc[dir];

                    if (board[nbr][nbc] == 'O') break;
                    else if (board[nbr][nbc] == '#') {
                        Location nb = adjust(dir, nbr, nbc);
                        nbr = nb.r;
                        nbc = nb.c;
                        break;
                    }
                }

                if (board[nbr][nbc] == 'O') continue;

                while (true) {
                    nrr += dr[dir];
                    nrc += dc[dir];

                    if (board[nrr][nrc] == 'O') return true;
                    else if (board[nrr][nrc] == '#') {
                        Location nr = adjust(dir, nrr, nrc);
                        nrr = nr.r;
                        nrc = nr.c;
                        break;
                    }
                }

                if (nbr == nrr && nbc == nrc) {
                    if (dir == 0) {
                        if (b.r < r.r) ++nrr;
                        else ++nbr;
                    } else if (dir == 1) {
                        if (b.r < r.r) --nbr;
                        else --nrr;
                    } else if (dir == 2) {
                        if (b.c < r.c) ++nrc;
                        else ++nbc;
                    } else {
                        if (b.c < r.c) --nbc;
                        else --nrc;
                    }
                }

                if (!visited[nrr][nrc][nbr][nbc]) {
                    visited[nrr][nrc][nbr][nbc] = true;
                    rq.add(new Location(nrr, nrc));
                    bq.add(new Location(nbr, nbc));
                }
            }
        }
        return false;
    }

    public static Location adjust(int dir, int r, int c) {
        if (dir == 0) ++r;
        else if (dir == 1) --r;
        else if (dir == 2) ++c;
        else --c;
        return new Location(r, c);
    }
     */
}

/*
class Location {
    int r, c;

    Location(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */