package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q17198 {
    public static char map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new char [10][10];
        Coordinate barn = null;
        for (int i=0; i<10; ++i) {
            String line = br.readLine();
            for (int j=0; j<10; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'B') {
                    barn = new Coordinate(i, j);
                }
            }
        }
        bfs(barn);
    }

    public static void bfs (Coordinate barn) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [10][10];
        visited[barn.x][barn.y] = true;
        queue.add(new Coordinate(barn.x, barn.y, 0));

        while (!queue.isEmpty()) {
            Coordinate b = queue.poll();
            for (int i=0; i<4; ++i) {
                int nx = b.x + dx[i];
                int ny = b.y + dy[i];

                if (nx<0 || 10<=nx || ny<0 || 10<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] == 'R') {
                    continue;
                } else if (map[nx][ny] == 'L') {
                    System.out.println(b.distance);
                    return;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, b.distance+1));
            }
        }
    }
}

class Coordinate {
    int x;
    int y;
    int distance;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
