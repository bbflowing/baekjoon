package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q18224 {
    /*
    public static int N;
    public static int[][] maze;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        maze = new int[N][N];
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                maze[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(M);
    }

    public static void bfs (int M) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][][][] visited = new boolean[2][M+1][N][N];
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(0, 0, 1, 0, 1));
        visited[0][1][0][0] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == N-1 && c.c == N-1) {
                if (c.time == 0) {
                    System.out.println(c.days+" sun");
                } else {
                    System.out.println(c.days+" moon");
                }
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                int ndistance = c.distance+1;
                int ntime = c.time;
                int ndays = c.days;
                if (ndistance == M+1) {
                    ndistance = 1;
                    if (ntime == 0) {
                        ntime = 1;
                    } else {
                        ntime = 0;
                        ++ndays;
                    }
                }
                if (maze[nr][nc] == 1) {
                    if (c.time == 1) {
                        while (true) {
                            nr += dr[dir];
                            nc += dc[dir];

                            if (nr < 0 || N <= nr || nc < 0 || N <= nc) break;
                            if (maze[nr][nc] == 0) {
                                if (!visited[ntime][ndistance][nr][nc]) {
                                    visited[ntime][ndistance][nr][nc] = true;
                                    queue.add(new Coordinate(nr, nc, ndays, ntime, ndistance));
                                }
                                break;
                            }
                        }
                    }
                } else {
                    if (visited[ntime][ndistance][nr][nc]) continue;
                    queue.add(new Coordinate(nr, nc, ndays, ntime, ndistance));
                    visited[ntime][ndistance][nr][nc] = true;
                }
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int days;
    int time;
    int distance;

    Coordinate (int r, int c, int days, int time, int distance) {
        this.r = r;
        this.c = c;
        this.days = days;
        this.time = time;
        this.distance = distance;
    }
}
 */