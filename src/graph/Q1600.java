package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1600 {
    /*
    public static int grid [][];
    public static int R, C;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        grid = new int [R][C];
        for (int i=0; i<R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<C; ++j) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(K);
    }

    public static void bfs (int K) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        int knightX [] = {-1, -2, -2, -1, +1, +2, +2, +1};
        int knightY [] = {-2, -1, +1, +2, -2, -1, +1, +2};

        boolean visited [][][] = new boolean [K+1][R][C];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0, 0, 0, 0));
        visited[0][0][0] = true;
        int answer = 987_654_321;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == R - 1 && c.y == C - 1) {
                if (c.distance < answer) {
                    answer = c.distance;
                }
                continue;
            }

            for (int i = 0; i < 4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx < 0 || R <= nx || ny < 0 || C <= ny) {
                    continue;
                }
                if (!visited[c.horse][nx][ny] && grid[nx][ny] == 0) {
                    visited[c.horse][nx][ny] = true;
                    queue.add(new Coordinate(nx, ny, c.horse, c.distance + 1));
                }
            }
            if (c.horse + 1 <= K) {
                for (int i = 0; i < 8; ++i) {
                    int nx = c.x + knightX[i];
                    int ny = c.y + knightY[i];

                    if (nx < 0 || R <= nx || ny < 0 || C <= ny) {
                        continue;
                    }
                    if (!visited[c.horse + 1][nx][ny] && grid[nx][ny] == 0) {
                        visited[c.horse + 1][nx][ny] = true;
                        queue.add(new Coordinate(nx, ny, c.horse + 1, c.distance + 1));
                    }
                }
            }
        }
        if (answer == 987_654_321) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
         */
}

/*
class Coordinate {
    int x;
    int y;
    int horse;
    int distance;

    Coordinate (int x, int y, int horse, int distance) {
        this.x = x;
        this.y = y;
        this.horse = horse;
        this.distance = distance;
    }
}

 */