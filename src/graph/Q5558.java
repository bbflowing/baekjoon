package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q5558 {
    /*
    public static int R, C;
    public static int[][] board;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        board = new int[R][C];
        String line = "";
        Coordinate start = null;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                char target = line.charAt(c);
                if (target == 'S') {
                    start = new Coordinate(1, r, c, 0);
                } else if (target == 'X') {
                    board[r][c] = -1;
                } else if ('1' <= target && target <= '9') {
                    board[r][c] = target - '0';
                }
            }
        }
        bfs(start, K);
    }

    public static void bfs (Coordinate start, int K) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Coordinate> queue = new ArrayDeque<>();
        boolean[][][] visited = new boolean[K+1][R][C];
        queue.add(new Coordinate(1, start.r, start.c, 0));
        visited[1][start.r][start.c] = true;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (board[cur.r][cur.c] == cur.target) {
                if (cur.target == K) {
                    System.out.println(cur.times);
                    return;
                } else {
                    visited[cur.target+1][cur.r][cur.c] = true;
                    queue.add(new Coordinate(cur.target+1, cur.r, cur.c, cur.times));
                }
                continue;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[cur.target][nr][nc]) continue;
                if (board[nr][nc] == -1) continue;
                visited[cur.target][nr][nc] = true;
                queue.add(new Coordinate(cur.target, nr, nc, cur.times+1));
            }
        }
    }

     */
}

/*
class Coordinate {
    int target;
    int r;
    int c;
    int times;

    Coordinate (int target, int r, int c, int times) {
        this.target = target;
        this.r = r;
        this.c = c;
        this.times = times;
    }
}
 */