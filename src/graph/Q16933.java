package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q16933 {
    /*
    public static int R, C;
    public static int[][] map;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int[R+1][C+1];
        String line = "";
        for (int r=1; r<=R; ++r) {
            line = br.readLine();
            for (int c=1; c<=C; ++c) {
                map[r][c] = line.charAt(c-1)-'0';

            }
        }
        bfs(K);
    }

    public static void bfs(int K) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int[][][][] visited = new int[2][K+1][R+1][C+1];
        for (int i=0; i<2; ++i) {
            for (int j=0; j<K+1; ++j) {
                for (int k=0; k<R+1; ++k) Arrays.fill(visited[i][j][k], -1);
            }
        }
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(0, 0,1, 1, 1));
        visited[0][0][1][1] = 1;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == R &&  cur.c == C) {
                System.out.println(cur.distance);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<1 || R<nr || nc<1 || C<nc) continue;
                if (cur.time == 0) {
                    if (map[nr][nc] == 1 && cur.broken+1 <= K) {
                        if (visited[1][cur.broken+1][nr][nc] == -1 ||
                                cur.distance+1 < visited[1][cur.broken+1][nr][nc]) {
                            visited[1][cur.broken+1][nr][nc] = cur.distance+1;
                            queue.add(new Coordinate(1, cur.broken+1, nr, nc, cur.distance+1));
                        }
                    } else if (map[nr][nc] == 0) {
                        if (visited[1][cur.broken][nr][nc] == -1 ||
                            cur.distance+1 < visited[1][cur.broken][nr][nc]) {
                            visited[1][cur.broken][nr][nc] = cur.distance+1;
                            queue.add(new Coordinate(1, cur.broken, nr, nc, cur.distance+1));
                        }
                    }
                } else {
                    if (map[nr][nc] == 1 && cur.broken+1 <= K) {
                        if (visited[1][cur.broken+1][nr][nc] == -1 ||
                            cur.distance+1 < visited[1][cur.broken+1][nr][nc]) {
                            visited[0][cur.broken][nr][nc] = cur.distance+1;
                            queue.add(new Coordinate(0, cur.broken, cur.r, cur.c, cur.distance+1));
                        }
                    } else if (map[nr][nc] == 0) {
                        if (visited[0][cur.broken][nr][nc] == -1 ||
                            cur.distance+1 < visited[0][cur.broken][nr][nc]) {
                            visited[0][cur.broken][nr][nc] = cur.distance+1;
                            queue.add(new Coordinate(0, cur.broken, nr, nc, cur.distance+1));
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Coordinate {
    int time, broken, r, c, distance;

    Coordinate (int time, int broken, int r, int c, int distance) {
        this.time = time;
        this.broken = broken;
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */