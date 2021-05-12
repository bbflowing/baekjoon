package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14948 {
    /*
    public static int R, C;
    public static int[][] army;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        army = new int[R][C];
        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) {
                army[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        bfs();
    }

    public static void bfs() {
        int[][][][] visited = new int[2][2][R][C];
        for (int i=0; i<2; ++i) {
            for (int j=0; j<2; ++j) {
                for (int k=0; k<R; ++k) Arrays.fill(visited[i][j][k], -1);
            }
        }
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add(new Coordinate(0, 0, 0, army[0][0]));
        visited[0][0][0][0] = army[0][0];
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == R-1 && cur.c == C-1) {
                System.out.println(cur.max);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                int nmax = cur.max;

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                nmax = Math.max(cur.max, army[nr][nc]);
                if (visited[0][cur.skipped][nr][nc] != -1 && visited[0][cur.skipped][nr][nc] <= nmax) continue;
                visited[0][cur.skipped][nr][nc] = nmax;
                queue.add(new Coordinate(cur.skipped, nr, nc, nmax));
                if (cur.skipped == 0) {
                    int nnr = nr + dr[dir];
                    int nnc = nc + dc[dir];
                    if (nnr<0 || R<=nnr || nnc<0 || C<=nnc) continue;
                    nmax = Math.max(army[nnr][nnc], cur.max);
                    if (visited[1][0][nr][nc] != -1 && visited[1][0][nr][nc] <= nmax) continue;
                    if (visited[0][1][nnr][nnc] != -1 && visited[0][1][nnr][nnc] <= nmax) continue;
                    visited[1][0][nr][nc] = nmax;
                    visited[0][1][nnr][nnc] = nmax;
                    queue.add(new Coordinate(1, nnr, nnc, nmax));
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int skipped, r, c, max;

    Coordinate (int skipped, int r, int c, int max) {
        this.skipped = skipped;
        this.r = r;
        this.c = c;
        this.max = max;
    }

    @Override
    public int compareTo (Coordinate c) {
        return this.max - c.max;
    }
}
 */