package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1194 {
    /*
    public static int R, C;
    public static char[][] maze;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char[R][C];
        Coordinate start = null;
        String line = "";
        for (int r = 0; r < R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) {
                maze[r][c] = line.charAt(c);
                if (maze[r][c] == '0') {
                    maze[r][c] = '.';
                    start = new Coordinate(r, c, 0, 0);
                }
            }
        }
        System.out.println(bfs(start));
    }

    public static int bfs(Coordinate start) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(start);
        boolean[][][] visited = new boolean[R][C][1 << 6];
        visited[start.r][start.c][0] = true;

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                if (maze[nr][nc] == '#') {
                    continue;
                } else if (maze[nr][nc] == '1') {
                    return cur.distance+1;
                } else if ('a' <= maze[nr][nc] && maze[nr][nc] <= 'f') {
                    int nkeys = cur.keys | 1<<maze[nr][nc]-'a';
                    if (!visited[nr][nc][nkeys]) {
                        visited[nr][nc][nkeys] = true;
                        queue.add(new Coordinate(nr, nc, nkeys,cur.distance+1));
                    }
                } else if ('A' <= maze[nr][nc] && maze[nr][nc] <= 'F') {
                    int test = cur.keys & 1<<maze[nr][nc]-'A';
                    if (test > 0) {
                        if (!visited[nr][nc][cur.keys]) {
                            visited[nr][nc][cur.keys] = true;
                            queue.add(new Coordinate(nr, nc, cur.keys, cur.distance+1));
                        }
                    }
                } else if (maze[nr][nc] == '.') {
                    if (!visited[nr][nc][cur.keys]) {
                        visited[nr][nc][cur.keys] = true;
                        queue.add(new Coordinate(nr, nc, cur.keys, cur.distance+1));
                    }
                }
            }
        }
        return -1;
    }
     */
}

/*
class Coordinate {
    int r, c, keys, distance;

    Coordinate(int r, int c, int keys, int distance) {
        this.r = r;
        this.c = c;
        this.keys = keys;
        this.distance = distance;
    }
}
 */