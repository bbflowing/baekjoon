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
    public static char[][] board;
    public static Queue<Location> queue;
    public static boolean[][][][] visited;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static String[] direction = {"U", "D", "L", "R"};
    public static boolean result;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        visited = new boolean[R][C][R][C];
        queue = new ArrayDeque<>();
        String line = "";
        int redr = 0; int redc = 0;
        int bluer = 0; int bluec = 0;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                board[r][c] = line.charAt(c);
                if (board[r][c] == 'R') {
                    redr = r; redc = c;
                } else if (board[r][c] == 'B') {
                    bluer = r; bluec =c;
                }
            }
        }
        queue.add(new Location(redr, redc, bluer, bluec, ""));
        visited[redr][redc][bluer][bluec] = true;
        int times = 0;
        result = false;
        while (true) {
            ++times;
            String route = bfs();
            if (result || times == 10) {
                if (result) {
                    System.out.println(times);
                    System.out.println(route);
                } else {
                    System.out.println(-1);
                }
                break;
            }
        }
    }

    public static String bfs() {
        int size = queue.size();
        for (int i=0; i<size; ++i) {
            Location cur = queue.poll();

            for (int dir=0; dir<4; ++dir) {
                int nrr = cur.rr;
                int nrc = cur.rc;
                int nbr = cur.br;
                int nbc = cur.bc;

                while (true) {
                    nbr += dr[dir];
                    nbc += dc[dir];

                    if (board[nbr][nbc] == 'O') break;
                    else if (board[nbr][nbc] == '#') {
                        nbr -= dr[dir];
                        nbc -= dc[dir];
                        break;
                    }
                }
                if (board[nbr][nbc] == 'O') continue;

                String nroute = cur.route + direction[dir];
                while(true) {
                    nrr += dr[dir];
                    nrc += dc[dir];

                    if (board[nrr][nrc] == 'O') {
                        result = true;
                        return nroute;
                    }
                    else if (board[nrr][nrc] == '#') {
                        nrr -= dr[dir];
                        nrc -= dc[dir];
                        break;
                    }
                }

                if (nbr == nrr && nbc == nrc) {
                    if (dir == 0) {
                        if (cur.rr < cur.br) ++nbr;
                        else ++nrr;
                    } else if (dir == 1) {
                        if (cur.rr < cur.br) --nrr;
                        else --nbr;
                    } else if (dir == 2) {
                        if (cur.rc < cur.bc) ++nbc;
                        else ++nrc;
                    } else {
                        if (cur.rc < cur.bc) --nrc;
                        else --nbc;
                    }
                }

                if (visited[nrr][nrc][nbr][nbc]) continue;
                visited[nrr][nrc][nbr][nbc] = true;
                queue.add(new Location(nrr, nrc, nbr, nbc, nroute));
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

    Location(int rr, int rc, int br, int bc, String route) {
        this.rr = rr;
        this.rc = rc;
        this.br = br;
        this.bc = bc;
        this.route = route;
    }
}
 */