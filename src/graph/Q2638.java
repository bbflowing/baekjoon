package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2638 {
    /*
    public static int R, C;
    public static int[][] cheese;
    public static int[][] dp;
    public static Queue<Coordinate> queue;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        cheese = new int[R][C];
        String line;
        int count = 0;

        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) {
                cheese[r][c] = Integer.parseInt(st.nextToken());
                if (cheese[r][c] == 1) {
                    ++count;
                }
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            solve(count);
        }
    }

    public static void solve(int count) {
        int time = 0;
        int before = 0;
        while (count != 0) {
            ++time;
            dp = new int[R][C];
            queue = new ArrayDeque<>();
            dfs(0, 0);
            before = count;
            count = bfs(count);
        }
        System.out.println(time);
        System.out.println(before);
    }

    public static int bfs (int count) {
        int size = queue.size();
        for (int i=0; i<size; ++i) {
            Coordinate c = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) {
                    continue;
                }
                if (dp[nr][nc] == -1) {
                    continue;
                }
                if (cheese[nr][nc] == 1) {
                    cheese[nr][nc] = 0;
                    --count;
                }
                dp[nr][nc] = -1;
            }
        }
        return count;
    }

    public static void dfs (int r, int c) {
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<0 || R<=nr || nc<0 || C<=nc) {
                continue;
            }
            if (dp[nr][nc] == -1) {
                continue;
            }
            if (cheese[nr][nc] == 1) {
                continue;
            }
            dp[nr][nc] = -1;
            queue.add(new Coordinate(nr, nc));
            dfs(nr, nc);
        }
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
