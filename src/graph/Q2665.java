package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q2665 {
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new char [N+1][N+1];
        for (int i=1; i<=N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                input[i][j+1] = line.charAt(j);
            }
        }
        bfs(1, 1, N);
    }

    public static void bfs (int start, int end, int N) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(start, end));
        int check [][] = new int [N+1][N+1];
        for (int i=1; i<=N; ++i) {
            Arrays.fill(check[i], 987_654_321);
        }
        check[start][end] = 0;
        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            for (int i=0; i<4; ++i) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];
                if (1 <= newX && newX <= N && 1 <= newY && newY <= N && check[current.x][current.y] < check[newX][newY]) {
                    if (input[newX][newY] == '1') {
                        check[newX][newY] = check[current.x][current.y];
                    } else {
                        check[newX][newY] = check[current.x][current.y] + 1;
                    }
                    queue.add(new Coordinate(newX, newY));
                }
            }
        }
        System.out.println(check[N][N]);
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
