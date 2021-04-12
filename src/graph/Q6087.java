package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q6087 {
    /*
    public static int R, C;
    public static char map [][];
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        boolean flag = false;
        int startX = 0; int startY = 0;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'C') {
                    if (!flag) {
                        map[i][j] = '.';
                        startX = i; startY = j;
                        flag = true;
                    }
                }
            }
        }
        bfs(startX, startY);
    }

    public static void bfs (int x, int y) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        int mirrors [][] = new int [R][C];
        for (int i=0; i<R; ++i) {
            Arrays.fill(mirrors[i], 987_654_321);
        }
        mirrors[x][y] = 0;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y, -1, 0));
        int answer = 987_654_321;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (map[c.x][c.y] == 'C') {
                if (answer > c.distance) {
                    answer = c.distance;
                }
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
                if (c.before == -1) {
                    mirrors[nx][ny] = 0;
                    queue.add(new Coordinate(nx, ny, dir, c.distance));
                } else if (c.before == dir) {
                    if (mirrors[nx][ny] >= c.distance) {
                        mirrors[nx][ny] = c.distance;
                        queue.add(new Coordinate(nx, ny, dir, c.distance));
                    }
                } else {
                    if (mirrors[nx][ny] >= c.distance+1) {
                        mirrors[nx][ny] = c.distance+1;
                        queue.add(new Coordinate(nx, ny, dir, c.distance+1));
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
    int before;
    int distance;

    Coordinate(int x, int y, int before, int distance) {
        this.x = x;
        this.y = y;
        this.before = before;
        this.distance = distance;
    }
}
 */

