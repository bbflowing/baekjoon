package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1987 {
    /*
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        input = new char [R][C];
        for (int i=0; i<R; ++i) {
            String temp = br.readLine();
            for (int j=0; j<C; ++j) {
                input[i][j] = temp.charAt(j);
            }
        }
        boolean check [] = new boolean [26];
        char current = input[0][0];
        check[current-'A'] = true;
        bfs(0, 0, check, R, C);
    }
    public static void bfs (int x, int y, boolean [] check, int R, int C) {
        Queue <Pair> queue = new LinkedList<>();
        int counter = 0;
        queue.add(new Pair(x, y, counter));
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        int max = 0;
        while (!queue.isEmpty()) {
            Pair next = queue.poll();
            counter = next.counter + 1;
            check[input[next.x][next.y]-'A'] = true;
            if (counter > max) {
                max = counter;
            }

            for (int i=0; i<4; ++i) {
                int newX = next.x + dx[i];
                int newY = next.y + dy[i];
                if (newX < 0 || R <= newX  || newY < 0 || C <= newY) {
                    continue;
                }
                if (!check[input[newX][newY]-'A']) {
                    queue.add(new Pair(newX, newY, counter));
                }
            }
        }
        System.out.println(max);
    }
    */
}

/*
class Pair {
    int x;
    int y;
    int counter;
    Pair (int x, int y, int counter) {
        this.x = x;
        this.y = y;
        this.counter = counter;
    }
}

     */
