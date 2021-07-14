package graph;

// 미로탐색

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2178 {
    /*
    public static int N, M;
    public static char[][] maze;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new char[N][M];
        for (int row=0; row<N; ++row) {
            String temp = br.readLine();
            for (int col=0; col<M; ++col) maze[row][col] = temp.charAt(col);
        }
        bfs();
    }

    public static void bfs() {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][] visited = new boolean[N][M];
        Queue<Blank> queue = new ArrayDeque<>();
        visited[0][0] = true;
        queue.add(new Blank(0, 0, 1));

        while (!queue.isEmpty()) {
            Blank cur = queue.poll();
            if (cur.r == N-1 && cur.c == M-1) {
                System.out.println(cur.distance);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || M<=nc) continue;
                if (visited[nr][nc]) continue;
                if (maze[nr][nc] == '0') continue;
                queue.add(new Blank(nr, nc, cur.distance+1));
                visited[nr][nc] = true;
            }
        }
    }
     */
}

/*
class Blank {
    int r, c, distance;

    Blank (int r, int c, int distance) {
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */