package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q6004 {
    /*
    public static int R, C;
    public static char[][] pasture;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        pasture = new char[R][C];
        String line = "";
        int startR = 0; int startC = 0;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                pasture[r][c] = line.charAt(c);
                if (pasture[r][c] == 'K') {
                    startR = r; startC = c;
                }
            }
        }
        bfs(startR, startC);
    }

    public static void bfs (int r, int c) {
        int[] dr = {-1, -2, -2, -1, +1, +2, +2, +1};
        int[] dc = {-2, -1, +1, +2, -2, -1, +1, +2};
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(r, c, 0));
        boolean[][] visited = new boolean[R][C];
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (pasture[cur.r][cur.c] == 'H') {
                System.out.println(cur.hops);
                return;
            }
            for (int dir=0; dir<8; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[nr][nc]) continue;
                if (pasture[nr][nc] == '*') continue;
                visited[nr][nc] = true;
                queue.add(new Coordinate(nr, nc, cur.hops+1));
            }
        }
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int hops;

    Coordinate (int r, int c, int hops) {
        this.r = r;
        this.c = c;
        this.hops = hops;
    }
}
 */
