package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1726 {
    /*
    public static int R, C;
    public static int factory[][];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        factory = new int[R + 1][C + 1];
        for (int i = 1; i <= R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= C; ++j) {
                factory[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Coordinate start = null;
        Coordinate end = null;
        for (int i = 0; i < 2; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());
            if (i == 0) {
                start = new Coordinate(x, y, direction - 1, 0);
            } else {
                end = new Coordinate(x, y, direction - 1, 0);
            }
        }
        bfs(start, end);
    }

    public static void bfs(Coordinate start, Coordinate end) {
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};
        boolean visited[][][] = new boolean[4][R + 1][C + 1];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(start);
        visited[start.direction][start.x][start.y] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == end.x && c.y == end.y && c.direction == end.direction) {
                System.out.println(c.orders);
                return;
            }
            int left = getDirection(c.direction, 0);
            if (!visited[left][c.x][c.y]) {
                visited[left][c.x][c.y] = true;
                queue.add(new Coordinate(c.x, c.y, left, c.orders + 1));
            }
            int right = getDirection(c.direction, 1);
            if (!visited[right][c.x][c.y]) {
                visited[right][c.x][c.y] = true;
                queue.add(new Coordinate(c.x, c.y, right, c.orders + 1));
            }
            int nx = c.x;
            int ny = c.y;
            for (int i = 1; i <= 3; ++i) {
                nx += dx[c.direction];
                ny += dy[c.direction];

                if (nx < 1 || R < nx || ny < 1 || C < ny) {
                    break;
                }
                if (factory[nx][ny] == 1) {
                    break;
                }
                if (visited[c.direction][nx][ny]) {
                    continue;
                }
                visited[c.direction][nx][ny] = true;
                queue.add(new Coordinate(nx, ny, c.direction, c.orders + 1));
            }
        }
    }

    public static int getDirection(int direction, int right) {
        if (right == 0) {
            if (direction == 0) { // east
                return 2;
            } else if (direction == 1) {
                return 3;
            } else if (direction == 2) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (direction == 0) { // east
                return 3;
            } else if (direction == 1) {
                return 2;
            } else if (direction == 2) {
                return 1;
            } else {
                return 0;
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int direction;
    int orders;

    Coordinate(int x, int y, int direction, int orders) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.orders = orders;

    }
}
 */

