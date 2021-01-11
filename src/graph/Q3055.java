package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q3055 {
    /*
    public static char input [][];
    public static Queue<Coordinate> waters;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        input = new char [R][C];
        waters = new LinkedList<>();
        boolean water [][] = new boolean[R][C];
        int x = 0;
        int y = 0;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == 'S') {
                    x = i; y = j;
                } else if (input[i][j] == '*') {
                    waters.add(new Coordinate(i, j));
                }
            }
        }
        bfs(x, y, R, C);
    }

    public static void bfs (int x, int y, int R, int C) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y));
        int counter = 0;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        while (true) {
            ++counter;
            int waterSize = waters.size();
            for (int i=0; i<waterSize; ++i) {
                Coordinate water = waters.poll();
                for (int j=0; j<4; ++j) {
                    int newX = water.x + dx[j];
                    int newY = water.y + dy[j];
                    if (newX < 0 || R <= newX || newY < 0 || C <= newY) {
                        continue;
                    }
                    if (input[newX][newY] == '.') {
                        waters.add(new Coordinate(newX, newY));
                        input[newX][newY] = '*';
                    }
                }
            }

            int queueSize = queue.size();
            if (queueSize == 0) {
                System.out.println("KAKTUS");
                return;
            }
            for (int i=0; i<queueSize; ++i) {
                Coordinate next = queue.poll();
                for (int j = 0; j < 4; ++j) {
                    int newX = next.x + dx[j];
                    int newY = next.y + dy[j];
                    if (newX < 0 || R <= newX || newY < 0 || C <= newY) {
                        continue;
                    }
                    if (input[newX][newY] == 'D') {
                        System.out.println(counter);
                        return;
                    }
                    if (input[newX][newY] == '.') {
                        input[newX][newY] = 'S';
                        queue.add(new Coordinate(newX, newY));
                    }
                }
            }
        }
    }
    */
}

/*
class Coordinate {
    int x;
    int y;
    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */
