package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2206 {
    /*
    public static int map [][];
    public static int N, M;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int [N+1][M+1];
        for (int i=1; i<=N; ++i) {
            String line = br.readLine();
            for (int j=1; j<=M; ++j) {
                map[i][j] = line.charAt(j-1) - '0';

            }
        }
        bfs();
    }

    public static void bfs () {
        boolean visited [][][] = new boolean [2][N+1][M+1];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(1, 1, 1, 0));
        visited[0][1][1] = true;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == N && c.y == M) {
                System.out.println(c.distance);
                return;
            }
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<1 || N<nx || ny<1 || M<ny) {
                    continue;
                }
                if (map[nx][ny] == 0) {
                    if (!visited[c.broke][nx][ny]) {
                        visited[c.broke][nx][ny] = true;
                        queue.add(new Coordinate(nx, ny, c.distance+1, c.broke));
                    }
                } else {
                    if (c.broke == 0 && !visited[1][nx][ny]) {
                        visited[1][nx][ny] = true;
                        queue.add(new Coordinate(nx, ny, c.distance+1, 1));
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
    int distance;
    int broke;

    Coordinate (int x, int y, int distance, int broke) {
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.broke = broke;
    }
}
 */