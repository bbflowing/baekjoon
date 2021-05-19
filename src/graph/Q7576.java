package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

//토마토

public class Q7576 {
    /*
    public static int R, C;
    public static int[][] box;
    public static Queue<Coordinate> tomatoes;
    public static boolean[][] visited;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        box = new int[R][C];
        tomatoes = new ArrayDeque<>();
        visited = new boolean[R][C];
        int unripe = 0;

        for (int r = 0; r < R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < C; ++c) {
                box[r][c] = Integer.parseInt(st.nextToken());
                if (box[r][c] == 1) {
                    tomatoes.add(new Coordinate(r, c));
                    visited[r][c] = true;
                } else if (box[r][c] == 0) ++unripe;
            }
        }
        int time = 0;
        if (unripe != 0) {
            int before = 0;
            while (true) {
                ++time;
                before = unripe;
                unripe = bfs(unripe);
                if (unripe == 0 || unripe == before) {
                    if (unripe == before) time = -1;
                    break;
                }
            }
        }
        System.out.println(time);
    }

    public static int bfs(int unripe) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int size = tomatoes.size();
        for (int i = 0; i < size; ++i) {
            Coordinate cur = tomatoes.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (!check(nr, nc)) continue;
                if (visited[nr][nc]) continue;
                if (box[nr][nc] == -1) continue;
                visited[nr][nc] = true;
                tomatoes.add(new Coordinate(nr, nc));
                --unripe;
            }
        }
        return unripe;
    }

    public static boolean check(int r, int c) {
        if (r < 0 || R <= r || c < 0 || C <= c) return false;
        return true;
    }
     */
}

/*
class Coordinate {
    int r, c;

    Coordinate(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */