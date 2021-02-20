package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2589 {
    public static char input [][];
    public static int check [][];
    public static int size;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];
        check = new int [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        int counter = 0;
        int max = -1;

        for (int i=0; i<N; ++i) {
            Arrays.fill(check[i], -1);
        }

        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (input[i][j] == 'L' && check[i][j] == -1) {
                    size = 1;
                    check[i][j] = counter;
                    dfs(i, j, counter, N, M);
                    if (max < size) {
                        max = size;
                    }
                    ++counter;
                }
            }
        }
        if (max != 1) {
            max = -1;
            int x = 0; int y = 0;
            for (int i=0; i<N; ++i) {
                for (int j=0; j<M; ++j) {
                    if (check[i][j] != -1) {
                        x = i; y = j;
                        int answer = bfs(check[i][j], x, y, N, M);
                        if (answer > max) {
                            max = answer;
                        }
                    }
                }
            }
        }
        System.out.println(max);

    }

    public static int bfs (int target, int x, int y, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y, 0));
        boolean visited [][] = new boolean [N][M];
        visited[x][y] = true;
        int max = -1;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (current.distance > max) {
                max = current.distance;
            }
            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    continue;
                }
                if (check[nx][ny] != target) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, current.distance+1));
            }
        }
        return max;
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
            if (check[nx][ny] != -1) {
                continue;
            }
            if (input[nx][ny] == 'W') {
                continue;
            }
            check[nx][ny] = counter;
            ++size;
            dfs(nx, ny, counter, N, M);
        }

    }
}

class Coordinate {
    int x;
    int y;
    int distance;

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
