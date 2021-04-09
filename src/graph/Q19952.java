package graph;

import java.io.*;
import java.util.*;

public class Q19952 {
    /*
    public static int map [][];
    public static int H, W;
    public static BufferedWriter bw;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t<T; ++t) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            int O = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            map = new int [H+1][W+1];
            for (int i=0; i<O; ++i) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int height = Integer.parseInt(st.nextToken());
                map[x][y] = height;
            }
            bfs(startX, startY, endX, endY, F);
            if (t != T-1) {
                bw.newLine();
            }
        }
        bw.flush();
    }

    public static void bfs (int startX, int startY, int endX, int endY, int F) throws IOException {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate (startX, startY, F));
        boolean visited [][] = new boolean [H+1][W+1];
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == endX && c.y == endY) {
                bw.append("잘했어!!");
                return;
            }
            if (c.strength <= 0) {
                continue;
            }
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<1 || H<nx || ny<1 || W<ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] >= 1) {
                    if (c.strength < map[nx][ny]-map[c.x][c.y]) {
                        continue;
                    }
                }
                int nF = c.strength-1;
                if (nF >= 0) {
                    visited[nx][ny] = true;
                    queue.add(new Coordinate(nx, ny, nF));
                }
            }
        }
        bw.append("인성 문제있어??");
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int strength;

    Coordinate (int x, int y, int strength) {
        this.x = x;
        this.y = y;
        this.strength = strength;
    }
}
 */

