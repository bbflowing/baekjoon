package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1194 {
    /*
    public static int R, C;
    public static char[][] maze;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char[R][C];
        String line = "";
        int startR = 0; int startC = 0;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                maze[r][c] = line.charAt(c);
                if (maze[r][c] == '0') {
                    maze[r][c] = '.';
                    startR = r;
                    startC = c;
                }
            }
        }
        bfs(startR, startC);
    }

    public static void bfs (int r, int c) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][][] visited = new boolean[R][C][1<<6];
        visited[r][c][0] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(r, c, 0, 0));

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (maze[cur.r][cur.c] == '1') {
                System.out.println(cur.distance);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                int nkeys = cur.keys;

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[nr][nc][nkeys]) continue;
                if (maze[nr][nc] == '#') {
                    continue;
                } else if ('A' <= maze[nr][nc] && maze[nr][nc] <= 'F') {
                    int temp = nkeys & 1<<(maze[nr][nc]-'A');
                    if (temp == 0) {
                        continue;
                    }
                } else if ('a' <= maze[nr][nc] && maze[nr][nc] <= 'f') {
                    nkeys = nkeys | (1<<maze[nr][nc]-'A');
                }
                visited[nr][nc][nkeys] = true;
                queue.add(new Coordinate(nr, nc, nkeys,cur.distance+1));
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int keys;
    int distance;

    Coordinate (int r, int c, int keys, int distance) {
        this.r = r;
        this.c = c;
        this.keys = keys;
        this.distance = distance;
    }
}
 */

