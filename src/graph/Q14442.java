package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14442 {
    /*
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        input = new int [N][M];

        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j)-'0';
            }
        }

        bfs(N, M, K);
    }

    public static void bfs (int N, int M, int K) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][][] = new boolean [N][M][K+1];
        queue.add(new Coordinate(0, 0, 0, 1));
        visited[0][0][0] = true;
        boolean flag = false;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (current.x == N-1 && current.y == M-1) {
                System.out.println(current.distance);
                flag = true;
                break;
            }
            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    continue;
                }
                if (input[nx][ny] == 1) {
                    if (current.broken + 1 <= K && !visited[nx][ny][current.broken+1]) {
                        visited[nx][ny][current.broken+1] = true;
                        queue.add(new Coordinate(nx, ny, current.broken+1, current.distance+1));
                    }
                } else if (input[nx][ny] == 0) {
                    if (!visited[nx][ny][current.broken]) {
                        visited[nx][ny][current.broken] = true;
                        queue.add(new Coordinate(nx, ny, current.broken, current.distance+1));
                    }
                }
            }

        }
        if (!flag) {
            System.out.println(-1);
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int broken;
    int distance;

    Coordinate (int x, int y, int broken, int distance) {
        this.x = x;
        this.y = y;
        this.broken = broken;
        this.distance = distance;
    }
}
 */