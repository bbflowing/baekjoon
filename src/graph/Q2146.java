package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2146 {
    /*
    public static int N;
    public static int[][] map, group;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        StringTokenizer st;
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        int counter = 0;
        group = new int[N][N];
        for (int r=0; r<N; ++r) {
            for (int c=0; c<N; ++c) {
                if (map[r][c] == 1 && group[r][c] == 0) {
                    ++counter;
                    group[r][c] = counter;
                    dfs(r, c, counter);
                }
            }
        }
        for (int r=0; r<N; ++r) {
            System.out.println(Arrays.toString(group[r]));
        }
        System.out.println();
        int answer = Integer.MAX_VALUE;
        for (int i=1; i<=counter; ++i) {
            answer = Math.min(answer, bfs(i));
        }
        System.out.println(answer);
    }

    public static int bfs (int continent) {
        boolean[][] visited = new boolean[N][N];
        Queue<Coordinate> queue = new ArrayDeque<>();
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (group[i][j] == continent) {
                    queue.add(new Coordinate(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) {
                    continue;
                }
                if (visited[nr][nc]) {
                    continue;
                }
                visited[nr][nc] = true;
                if (group[nr][nc] == 0) {
                    queue.add(new Coordinate(nr, nc, cur.bridges+1));
                } else if (group[nr][nc] == continent) {
                    queue.add(new Coordinate(nr, nc, cur.bridges));
                } else {
                    return cur.bridges;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void dfs (int r, int c, int counter) {
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<0 || N<=nr || nc<0 || N<=nc) {
                continue;
            }
            if (group[nr][nc] != 0) {
                continue;
            }
            if (map[nr][nc] == 0) {
                continue;
            }
            group[nr][nc] = counter;
            dfs(nr, nc, counter);
        }
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int bridges;

    Coordinate (int r, int c, int bridges) {
        this.r = r;
        this.c = c;
        this.bridges = bridges;
    }
}
 */