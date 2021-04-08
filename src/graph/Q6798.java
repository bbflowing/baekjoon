package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q6798 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startY = Integer.parseInt(st.nextToken())-1;
        int startX = 8-Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int endY = Integer.parseInt(st.nextToken())-1;
        int endX = 8-Integer.parseInt(st.nextToken());
        if (0 <= startX && startX < 8 && 0 <= startY && startY <8) {
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
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [8][8];
        queue.add(new Coordinate(startX, startY, 0));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == endX && c.y == endY) {
                System.out.println(c.times);
                return;
            }
            for (int i=0; i<8; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || 8<=nx || ny<0 || 8<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                queue.add(new Coordinate(nx, ny, c.times+1));
                visited[nx][ny] = true;
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
        this.x = x;
        this.y = y;
        this.times = times;
    }
}
 */

