package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14948 {
    /*
    public static int N, M;
    public static int[][] army;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        army = new int[N][M];

        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; ++j) {
                army[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs();
    }

    public static void bfs () {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        int[][][][] visited = new int[2][2][N][M];
        for (int i=0; i<2; ++i) {
            for (int j=0; j<2; ++j) {
                for (int k=0; k<N; ++k) {
                    Arrays.fill(visited[i][j][k], Integer.MAX_VALUE);
                }
            }
        }
        queue.add(new Coordinate(0, 0, 0, army[0][0]));
        visited[0][0][0][0] = army[0][0];
        int answer = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == N-1 && c.c == M-1) {
                answer = Math.min(answer, c.max);
                continue;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || M<=nc) {
                    continue;
                }
                int nmax = Math.max(c.max, army[nr][nc]);
                if (visited[c.skipped][0][nr][nc] > nmax) {
                    visited[c.skipped][0][nr][nc] = nmax;
                    queue.add(new Coordinate(nr, nc, c.skipped, nmax));
                }

                if (c.skipped == 0) {
                    int nnr = nr + dr[dir];
                    int nnc = nc + dc[dir];

                    if (nnr<0 || N<=nnr || nnc<0 || M<=nnc) {
                        continue;
                    }
                    nmax = Math.max(c.max, army[nnr][nnc]);
                    if (visited[1][0][nr][nc] > nmax && visited[0][1][nnr][nnc] > nmax) {
                        visited[1][0][nr][nc] = nmax;
                        visited[0][1][nnr][nnc] = nmax;
                        queue.add(new Coordinate(nnr, nnc, 1, nmax));
                    }
                }
            }
        }
        System.out.println(answer);
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r;
    int c;
    int skipped;
    int max;

    Coordinate (int r, int c, int skipped, int max) {
        this.r = r;
        this.c = c;
        this.skipped = skipped;
        this.max = max;
    }

    @Override
    public int compareTo (Coordinate c) {
        return this.max - c.max;
    }
}
 */