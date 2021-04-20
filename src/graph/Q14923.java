package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14923 {
    /*
    public static int R, C;
    public static int array[][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        array = new int[R+1][C+1];
        Coordinate start = null; Coordinate end = null;
        for (int i=0; i<2; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (i==0) {
                start = new Coordinate(x, y, 0, 0);
            } else {
                end = new Coordinate(x, y, 0, 0);
            }
        }
        for (int i=1; i<=R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=C; ++j) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(start, end);
    }

    public static void bfs (Coordinate start, Coordinate end) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        boolean visited[][][] = new boolean[2][R+1][C+1];
        visited[0][start.x][start.y] = true;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == end.x && c.y == end.y) {
                System.out.println(c.distance);
                System.exit(0);
            }
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<1 || R<nx || ny<1 || C<ny) {
                    continue;
                }
                if (array[nx][ny] == 0) {
                    if (!visited[c.broke][nx][ny]) {
                        visited[c.broke][nx][ny] = true;
                        queue.add(new Coordinate(nx, ny, c.broke, c.distance + 1));
                    }
                } else {
                    if (c.broke == 0 && !visited[1][nx][ny]) {
                        visited[1][nx][ny] = true;
                        queue.add(new Coordinate(nx, ny, 1, c.distance+1));
                    }
                }
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
    int broke;
    int distance;

    Coordinate (int x, int y, int broke, int distance) {
        this.x = x;
        this.y = y;
        this.broke = broke;
        this.distance = distance;
    }
}
 */