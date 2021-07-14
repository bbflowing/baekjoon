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
    public static int M, N, unripe;
    public static int[][] box;
    public static Queue<Blank> queue;
    public static boolean[][] check;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        box = new int[N][M];
        queue = new ArrayDeque<>();
        check = new boolean[N][M];
        unripe = 0;
        for (int r = 0; r < N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < M; ++c) {
                box[r][c] = Integer.parseInt(st.nextToken());
                if (box[r][c] == 1) {
                    queue.add(new Blank(r, c));
                    check[r][c] = true;
                } else if (box[r][c] == 0) ++unripe;
            }
        }
        int time = 0;
        if (unripe != 0) {
            while (true) {
                int before = unripe;
                bfs();
                ++time;
                if (unripe == 0 || unripe == before) {
                    if (unripe == before) time = -1;
                    break;
                }
            }
        }
        System.out.println(time);
    }

    public static int bfs() {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int size = queue.size();
        for (int i = 0; i < size; ++i) {
            Blank cur = queue.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr < 0 || N <= nr || nc < 0 || M <= nc) continue;
                if (check[nr][nc]) continue;
                if (box[nr][nc] == -1) continue;
                check[nr][nc] = true;
                queue.add(new Blank(nr, nc));
                --unripe;
            }
        }
        return unripe;
    }
     */
}

/*
class Blank {
    int r, c;

    Blank(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */