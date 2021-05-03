package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1743 {
    /*
    public static int R, C;
    public static int[][] hallway;
    public static boolean[][] visited;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        hallway = new int[R][C];
        visited = new boolean[R][C];
        for (int k=0; k<K; ++k) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken())-1;
            int c = Integer.parseInt(st.nextToken())-1;
            hallway[r][c] = 1;
        }
        int answer = 0;
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (hallway[r][c] == 1 && !visited[r][c]) {
                    visited[r][c] = true;
                    answer = Math.max(answer, bfs(r, c));
                }
            }
        }
        System.out.println(answer);
    }

    public static int bfs (int r, int c) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(r, c));
        int size = 0;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            ++size;
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (hallway[nr][nc] == 0) continue;
                if (visited[nr][nc]) continue;
                visited[nr][nc] = true;
                queue.add(new Coordinate(nr, nc));
            }
        }
        return size;
    }
     */
}

/*
class Coordinate {
    int r;
    int c;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */
