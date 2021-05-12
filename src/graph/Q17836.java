package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q17836 {
    /*
    public static int R, C;
    public static int[][] castle;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        castle = new int[R][C];
        int T = Integer.parseInt(st.nextToken());
        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) {
                castle[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(T);
    }

    public static void bfs(int T) {
        Queue<Coordinate> queue = new ArrayDeque<>();
        boolean[][][] visited = new boolean[2][R][C];
        queue.add(new Coordinate(0, 0, 0, 0));
        visited[0][0][0] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == R-1 && cur.c == C-1 && cur.distance <= T) {
                System.out.println(cur.distance);
                return;
            }
            if (T < cur.distance) break;
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (castle[nr][nc] == 0) {
                    if (!visited[cur.sword][nr][nc]) {
                        visited[cur.sword][nr][nc] = true;
                        queue.add(new Coordinate(cur.sword, nr, nc, cur.distance+1));
                    }
                } else if (castle[nr][nc] == 1){
                    if (cur.sword == 1) {
                        if (!visited[1][nr][nc]) {
                            visited[1][nr][nc] = true;
                            queue.add(new Coordinate(1, nr, nc, cur.distance+1));
                        }
                    } else {
                        continue;
                    }

                } else {
                    if (!visited[1][nr][nc]) {
                        visited[0][nr][nc] = true;
                        visited[1][nr][nc] = true;
                        queue.add(new Coordinate(1, nr, nc, cur.distance+1));
                    }
                }
            }
        }
        System.out.println("Fail");
    }
     */
}

/*
class Coordinate {
    int sword, r, c, distance;

    Coordinate(int sword, int r, int c, int distance) {
        this.sword = sword;
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */