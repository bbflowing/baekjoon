package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
    /*
    public static int maze [][];
    public static int R, C;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new int [R+1][C+1];
        for (int i=1; i<=R; ++i) {
            String line = br.readLine();
            for (int j=1; j<=C; ++j) {
                maze[i][j] = line.charAt(j-1)-'0';
            }
        }
        bfs();
    }

    public static void bfs() {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [R+1][C+1];
        queue.add(new Coordinate(1, 1, 1));
        visited[1][1] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == R && c.y == C) {
                System.out.println(c.distance);
                return;
            }
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<1 || R<nx || ny<1 || C<ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (maze[nx][ny] == 0) {
                    continue;
                }

                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, c.distance+1));
            }
        }
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

