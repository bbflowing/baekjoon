package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2589 {
    /*
    public static int R, C;
    public static char map [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        int answer = 0;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (map[i][j] == 'L') {
                    int result = bfs(i, j);
                    if (answer < result) {
                        answer = result;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    public static int bfs (int x, int y) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y, 0));
        boolean visited [][] = new boolean [R][C];
        visited[x][y] = true;
        int result = -1;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.distance > result) {
                result = c.distance;
            }

            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] == 'W') {
                    continue;
                }
                queue.add(new Coordinate(nx, ny, c.distance+1));
                visited[nx][ny] = true;
            }
        }
        return result;
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int distance;

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
 */
