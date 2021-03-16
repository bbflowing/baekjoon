package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17391 {
    /*
    public static int map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        map = new int [R][C];
        for (int i=0; i<R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<C; ++j) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(R, C);
    }

    public static void bfs (int R, int C) {
        int dx [] = {1, 0};
        int dy [] = {0, 1};
        boolean visited [][] = new boolean [R][C];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0, 0, 1));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == R-1 && c.y == C-1) {
                System.out.println(c.distance-1);
                return;
            }
            int limit = map[c.x][c.y];
            for (int i=0; i<2; ++i) {
                for (int j=1; j<=limit; ++j) {
                    int nx = c.x + dx[i]*j;
                    int ny = c.y + dy[i]*j;

                    if (nx<0 || R<=nx || ny<0 || C<=ny) {
                        break;
                    }
                    if (visited[nx][ny]) {
                        continue;
                    }
                    visited[nx][ny] = true;
                    queue.add(new Coordinate(nx, ny, c.distance+1));
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
    int distance;

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

 */
