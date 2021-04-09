package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class Q7562 {
    /*
    public static int I;
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t<T; ++t) {
            I = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            if (startX == endX && startY == endY) {
                System.out.println(0);
            } else {
                bfs(startX, startY, endX, endY);
            }
        }
    }

    public static void bfs (int startX, int startY, int endX, int endY) {
        int dx [] = {-1, -2, -2, -1, +1, +2, +2, +1};
        int dy [] = {-2, -1, +1, +2, -2, -1, +1, +2};
        boolean visited [][] = new boolean [I][I];
        visited[startX][startY] = true;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(startX, startY, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == endX && c.y == endY) {
                System.out.println(c.times);
                return;
            }
            for (int i = 0; i < 8; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (0 <= nx && nx < I && 0 <= ny && ny < I) {
                    if (!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new Coordinate(nx, ny, c.times+1));
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int times;

    Coordinate (int x, int y, int times) {
        this.x =x ;
        this.y = y;
        this.times = times;
    }
}
 */