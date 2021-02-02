package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q3184 {
    public static char input [][];
    public static int check [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        input = new char [R][C];
        check = new int [R][C];
        Queue<Coordinate> wolves = new LinkedList<>();
        Queue<Coordinate> sheep = new LinkedList<>();
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            //String temp = "";
            for (int j=0; j<C; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == 'o') {
                    sheep.add(new Coordinate(i, j));
                } else if (input[i][j] == 'v') {
                    wolves.add(new Coordinate(i, j));
                }
                //temp += input[i][j] + " ";
            }
            //System.out.println(temp);
        }
        int counter = 1;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (input[i][j] != '#' && check[i][j] == 0) {
                    check[i][j] = counter;
                    dfs(i, j, R, C, counter);
                    ++counter;
                }
            }
        }
        /*
        for (int i=0; i<R; ++i) {
            System.out.println(Arrays.toString(check[i]));
        }
         */
        int wolvesCheck [] = new int [counter];
        int sheepCheck [] = new int [counter];

        while (!wolves.isEmpty()) {
            Coordinate w = wolves.poll();
            ++wolvesCheck[check[w.x][w.y]];
        }
        while (!sheep.isEmpty()) {
            Coordinate s = sheep.poll();
            ++sheepCheck[check[s.x][s.y]];
        }
        int surviveWolf = 0;
        int surviveSheep = 0;
        /*
        System.out.println(Arrays.toString(sheepCheck));
        System.out.println(Arrays.toString(wolvesCheck));
         */
        for (int i=0; i<wolvesCheck.length; ++i) {
            if (wolvesCheck[i] - sheepCheck[i] >= 0) {
                surviveWolf += wolvesCheck[i];
            } else {
                surviveSheep += sheepCheck[i];
            }
        }
        System.out.println(surviveSheep+" "+surviveWolf);


    }
    public static void dfs (int x, int y, int R, int C, int counter) {
        for (int i=0; i<4; ++i) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX < 0 || R <= newX || newY < 0 || C <= newY) {
                continue;
            }
            if (input[newX][newY] == '#') {
                continue;
            }
            if (check[newX][newY] != 0) {
                continue;
            }
            check[newX][newY] = counter;
            dfs(newX, newY, R, C, counter);
        }
    }
}
class Coordinate{
    int x;
    int y;
    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}