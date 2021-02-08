package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17836 {
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(N, M, T);
    }

    public static void bfs (int N, int M, int T) {
        Queue<Coordinate> queue = new LinkedList<>();
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean check [][][] = new boolean [N][M][2];
        queue.add(new Coordinate(0, 0, 0, 0));
        check[0][0][0] = true;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (current.distance > T) {
                continue;
            }

            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                int nsword = current.sword;
                int ndistance = current.distance;

                if (nx == N-1 && ny == M-1) {
                    System.out.println(ndistance + 1);
                    return;
                }

                if (nx < 0 || N <= nx || ny < 0 || M <= ny) {
                    continue;
                }

                if (check[nx][ny][nsword]) {
                    continue;
                }

                if (nsword == 0) {
                    if (input[nx][ny] == 1) {
                        continue;
                    }
                    check[nx][ny][0] = true;
                    if (input[nx][ny] == 0) {
                        queue.add(new Coordinate(nx, ny, 0, ndistance + 1));
                    } else if (input[nx][ny] == 1) {
                        queue.add(new Coordinate(nx, ny, 1, ndistance + 1));
                    }

                } else {
                    check[nx][ny][nsword] = true;
                    queue.add(new Coordinate(nx, ny, 1, ndistance + 1));
                }
            }
        }
        System.out.println("Fail");
    }
}

class Coordinate {
    int x;
    int y;
    int sword;
    int distance;

    Coordinate (int x, int y, int sword, int distance) {
        this.x = x;
        this.y = y;
        this.sword = sword;
        this.distance = distance;
    }
}
