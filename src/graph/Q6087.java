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
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        int startX = 0; int startY = 0;
        int endX = 0; int endY = 0;
        boolean flag = false;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'C') {
                    if (!flag) {
                        startX = i; startY = j;
                        flag = true;
                    } else {
                        endX = i; endY = j;
                    }
                }
            }
        }
        solve(startX, startY, endX, endY);
    }

    public static void solve (int startX, int startY, int endX, int endY) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        int mirrors [][] = new int [R][C];
        for (int i=0; i<R; ++i) {
            Arrays.fill(mirrors[i], 987_654_321);
        }
        mirrors[startX][startY] = 0;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(startX, startY, -1, 0));
        int answer = 987_654_321;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == endX && c.y == endY) {
                if (answer > c.count) {
                    answer = c.count;
                }
            }

            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (map[nx][ny] == '*') {
                    continue;
                }

                if (c.direction == i) {
                    if (c.count <= mirrors[nx][ny]) {
                        mirrors[nx][ny] = c.count;
                        queue.add(new Coordinate(nx, ny, i, c.count));
                    }
                } else if (c.direction == -1) {
                    mirrors[nx][ny] = 0;
                    queue.add(new Coordinate(nx, ny, i, c.count));
                } else if (c.direction != i){
                    if (c.count+1 <= mirrors[nx][ny]) {
                        mirrors[nx][ny] = c.count+1;
                        queue.add(new Coordinate(nx, ny, i, c.count+1));
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
