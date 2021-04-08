package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q6189 {
    /*
    public static int R, C;
    public static char map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        int startX = 0; int startY = 0;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'B') {
                    startX = i; startY= j;
                }
            }
        }
        bfs(startX, startY);
    }

    public static void bfs (int x, int y) {
        boolean visited [][] = new boolean [R][C];
        Queue<Coordinate> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new Coordinate(x, y, 0));
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] == '*') {
                    continue;
                } else if (map[nx][ny] == 'C') {
                    System.out.println(c.munches+1);
                    return;
                }
                queue.add(new Coordinate(nx, ny, c.munches+1));
                visited[nx][ny] = true;
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int munches;

    Coordinate (int x, int y, int munches) {
        this.x = x;
        this.y = y;
        this.munches = munches;
    }
}

 */
