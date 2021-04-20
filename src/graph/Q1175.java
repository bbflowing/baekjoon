package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1175 {
    /*
    public static int R, C;
    public static char classroom[][];
    public static int presents[][];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        classroom = new char[R][C];
        presents = new int[R][C];
        int startX = 0;
        int startY = 0;
        boolean flag = false;
        for (int i = 0; i < R; ++i) {
            String line = br.readLine();
            for (int j = 0; j < C; ++j) {
                classroom[i][j] = line.charAt(j);
                if (classroom[i][j] == 'S') {
                    startX = i;
                    startY = j;
                } else if (classroom[i][j] == 'C') {
                    if (!flag) {
                        presents[i][j] = 1;
                        flag = true;
                    } else {
                        presents[i][j] = 2;
                    }
                }
            }
        }
        bfs(startX, startY);
    }

    public static void bfs(int x, int y) {
        boolean visited[][][][] = new boolean[4][4][R][C];
        for (int direction = 0; direction < 4; ++direction) {
            visited[direction][0][x][y] = true;
        }
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(x, y, -1, 0, 0));
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            //System.out.println(c.x + "," + c.y + "," + c.direction + "," + c.distance + "," + c.found);
            int nfound = c.found;
            if (presents[c.x][c.y] == 1) {
                if (c.found + 1 == 3) {
                    System.out.println(c.distance);
                    return;
                } else if (c.found == 1){
                    continue;
                } else {
                    nfound += 1;
                }
            } else if (presents[c.x][c.y] == 2) {
                if (c.found + 2 == 3) {
                    System.out.println(c.distance);
                    return;
                } else if (c.found == 2){
                    continue;
                } else {
                    nfound += 2;
                }
            }

            for (int dir = 0; dir < 4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx < 0 || R <= nx || ny < 0 || C <= ny) continue;
                if (classroom[nx][ny] == '#') continue;
                if (visited[dir][nfound][nx][ny]) continue;

                if (c.direction == -1) {
                    visited[dir][nfound][nx][ny] = true;
                    queue.add(new Coordinate(nx, ny, dir, c.distance + 1, nfound));

                } else if (c.direction != dir) {
                    visited[dir][nfound][nx][ny] = true;
                    queue.add(new Coordinate(nx, ny, dir, c.distance + 1, nfound));

                }
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int direction;
    int distance;
    int found;

    Coordinate(int x, int y, int direction, int distance, int found) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.distance = distance;
        this.found = found;
    }
}
 */
