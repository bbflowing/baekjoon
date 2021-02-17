package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q15240 {
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j)-'0';
            }
        }
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int paint = Integer.parseInt(st.nextToken());
        bfs(x, y, N, M, paint);
        for (int i=0; i<N; ++i) {
            System.out.println(Arrays.toString(input[i]));
        }

    }

    public static void bfs (int x, int y, int N, int M, int paint) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y));
        boolean visited [][] = new boolean [N][M];
        int start = input[x][y];
        input[x][y] = paint;
        visited[x][y] = true;
        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    continue;
                }

                if (input[nx][ny] != start) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }
                visited[nx][ny] = true;
                input[nx][ny] = paint;
                queue.add(new Coordinate(nx, ny));
            }
        }

    }
}

class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
