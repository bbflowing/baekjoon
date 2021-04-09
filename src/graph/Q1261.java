package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1261 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char input [][] = new char [M][N];
        for (int i=0; i<M; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        bfs(input, M, N);
    }
    public static void bfs (char [][] input, int M, int N) {
        Queue<Coordinate> queue = new LinkedList<>();
        boolean check [][] = new boolean [M][N];
        queue.add(new Coordinate(0, 0, 0, 0));
        check[0][0] = true;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        int min = 987_654_321;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (current.x == M-1 && current.y == N-1) {
                if (min > current.wall) {
                    min = current.wall;
                }
            }
            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx < 0 || M <= nx || ny < 0 || N <= ny) {
                    continue;
                }

                if (check[nx][ny]) {
                    continue;
                }

                if (input[nx][ny] == '0') {
                    queue.add(new Coordinate(nx, ny, current.wall, current.distance+1));
                    check[nx][ny] = true;
                } else if (input[nx][ny] == '1') {
                    queue.add(new Coordinate(nx, ny, current.wall + 1, current.distance+1));
                    check[nx][ny] = true;
                }
            }
        }
        if (min == 987_654_321) {
            System.out.println(0);
        } else {
            System.out.println(min);
        }
    }
     */
}
/*
class Coordinate {
    int x;
    int y;
    int wall;
    int distance;

    Coordinate (int x, int y, int wall, int distance) {
        this.x = x;
        this.y = y;
        this.wall = wall;
        this.distance = distance;
    }
}
 */
