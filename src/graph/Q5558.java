package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5558 {
    /*
    public static int R, C;
    public static int[][] input;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        input = new int[R][C];
        int K = Integer.parseInt(st.nextToken());
        String line = "";
        Coordinate start = null;

        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                char target = line.charAt(c);
                if (target == 'X') {
                    input[r][c] = -1;
                } else if ('1' <= target && target <= '9') {
                    input[r][c] = target-'0';
                } else if (target == 'S') {
                    start = new Coordinate(r, c, 1,0);
                }
            }
        }
        bfs(start, K);
    }

    public static void bfs (Coordinate start, int K) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(start);
        boolean[][][] visited = new boolean[R][C][K+1];
        visited[start.r][start.c][1] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (input[c.r][c.c] == c.target) {
                if (c.target == K) {
                    System.out.println(c.distance);
                    return;
                } else {
                    queue.add(new Coordinate(c.r, c.c, c.target+1, c.distance));
                    visited[c.r][c.c][c.target+1] = true;
                    continue;
                }
            }

            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) {
                    continue;
                }
                if (input[nr][nc] == -1) {
                    continue;
                }
                if (visited[nr][nc][c.target]) {
                    continue;
                }
                visited[nr][nc][c.target] = true;
                queue.add(new Coordinate(nr, nc, c.target, c.distance+1));
            }
        }
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int target;
    int distance;

    Coordinate (int r, int c, int target, int distance) {
        this.r = r;
        this.c = c;
        this.target = target;
        this.distance = distance;
    }
}
 */