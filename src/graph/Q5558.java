package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5558 {
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
                if (map[i][j] == 'S') {
                    map[i][j] = '.';
                    startX = i; startY= j;
                }
            }
        }
        int K = Integer.parseInt(st.nextToken());
        bfs(startX, startY, K);
    }

    public static void bfs (int x, int y, int K) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean visited [][][] = new boolean [R][C][K+1];
        visited[x][y][1] = true;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y, 1, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (map[c.x][c.y]-'0' == c.target) {
                if (c.target == K) {
                    System.out.println(c.distance);
                    return;
                } else {
                    visited[c.x][c.y][c.target+1] = true;
                    queue.add(new Coordinate(c.x, c.y, c.target+1, c.distance));
                    continue;
                }
            }
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (map[nx][ny] == 'X') {
                    continue;
                }
                if (visited[nx][ny][c.target]) {
                    continue;
                }
                visited[nx][ny][c.target] = true;
                queue.add(new Coordinate(nx, ny, c.target, c.distance+1));
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int target;
    int distance;

    Coordinate (int x, int y, int target, int distance) {
        this.x = x;
        this.y = y;
        this.target = target;
        this.distance = distance;
    }
}
 */
