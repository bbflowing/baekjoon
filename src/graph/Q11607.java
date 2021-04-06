package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11607 {
    /*
    public static int R, C;
    public static int grid [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        grid = new int [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                grid[i][j] = line.charAt(j)-'0';
            }
        }
        bfs();
    }

    public static void bfs() {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean visited [][] = new boolean [R][C];
        visited[0][0] = true;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0, 0, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == R-1 && c.y == C-1) {
                System.out.println(c.distance);
                return;
            }
            int value = grid[c.x][c.y];
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i]*value;
                int ny = c.y + dy[i]*value;

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, c.distance+1));
            }
        }
        System.out.println("IMPOSSIBLE");
    }
     */
}

/*
class Coordinate{
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
