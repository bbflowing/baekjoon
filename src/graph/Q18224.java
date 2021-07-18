package graph;

// 미로에 갇힌 건우

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q18224 {
    /*
    public static int N;
    public static int[][] maze;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        maze = new int[N][N];
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) maze[r][c] = Integer.parseInt(st.nextToken());
        }
        bfs(M);
    }

    public static void bfs(int M) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Location> queue = new ArrayDeque<>();
        boolean[][][][] visited = new boolean[2][M+1][N][N];
        queue.add(new Location(0, 0, 0, 0, 1));
        visited[0][0][0][0] = true;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == N-1 && cur.c == N-1) {
                if (cur.time == 0) System.out.println(cur.day+" sun");
                else System.out.println(cur.day+" moon");
                return;
            }

            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                int nmoves = cur.moves+1;
                int ntime = cur.time;
                int nday = cur.day;
                if (nmoves == M) {
                    if (cur.time == 1) ntime = 0;
                    else ntime = 1;
                    nmoves = 0;
                    if (ntime == 0) ++nday;
                }

                if (!check(nr, nc)) continue;
                if (maze[nr][nc] == 1) {
                    if (cur.time == 1) {
                        while (true) {
                            nr += dr[dir];
                            nc += dc[dir];
                            if (!check(nr, nc)) break;
                            if (maze[nr][nc] == 1) {
                                continue;
                            } else {
                                if (!visited[ntime][nmoves][nr][nc]) {
                                    visited[ntime][nmoves][nr][nc] = true;
                                    queue.add(new Location(ntime, nr, nc, nmoves, nday));
                                }
                                break;
                            }
                        }
                    }
                } else {
                    if (!visited[ntime][nmoves][nr][nc]) {
                        visited[ntime][nmoves][nr][nc] = true;
                        queue.add(new Location(ntime, nr, nc, nmoves, nday));
                    }
                }
            }
        }
        System.out.println(-1);
    }

    public static boolean check(int r, int c) {
        if (r<0 || N<=r || c<0 || N<=c) return false;
        return true;
    }
     */
}

/*
class Location {
    int time, r, c, moves, day;

    Location(int time, int r, int c, int moves, int day) {
        this.time = time;
        this.r = r;
        this.c = c;
        this.moves = moves;
        this.day = day;
    }
}
 */