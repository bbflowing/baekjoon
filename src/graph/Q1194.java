package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1194 {
    /*
    public static char map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        Coordinate start = null;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == '0') {
                    start = new Coordinate(i, j);
                    map[i][j] = '.';
                }
            }
        }
        bfs(start, R, C);
    }

    public static void bfs (Coordinate start, int R, int C) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean visited [][][] = new boolean [R][C][1<<6];
        Queue<Coordinate> queue = new LinkedList<>();
        visited[start.x][start.y][0] = true;
        queue.add(new Coordinate(start.x, start.y, 0, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();

            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];
                int nkey = c.key;

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (visited[nx][ny][c.key]) {
                    continue;
                }
                if (map[nx][ny] == '#') {
                    continue;
                }
                if (map[nx][ny] == '1') {
                    System.out.println(c.distance+1);
                    return;
                }
                if ('a' <= map[nx][ny] && map[nx][ny] <= 'f') {
                    visited[nx][ny][c.key] = true;
                    nkey = c.key | 1<<map[nx][ny]-'a';
                } else if ('A' <= map[nx][ny] && map[nx][ny] <= 'F') {
                    int check = c.key & 1<<map[nx][ny]-'A';
                    if (check == 0) {
                        continue;
                    }
                }
                visited[nx][ny][nkey] = true;
                queue.add(new Coordinate(nx, ny, nkey, c.distance+1));
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int key;
    int distance;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int key, int distance) {
        this.x = x;
        this.y = y;
        this.key = key;
        this.distance = distance;
    }
}
 */

