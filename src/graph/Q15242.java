package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q15242 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String start = br.readLine();
        String end = br.readLine();
        int startY = start.charAt(0)-'a';
        int startX = 8-(start.charAt(1)-'0');
        int endY = end.charAt(0)-'a';
        int endX = 8-(end.charAt(1)-'0');
        if (startX == endX && startY == endY) {
            System.out.println(0);
        } else {
            bfs(startX, startY, endX, endY);
        }
    }

    public static void bfs (int startX, int startY, int endX, int endY) {
        int dx [] = {-1, -2, -2, -1, +1, +2, +2, +1};
        int dy [] = {-2, -1, +1, +2, -2, -1, +1, +2};
        boolean visited [][] = new boolean [8][8];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(startX, startY, 0));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == endX && c.y == endY) {
                System.out.println(c.times);
                break;
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
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, c.times+1));
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
