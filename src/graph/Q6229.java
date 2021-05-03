package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q6229 {
    /*
    public static int R, C;
    public static int[][] pond;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int M1 = Integer.parseInt(st.nextToken());
        int M2 = Integer.parseInt(st.nextToken());
        pond = new int[R][C];
        int startR = 0;
        int startC = 0;
        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) {
                pond[r][c] = Integer.parseInt(st.nextToken());
                if (pond[r][c] == 3) {
                    startR = r; startC = c;
                }
            }
        }
        bfs(startR, startC, M1, M2);
    }

    public static void bfs (int r, int c, int M1, int M2) {
        int[] dr = {-M1, -M2, -M2, -M1, +M1, +M2, +M2, +M1};
        int[] dc = {-M2, -M1, +M1, +M2, -M2, -M1, +M1, +M2};
        Queue<Coordinate> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[R][C];
        visited[r][c] = true;
        queue.add(new Coordinate(r, c, 0));

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (pond[cur.r][cur.c] == 4) {
                System.out.println(cur.times);
                return;
            }
            for (int dir=0; dir<8; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[nr][nc]) continue;
                if (pond[nr][nc] == 0 || pond[nr][nc] == 2) continue;
                visited[nr][nc] = true;
                queue.add(new Coordinate(nr, nc, cur.times+1));
            }
        }
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int times;

    Coordinate (int r, int c, int times) {
        this.r = r;
        this.c = c;
        this.times = times;
    }
}
 */
