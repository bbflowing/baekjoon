package graph;

// 구슬 탈출2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q13460 {
    /*
    public static int R, C;
    public static char[][] board;
    public static Queue<Location> rq, bq;
    public static boolean[][][][] visited;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        rq = new ArrayDeque<>();
        bq = new ArrayDeque<>();
        visited = new boolean[R][C][R][C];
        String line = "";
        Location red = null; Location blue = null;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                board[r][c] = line.charAt(c);
                if (board[r][c] == 'R') {
                    red = new Location(r, c);
                    rq.add(red);
                } else if (board[r][c] == 'B') {
                    blue = new Location(r, c);
                    bq.add(blue);
                }
            }
        }
        visited[red.r][red.c][blue.r][blue.c] = true;
        int time = 0;
        while (true) {
            ++time;
            boolean result = bfs();
            if (result || time == 10) {
                if (result) break;
                else time = -1;
                break;
            }
        }
        System.out.println(time);
    }

    public static boolean bfs() {
        int size = rq.size();
        for (int i=0; i<size; ++i) {
            Location red = rq.poll();
            Location blue = bq.poll();

            for (int dir=0; dir<4; ++dir) {
                int nbr = blue.r;
                int nbc = blue.c;
                while (true) {
                    nbr += dr[dir];
                    nbc += dc[dir];
                    if (board[nbr][nbc] == '#') {
                        nbr -= dr[dir];
                        nbc -= dc[dir];
                        break;
                    } else if (board[nbr][nbc] == 'O') break;
                }
                if (board[nbr][nbc] == 'O') continue;

                int nrr = red.r;
                int nrc = red.c;
                while (true) {
                    nrr += dr[dir];
                    nrc += dc[dir];
                    if (board[nrr][nrc] == '#') {
                        nrr -= dr[dir];
                        nrc -= dc[dir];
                        break;
                    }
                    if (board[nrr][nrc] == 'O') return true;
                }
                if (nbr == nrr && nbc == nrc) {
                    if (dir == 0) {
                        if (blue.r < red.r) ++nrr;
                        else ++nbr;
                    } else if (dir == 1) {
                        if (blue.r < red.r) -- nbr;
                        else --nrr;
                    } else if (dir == 2) {
                        if (blue.c < red.c) ++nrc;
                        else ++nbc;
                    } else {
                        if (blue.c < red.c) --nbc;
                        else --nrc;
                    }
                }
                if (visited[nrr][nrc][nbr][nbc]) continue;
                visited[nrr][nrc][nbr][nbc] = true;
                rq.add(new Location(nrr, nrc));
                bq.add(new Location(nbr, nbc));
            }
        }
        return false;
    }
     */
}

/*
class Location {
    int r, c;

    Location (int r, int c) {
        this.r = r;
        this.c =c;
    }
}
 */