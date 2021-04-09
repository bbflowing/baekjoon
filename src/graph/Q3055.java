package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q3055 {
    /*
    public static char map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        Queue<Coordinate> sQ = new LinkedList<>();
        Queue<Coordinate> wQ = new LinkedList<>();
        boolean sV [][] = new boolean [R][C];
        boolean wV [][] = new boolean [R][C];

        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'S') {
                    sQ.add(new Coordinate(i, j, 0));
                    sV[i][j] = true;
                } else if (map[i][j] == '*') {
                    wQ.add(new Coordinate(i, j));
                    wV[i][j] = true;
                }
            }
        }

        int answer = bfs(sQ, wQ, sV, wV, R, C);
        if (answer == -1) {
            System.out.println("KAKTUS");
        } else {
            System.out.println(answer);
        }
    }

    public static int bfs (Queue<Coordinate> sQ, Queue<Coordinate> wQ, boolean [][] sV,
                            boolean [][] wV, int R, int C) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean success = false;

        while (true) {
            int wSize = wQ.size();
            for (int i=0; i<wSize; ++i) {
                Coordinate water = wQ.poll();
                for (int j=0; j<4; ++j) {
                    int nx = water.x + dx[j];
                    int ny = water.y + dy[j];

                    if (nx<0 || R<=nx || ny<0 || C<=ny) {
                        continue;
                    }
                    if (map[nx][ny] == 'D' || map[nx][ny] == 'X') {
                        continue;
                    }
                    if (wV[nx][ny]) {
                        continue;
                    }
                    wV[nx][ny] = true;
                    wQ.add(new Coordinate(nx, ny));
                }
            }

            int sSize = sQ.size();
            for (int i=0; i<sSize; ++i) {
                Coordinate hog = sQ.poll();
                if (map[hog.x][hog.y] == 'D') {
                    return hog.time;
                }
                for (int j=0; j<4; ++j) {
                    int nx = hog.x + dx[j];
                    int ny = hog.y + dy[j];

                    if (nx<0 || R<=nx || ny<0 || C<=ny) {
                        continue;
                    }
                    if (map[nx][ny] == 'X') {
                        continue;
                    }
                    if (wV[nx][ny] || sV[nx][ny]) {
                        continue;
                    }
                    sV[nx][ny] = true;
                    sQ.add(new Coordinate(nx, ny, hog.time+1));
                }
            }

            if (sQ.size() == 0) {
                return -1;
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int time;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }
}

 */