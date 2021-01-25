package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q5212 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char input [][] = new char [R][C];
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        char map [][] = new char [R][C];
        for (int i=0; i<R; ++i) {
            map[i] = input[i].clone();
        }
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (input[i][j] == 'X') {
                    int counter = 0;
                    for (int k=0; k<4; ++k) {
                        int newX = i + dx[k];
                        int newY = j + dy[k];
                        if ((newX < 0 || R <= newX || newY < 0 || C <= newY) || input[newX][newY] == '.') {
                            ++counter;
                        }
                    }
                    if (counter >= 3) {
                        map[i][j] = '.';
                    }
                }
            }
        }
        ArrayList<Coordinate> list = new ArrayList<>();
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (map[i][j] == 'X') {
                    list.add(new Coordinate(i, j));
                }
            }
        }
        int minX = 11; int maxX = 0; int minY = 11; int maxY = 0;
        for (int i=0; i<list.size(); ++i) {
            if (list.get(i).x < minX) {
                minX = list.get(i).x;
            }
            if (maxX < list.get(i).x) {
                maxX = list.get(i).x;
            }
            if (list.get(i).y < minY) {
                minY = list.get(i).y;
            }
            if (maxY < list.get(i).y) {
                maxY = list.get(i).y;
            }
        }
        for (int i=minX; i<=maxX; ++i) {
            String temp = "";
            for (int j=minY; j<=maxY; ++j) {
                temp += map[i][j];
            }
            System.out.println(temp);
        }
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
