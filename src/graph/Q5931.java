package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5931 {
    /*
    public static char input [][];
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];
        visited = new boolean [N][M];

        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        int counter = 1;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (input[i][j] == 'X' && !visited[i][j]) {
                    input[i][j] = (char) (counter+'0');
                    visited[i][j] = true;
                    dfs (i, j, counter, N, M);
                    ++counter;
                }
            }
        }
        int answer = 987_654_321;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (input[i][j] == '1') {
                    int temp = bfs(i, j, N, M);
                    if (temp == -1) {
                        continue;
                    }
                    if (temp < answer) {
                        answer = temp;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    public static int bfs (int x, int y, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [N][M];
        queue.add(new Coordinate(x, y, 0));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (input[current.x][current.y] == '2') {
                return current.bridge-1;
            }
            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, current.bridge+1));
            }
        }
        return -1;
    }

    public static void dfs (int x, int y, int counter, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || N<=nx || ny<0 || M<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (input[nx][ny] != 'X') {
                continue;
            }
            visited[nx][ny] = true;
            input[nx][ny] = (char) (counter+'0');
            dfs(nx, ny, counter, N, M);
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
