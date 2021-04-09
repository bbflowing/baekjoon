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
    public static char map [][];
    public static int W, H;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        map = new char [H][W];
        boolean flag = false;
        int startX = 0; int startY = 0;
        for (int i=0; i<H; ++i) {
            String line = br.readLine();
            for (int j=0; j<W; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'C' && !flag) {
                    startX = i; startY = j;
                    map[i][j] = '.';
                    flag = true;
                }
            }
        }
        bfs(startX, startY);
    }
    public static void bfs (int x, int y) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        int mirrors [][] = new int [H][W];
        for (int i=0; i<H; ++i) {
            Arrays.fill(mirrors[i], 987_654_321);
        }
        mirrors[x][y] = 0;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y, -1, 0));
        int answer = 987_654_321;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (map[c.x][c.y] == 'C') {
                if (c.count < answer) {
                    answer = c.count;
                }
            }
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || H<=nx || ny<0 || W<=ny) {
                    continue;
                }
                if (map[nx][ny] == '*') {
                    continue;
                }
                if (c.direction == -1) {
                    mirrors[nx][ny] = 0;
                    queue.add(new Coordinate(nx, ny, i, 0));
                } else if (c.direction != i) {
                    if (c.count+1 <= mirrors[nx][ny]) {
                        mirrors[nx][ny] = c.count+1;
                        queue.add(new Coordinate(nx, ny, i, c.count+1));
                    }
                } else if (c.direction == i) {
                    if (c.count <= mirrors[nx][ny]) {
                        mirrors[nx][ny] = c.count+1;
                        queue.add(new Coordinate(nx, ny, i, c.count));
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
    int count;

    Coordinate (int x, int y, int direction, int count) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.count = count;
    }
}
 */