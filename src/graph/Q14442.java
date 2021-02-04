package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14442 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        char input [][] = new char [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        bfs(input, N, M, K);
    }
    public static void bfs (char[][] input, int N, int M, int K) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0, 0, 0, 1));
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean check [][][] = new boolean [N][M][K+1];
        check[0][0][0] = true;
        int min = 987_654_321;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (current.x == N-1 && current.y == M-1) {
                if (min > current.distance) {
                    min = current.distance;
                }
            }
            for (int j=0; j<4; ++j) {
                int nx = current.x + dx[j];
                int ny = current.y + dy[j];
                int ncounter = current.counter;
                int ndistance = current.distance;
                if (nx < 0 || N <= nx || ny < 0 || M <= ny) {
                    continue;
                }
                if (input[nx][ny] == '0') {
                    if (!check[nx][ny][ncounter]) {
                        queue.add(new Coordinate(nx, ny, ncounter, ndistance + 1));
                        check[nx][ny][ncounter] = true;
                    }

                } else {
                    if (ncounter + 1 <= K && !check[nx][ny][ncounter+1]) {
                        queue.add(new Coordinate(nx, ny, ncounter+1, ndistance+1));
                        check[nx][ny][ncounter+1] = true;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (min == 987_654_321) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}

class Coordinate {
    int x;
    int y;
    int counter;
    int distance;

    Coordinate (int x, int y, int counter, int distance) {
        this.x = x;
        this.y = y;
        this.counter = counter;
        this.distance = distance;
    }
}