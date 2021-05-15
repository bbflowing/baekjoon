package graph;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1445 {
    /*
    public static int R, C;
    public static char[][] forest;
    public static int[][] cost;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        forest = new char[R][C];
        cost = new int[R][C];
        int[][] dp = new int[R][C];
        String line = "";
        Coordinate start = null;
        Coordinate flower = null;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            Arrays.fill(dp[r], -1);
            for (int c=0; c<C; ++c) {
                forest[r][c] = line.charAt(c);
                if (forest[r][c] == 'S') start = new Coordinate(r, c, 0, 0);
                else if (forest[r][c] == 'F') flower = new Coordinate(r, c, 0, 0);
                else if (forest[r][c] == 'g') {
                    cost[r][c] = 2;
                    for (int dir=0; dir<4; ++dir) {
                        int nr = r + dr[dir];
                        int nc = c + dc[dir];
                        if (!check(nr, nc)) continue;
                        if (cost[nr][nc] != 0) continue;
                        cost[nr][nc] = 1;
                    }
                }
            }
        }
        for (int r=0; r<R; ++r) {
            System.out.println(Arrays.toString(cost[r]));
        }
        cost[start.r][start.c] = 0;
        cost[flower.r][flower.c] = 0;
        solve(start, flower, dp);
    }

    public static void solve (Coordinate start, Coordinate flower, int[][] dp) throws IOException {
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        queue.add(start);
        dp[start.r][start.c] = 0;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            //System.out.println(cur.r+","+cur.c+","+cur.trash+","+cur.beside);
            if (cur.r == flower.r && cur.c == flower.c) {
                bw.append(cur.trash+" "+cur.beside);
                bw.flush();
                return;
            }

            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                int ntrash = cur.trash;
                int nbeside = cur.beside;

                if (!check(nr, nc)) continue;

                if (cost[nr][nc] == 2) ++ntrash;
                else if (cost[nr][nc] == 1) ++nbeside;

                if (dp[nr][nc] == -1 || ntrash < dp[nr][nc]) {
                    dp[nr][nc] = ntrash;
                    queue.add(new Coordinate(nr, nc, ntrash, nbeside));
                }
            }
        }
    }

    public static boolean check (int r, int c) {
        if (r<0 || R<=r || c<0 || C<=c) return false;
        return true;
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r, c, trash, beside;

    Coordinate (int r, int c, int trash, int beside) {
        this.r = r;
        this.c = c;
        this.trash = trash;
        this.beside = beside;
    }
    @Override
    public int compareTo(Coordinate c) {
        if (this.trash > c.trash) {
            return 1;
        } else if (this.trash == c.trash) {
            if (this.beside > c.beside) {
                return 1;
            } else if (this.beside == c.beside) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
 */
