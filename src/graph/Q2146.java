package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2146 {
    /*
    public static int input [][];
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new int [N][N];
        visited = new boolean [N][N];
        for (int i=0; i<N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int counter = 0;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (input[i][j] == 1 && !visited[i][j]) {
                    ++counter;
                    input[i][j] = counter;
                    visited[i][j] = true;
                    dfs(i, j, N, counter);
                }
            }
        }
        int answer = 987_654_321;
        for (int i=1; i<=counter; ++i) {
            int min = bfs(N, i);
            if (answer > min) {
                answer = min;
            }
        }
        System.out.println(answer);
    }

    public static int bfs(int N, int start) {
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean[N][N];
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (input[i][j] == start) {
                    queue.add(new Coordinate(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }

        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            int nbridge = current.bridge;
            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || N<=ny) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                if (input[nx][ny] == start) {
                    visited[nx][ny] = true;
                    queue.add(new Coordinate (nx, ny, nbridge));
                } else if (input[nx][ny] == 0) {
                    visited[nx][ny] = true;
                    queue.add(new Coordinate(nx, ny, nbridge+1));
                } else {
                    return nbridge;
                }
            }
        }
        return 987_654_321;

    }

    public static void dfs (int x, int y, int N, int counter) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int i=0; i<4; ++i) {
            int nx = x+dx[i];
            int ny = y+dy[i];

            if (nx<0 || N<=nx || ny<0 || N<=ny) {
                continue;
            }

            if (visited[nx][ny]) {
                continue;
            }

            if (input[nx][ny] == 0) {
                continue;
            }
            visited[nx][ny] = true;
            input[nx][ny] = counter;
            dfs(nx, ny, N, counter);
        }
    }

     */
}

/*
class Coordinate {
    int x;
    int y;
    int bridge;

    Coordinate (int x, int y, int bridge) {
        this.x = x;
        this.y = y;
        this.bridge = bridge;
    }
}
 */