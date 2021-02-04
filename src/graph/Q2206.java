package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2206 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char input [][] = new char [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        bfs(input, N, M);
    }
    public static void bfs (char [][] input, int N, int M) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0, 0, 0));
        boolean check [][][] = new boolean [N][M][2];
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        check[0][0][0] = true;
        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            ++distance;
            for (int a=0; a<size; ++a) {
                Coordinate current = queue.poll();
                if (current.x == N-1 && current.y == M-1) {
                    System.out.println(distance);
                    System.exit(0);
                }
                for (int i=0; i<4; ++i) {
                    int nx = current.x + dx[i];
                    int ny = current.y + dy[i];
                    int ncounter = current.counter;
                    if (nx < 0 || N <= nx || ny < 0 || M <= ny) {
                        continue;
                    }
                    if (check[nx][ny][ncounter]) {
                        continue;
                    }
                    if (input[nx][ny] == '1') {
                        if (ncounter == 0) {
                            queue.add(new Coordinate(nx, ny, ncounter+1));
                            check[nx][ny][ncounter+1] = true;
                        } else {
                            continue;
                        }
                    } else {
                        queue.add(new Coordinate(nx, ny, ncounter));
                        check[nx][ny][ncounter] = true;
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
    int counter;

    Coordinate (int x, int y, int counter) {
        this.x = x;
        this.y = y;
        this.counter = counter;
    }
}
 */
