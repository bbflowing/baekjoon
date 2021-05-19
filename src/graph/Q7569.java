package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7569 {
    /*
    public static int R, C, H;
    public static int[][][] box;
    public static Queue<Coordinate> tomatoes;
    public static boolean[][][] visited;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        box = new int[H][R][C];
        tomatoes = new ArrayDeque<>();
        visited = new boolean[H][R][C];
        int unripe = 0;
        for (int h = 0; h < H; ++h) {
            for (int r = 0; r < R; ++r) {
                st = new StringTokenizer(br.readLine());
                for (int c = 0; c < C; ++c) {
                    box[h][r][c] = Integer.parseInt(st.nextToken());
                    if (box[h][r][c] == 1) {
                        tomatoes.add(new Coordinate(h, r, c));
                        visited[h][r][c] = true;
                    } else if (box[h][r][c] == 0) ++unripe;
                }
            }
        }
        int time = 0;
        if (unripe != 0) {
            int before = 0;
            while (true) {
                ++time;
                before = unripe;
                unripe = bfs(unripe);
                if (unripe == 0) break;
                else if (before == unripe) {
                    time = -1;
                    break;
                }
            }
        }
        System.out.println(time);
    }

    public static int bfs(int unripe) {
        int[] dr = {-1, 1, 0, 0, 0, 0};
        int[] dc = {0, 0, -1, 1, 0, 0};
        int[] dh = {0, 0, 0, 0, -1, 1};

        int size = tomatoes.size();
        for (int i = 0; i < size; ++i) {
            Coordinate cur = tomatoes.poll();
            for (int dir = 0; dir < 6; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                int nh = cur.h + dh[dir];

                if (!check(nh, nr, nc)) continue;
                if (visited[nh][nr][nc]) continue;
                if (box[nh][nr][nc] == -1) continue;
                visited[nh][nr][nc] = true;
                tomatoes.add(new Coordinate(nh, nr, nc));
                --unripe;
            }
        }
        return unripe;
    }

    public static boolean check(int h, int r, int c) {
        if (r < 0 || R <= r || c < 0 || C <= c || h < 0 || H <= h) return false;
        return true;
    }
     */
}

/*
class Coordinate {
    int h, r, c;

    Coordinate(int h, int r, int c) {
        this.h = h;
        this.r = r;
        this.c = c;
    }
}
 */