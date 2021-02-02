package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2146 {
    public static int input [][];
    public static int answer;
    public static boolean check [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new int [N][N];
        check = new boolean[N][N];
        for (int i=0; i<N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int counter = 1;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (input[i][j] != 0 && !check[i][j]) {
                    input[i][j] = counter;
                    check[i][j] = true;
                    dfs(i, j, counter, N);
                    ++counter;
                }
            }
        }
        answer = 987_654_321;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (input[i][j] != 0) {
                    bfs(i, j, N);
                }
            }
        }
        System.out.println(answer);
    }
    public static void dfs (int x, int y, int counter, int N) {
        for (int i=0; i<4; ++i) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX < 0 || N <= newX || newY < 0 || N <= newY) {
                continue;
            }
            if (check[newX][newY]) {
                continue;
            }
            if (input[newX][newY] != 0 && !check[newX][newY]) {
                input[newX][newY] = counter;
                check[newX][newY] = true;
                dfs(newX, newY, counter, N);
            }
        }
    }
    public static void bfs(int x, int y, int N) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add (new Coordinate(x, y, 0));
        boolean check [][] = new boolean [N][N];
        int start = input[x][y];
        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            for (int i=0; i<4; ++i) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];
                if (newX < 0 || N <= newX || newY < 0 || N <= newY) {
                    continue;
                }
                if (input[newX][newY] != start && input[newX][newY] != 0) {
                    if (answer > current.counter) {
                        answer = current.counter;
                    }
                    return;
                }
                if (check[newX][newY]) {
                    continue;
                }
                if (input[newX][newY] == start) {
                    continue;
                }
                check[newX][newY] = true;
                queue.add(new Coordinate(newX, newY, current.counter+1));
            }
        }

    }
}
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
