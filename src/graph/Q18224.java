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
        maze = new int[N][N];
        int M = Integer.parseInt(st.nextToken());
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
        visited[0][1][0][0] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(0, 1, 0, 0, 1));

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == N-1 && cur.c == N-1) {
                if (cur.night == 0) {
                    System.out.println(cur.days+" sun");
                } else {
                    System.out.println(cur.days+" moon");
                }
                return;
            }

            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                int nnight = cur.night;
                int ntimes = cur.times+1;
                int ndays = cur.days;

                if (ntimes == M+1) {
                    ntimes = 1;
                    if (nnight == 1) {
                        nnight = 0;
                        ++ndays;
                    } else {
                        nnight = 1;
                    }
                }
                if (maze[nr][nc] == 1) {
                    if (cur.night == 1) {
                        boolean success = false;
                        while (true) {
                            nr += dr[dir];
                            nc += dc[dir];

                            if (nr<0 || N<=nr || nc<0 || N<=nc) break;
                            if (maze[nr][nc] == 0) {
                                success = true;
                                break;
                            }
                        }
                        if (success) {
                            if (visited[nnight][ntimes][nr][nc]) continue;
                            visited[nnight][ntimes][nr][nc] = true;
                            queue.add(new Coordinate(nnight, ntimes, nr, nc, ndays));
                        }
                    }
                } else {
                    if (visited[nnight][ntimes][nr][nc]) continue;
                    visited[nnight][ntimes][nr][nc] = true;
                    queue.add(new Coordinate(nnight, ntimes, nr, nc, ndays));
                }
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Coordinate {
    int night;
    int times;
    int r;
    int c;
    int days;

    Coordinate (int night, int times, int r, int c, int days) {
        this.night = night;
        this.times = times;
        this.r = r;
        this.c = c;
        this.days = days;
    }
}
 */