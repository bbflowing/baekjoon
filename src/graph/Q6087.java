package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q6087 {
    /*
    public static int R, C;
    public static char map[][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        boolean flag = false;
        Coordinate start = null;
        Coordinate end = null;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'C') {
                    if (!flag) {
                        start = new Coordinate(i, j, -1, 0);
                        flag = true;
                    } else {
                        end = new Coordinate(i, j, -1, 0);
                    }
                }
            }
        }
        bfs(start, end);
    }

    public static void bfs (Coordinate start, Coordinate end) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        int visited[][] = new int[R][C];
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                visited[i][j] = Integer.MAX_VALUE;
            }
        }
        visited[start.x][start.y] = 0;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(start);
        int answer = 987_654_321;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == end.x && c.y == end.y) {
                answer = answer > c.mirrors ? c.mirrors : answer;
            }

            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (map[nx][ny] == '*') {
                    continue;
                }
                if (c.direction == -1) {
                    visited[nx][ny] = 0;
                    queue.add(new Coordinate(nx, ny, dir, 0));
                } else if (c.direction != dir) {
                    if (visited[nx][ny] >= c.mirrors+1) {
                        visited[nx][ny] = c.mirrors+1;
                        queue.add(new Coordinate(nx, ny, dir, c.mirrors+1));
                    }
                } else {
                    if (visited[nx][ny] >= c.mirrors) {
                        visited[nx][ny] = c.mirrors;
                        queue.add(new Coordinate(nx, ny, dir, c.mirrors));
                    }
                }
            }
        }
        System.out.println(answer);
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int direction;
    int mirrors;

    Coordinate (int x, int y, int direction, int mirrors) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.mirrors = mirrors;
    }
}
 */

