package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q18224 {
    /*
    public static int N;
    public static int M;
    public static int maze[][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][N];
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                maze[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        bfs();
    }

    public static void bfs() {
        boolean visited[][][][] = new boolean[2][M+1][N][N];
        visited[0][1][0][0] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(0, 0, 1,0, 0));
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c= queue.poll();
            if (c.r == N-1 && c.c == N-1) {
                if (c.time == 0) {
                    System.out.println(c.day+" sun");
                } else {
                    System.out.println(c.day+" moon");
                }
                return;
            }

            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) {
                    continue;
                }
                int ntime = c.time;
                int nmoves = c.moves+1;
                int nday = c.day;
                if (nmoves == M) {
                    nmoves = 0;
                    if (c.time == 0) {
                        ntime = 1;
                    } else {
                        ntime = 0;
                        nday += 1;
                    }
                }
                if (visited[ntime][nmoves][nr][nc]) {
                    continue;
                }
                if (maze[nr][nc] == 1) {
                    if (c.time == 1) {
                        boolean success = false;
                        while (true) {
                            nr += dr[dir];
                            nc += dc[dir];

                            if (nr < 0 || N <= nr || nc < 0 || N <= nc) {
                                break;
                            }
                            if (maze[nr][nc] == 0) {
                                success = true;
                                break;
                            }
                        }
                        if (success) {
                            if (visited[ntime][nmoves][nr][nc]) {
                                continue;
                            }
                            visited[ntime][nmoves][nr][nc] = true;
                            queue.add(new Coordinate(ntime, nmoves, nday, nr, nc));
                        }
                    }
                } else if (maze[nr][nc] != 1) {
                    visited[ntime][nmoves][nr][nc] = true;
                    queue.add(new Coordinate(ntime, nmoves, nday, nr, nc));
                }

            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Coordinate {
    int time;
    int moves;
    int day;
    int r;
    int c;

    Coordinate (int time, int moves, int day, int r, int c) {
        this.time = time;
        this.moves = moves;
        this.day = day;
        this.r = r;
        this.c = c;
    }
}
 */


