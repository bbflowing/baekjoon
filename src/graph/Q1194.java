package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1194 {
    /*
    public static int R, C;
    public static char maze[][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char[R][C];
        Coordinate start = null;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                maze[i][j] = line.charAt(j);
                if (maze[i][j] == '0') {
                    start = new Coordinate(i, j, 0, 0);
                    maze[i][j] = '.';
                }
            }
        }
        bfs(start);
    }

    public static void bfs(Coordinate start) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(start);
        boolean visited[][][] = new boolean[R][C][1<<6];
        visited[start.x][start.y][0] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (visited[nx][ny][c.key]) {
                    continue;
                }
                if (maze[nx][ny] == '#') {
                    continue;
                } else if ('a' <= maze[nx][ny] && maze[nx][ny] <= 'f') {
                    visited[nx][ny][c.key] = true;
                    int tempKey = 1<<(maze[nx][ny]-'a') | c.key;
                    visited[nx][ny][tempKey] = true;
                    queue.add(new Coordinate(nx, ny, tempKey, c.distance+1));
                    //maze[nx][ny] = '.';
                } else if ('A' <= maze[nx][ny] && maze[nx][ny] <= 'F') {
                    int check = c.key & 1<<(maze[nx][ny]-'A');
                    if (check == 0) {
                        continue;
                    } else {
                        //maze[nx][ny] = '.';
                        visited[nx][ny][c.key] = true;
                        queue.add(new Coordinate(nx, ny, c.key, c.distance+1));
                    }
                } else if (maze[nx][ny] == '1') {
                    System.out.println(c.distance+1);
                    return;
                } else if (maze[nx][ny] == '.') {
                    queue.add(new Coordinate(nx, ny, c.key, c.distance+1));
                    visited[nx][ny][c.key] = true;
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
    int key;
    int distance;

    Coordinate(int x, int y, int key, int distance) {
        this.x = x;
        this.y = y;
        this.key = key;
        this.distance = distance;
    }
}
 */