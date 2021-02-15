package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14502 {
    public static int input[][];
    public static boolean visited[][];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int[N][M];
        int answer = 0;

        ArrayList<Coordinate> blanks = new ArrayList<>();
        Queue<Coordinate> virus = new LinkedList<>();

        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (input[i][j] == 0) {
                    blanks.add(new Coordinate(i, j));
                } else if (input[i][j] == 2) {
                    virus.add(new Coordinate(i, j));
                }
            }
        }

        for (int i = 0; i < blanks.size() - 2; ++i) {
            Coordinate first = blanks.get(i);
            input[first.x][first.y] = 1;
            for (int j = i + 1; j < blanks.size() - 1; ++j) {
                Coordinate second = blanks.get(j);
                input[second.x][second.y] = 1;
                for (int k = j + 1; k < blanks.size(); ++k) {
                    Coordinate third = blanks.get(k);
                    input[third.x][third.y] = 1;
                    int temp[][] = bfs(N, M, virus); //spread the virus
                    visited = new boolean[N][M];
                    int counter = 0;
                    for (int l = 0; l < N; ++l) {
                        for (int m = 0; m < M; ++m) {
                            if (temp[l][m] == 0 && !visited[l][m]) {
                                visited[l][m] = true;
                                counter += dfs(N, M, l, m, 1, temp);

                            }
                        }
                    }
                    if (counter > answer) {
                        answer = counter;
                    }
                    input[third.x][third.y] = 0;
                }
                input[second.x][second.y] = 0;
            }
            input[first.x][first.y] = 0;
        }
        System.out.println(answer);
    }

    public static int[][] bfs(int N, int M, Queue<Coordinate> virus) {
        Queue<Coordinate> queue = new LinkedList<>(virus);
        boolean visited[][] = new boolean[N][M];
        int temp[][] = new int[N][M];
        for (int i = 0; i < N; ++i) {
            temp[i] = input[i].clone();
        }

        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            visited[current.x][current.y] = true;
            for (int i = 0; i < 4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx < 0 || N <= nx || ny < 0 || M <= ny) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                if (temp[nx][ny] == 1 || temp[nx][ny] == 2) {
                    continue;
                }

                queue.add(new Coordinate(nx, ny));
                temp[nx][ny] = 2;
                visited[nx][ny] = true;
            }
        }
        return temp;
    }

    public static int dfs(int N, int M, int x, int y, int counter, int[][] temp) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        for (int i = 0; i < 4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || N <= nx || ny < 0 || M <= ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (temp[nx][ny] == 1 || temp[nx][ny] == 2) {
                continue;
            }
            visited[nx][ny] = true;
            ++counter;
            counter = dfs(N, M, nx, ny, counter, temp);
        }
        return counter;
    }
}

class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}