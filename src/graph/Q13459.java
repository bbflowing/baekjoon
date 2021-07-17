package graph;

//구슬 탈출

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q13459 {
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
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        String line = "";
        Location blue = null;
        Location red = null;
        rq = new ArrayDeque<>();
        bq = new ArrayDeque<>();
        visited = new boolean[R][C][R][C];
        for (int r = 0; r < R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) {
                board[r][c] = line.charAt(c);
                if (board[r][c] == 'B') {
                    blue = new Location(r, c);
                    bq.add(new Location(r, c));
                } else if (board[r][c] == 'R') {
                    red = new Location(r, c);
                    rq.add(new Location(r, c));
                }
            }
        }
        visited[blue.r][blue.c][red.r][red.c] = true;
        int times = 0;
        while (true) {
            ++times;
            if (move() && times <= 10) {
                times = 1;
                break;
            } else if (times == 10) {
                times = 0;
                break;
            }
        }
        System.out.println(times);

    }

    public static boolean move() {
        int bs = bq.size();
        for (int i = 0; i < bs; ++i) {
            Location b = bq.poll();
            Location r = rq.poll();

            for (int dir = 0; dir < 4; ++dir) {
                int nbr = b.r;
                int nbc = b.c;
                int nrr = r.r;
                int nrc = r.c;
                boolean bf = false;
                boolean rf = false;

                while (!bf) {
                    nbr += dr[dir];
                    nbc += dc[dir];
                    if (board[nbr][nbc] == 'O') break;
                    else if (board[nbr][nbc] == '#') {
                        Location nb = adjust(dir, nbr, nbc);
                        nbr = nb.r;
                        nbc = nb.c;
                        bf = true;
                        break;
                    }
                }

                if (board[nbr][nbc] == 'O') continue;

                while (!rf) {
                    nrr += dr[dir];
                    nrc += dc[dir];
                    if (board[nrr][nrc] == 'O') return true;
                    else if (board[nrr][nrc] == '#') {
                        Location nr = adjust(dir, nrr, nrc);
                        nrr = nr.r;
                        nrc = nr.c;
                        rf = true;
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

                if (bf && rf) {
                    if (!visited[nbr][nbc][nrr][nrc]) {
                        visited[nbr][nbc][nrr][nrc] = true;
                        bq.add(new Location(nbr, nbc));
                        rq.add(new Location(nrr, nrc));
                    }
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