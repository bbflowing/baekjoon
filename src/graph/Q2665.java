package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q2665 {
    /*
    public static int N;
    public static int maze[][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        maze = new int [N][N];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                maze[i][j] = line.charAt(j)-'0';
            }
        }
        bfs();
    }

    public static void bfs () {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0, 0, 0));
        int visited [][] = new int [N][N];
        for (int i=0; i<N; ++i) {
            Arrays.fill(visited[i], 987_654_321);
        }
        visited[0][0] = 0;
        int answer = 987_654_321;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == N-1 && c.y == N-1) {
                if (answer > c.changes) {
                    answer = c.changes;
                }
            }
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || N<=nx || ny<0 || N<=ny) {
                    continue;
                }
                if (maze[nx][ny] == 0) {
                    if (c.changes+1 < visited[nx][ny]) {
                        visited[nx][ny] = c.changes+1;
                        queue.add(new Coordinate(nx, ny, c.changes+1));
                    }
                } else {
                    if (c.changes < visited[nx][ny]) {
                        visited[nx][ny] = c.changes;
                        queue.add(new Coordinate(nx, ny, c.changes));
                    }
                }
            }
        }
        if (answer == 987_654_321) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }

     */
}

/*
class Coordinate {
    int x;
    int y;
    int changes;

    Coordinate(int x, int y, int changes) {
        this.x = x;
        this.y = y;
        this.changes = changes;
    }
}
 */
