package graph;

// 말이 되고 싶은 원숭이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Q1600 {
    /*
    public static int T, W, H;
    public static int[][] world;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        world = new int[W][H];
        for (int w = 0; w < W; ++w) {
            st = new StringTokenizer(br.readLine());
            for (int h = 0; h < H; ++h) world[w][h] = Integer.parseInt(st.nextToken());
        }
        bfs();
    }

    public static void bfs() {

        int[] dr = {-1, 1, 0, 0, -1, -2, -2, -1, +1, +2, +2, +1};
        int[] dc = {0, 0, -1, 1, -2, -1, +1, +2, -2, -1, +1, +2};
        boolean[][][] visited = new boolean[T + 1][W][H];
        Queue<Location> queue = new ArrayDeque<>();
        queue.add(new Location(0, 0, 0, 0));
        visited[0][0][0] = true;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == W - 1 && cur.c == H - 1) {
                System.out.println(cur.moves);
                return;
            }
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr < 0 || W <= nr || nc < 0 || H <= nc) continue;
                if (world[nr][nc] == 1) continue;
                if (visited[cur.horse][nr][nc]) continue;
                visited[cur.horse][nr][nc] = true;
                queue.add(new Location(cur.horse, nr, nc, cur.moves + 1));
            }

            if (cur.horse + 1 <= T) {
                for (int dir = 4; dir < 12; ++dir) {
                    int nr = cur.r + dr[dir];
                    int nc = cur.c + dc[dir];
                    if (nr < 0 || W <= nr || nc < 0 || H <= nc) continue;
                    if (world[nr][nc] == 1) continue;
                    if (visited[cur.horse + 1][nr][nc]) continue;
                    visited[cur.horse + 1][nr][nc] = true;
                    queue.add(new Location(cur.horse + 1, nr, nc, cur.moves + 1));
                }
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Location {
    int horse, r, c, moves;

    Location(int horse, int r, int c, int moves) {
        this.horse = horse;
        this.r = r;
        this.c = c;
        this.moves = moves;
    }
}
 */