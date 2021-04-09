package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1175 {
    /*
    public static char map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new char [N][M];
        boolean flag = false;
        Coordinate first = null; Coordinate second = null;
        Coordinate start = null;
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'C') {
                    if (!flag) {
                        first = new Coordinate(i, j);
                        flag = true;
                    } else {
                        second = new Coordinate(i, j);
                    }
                } else if (map[i][j] == 'S') {
                    start = new Coordinate(i, j);
                }
            }
        }
        bfs(start, first, second, N, M);
    }

    public static void bfs (Coordinate start, Coordinate first, Coordinate second, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][][][] = new boolean [N][M][4][4];
        for (int i=0; i<4; ++i) {
            visited[start.x][start.y][i][0] = true;
        }
        queue.add(new Coordinate(start.x, start.y, 0, -1, 0));
        boolean success = false;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.found == 3) {
                System.out.println(c.time);
                success = true;
                break;
            }

            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];
                int nfound = c.found;
                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    continue;
                }
                if (c.before == i) {
                    continue;
                }
                if (visited[nx][ny][i][c.found]) {
                    continue;
                }
                if (map[nx][ny] == '#') {
                    continue;
                }
                if (nx == first.x && ny == first.y && c.found != 1) {
                    nfound += 1;
                    visited[nx][ny][i][nfound] = true;
                    queue.add(new Coordinate(nx, ny, c.time+1, i, nfound));
                } else if (nx == second.x && ny == second.y && c.found != 2) {
                    nfound += 2;
                    visited[nx][ny][i][nfound] = true;
                    queue.add(new Coordinate(nx, ny, c.time+1, i, nfound));
                } else {
                    visited[nx][ny][i][c.found] = true;
                    queue.add(new Coordinate(nx, ny, c.time+1, i, c.found));
                }

            }
        }

        if (!success) {
            System.out.println(-1);
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int time;
    int before;
    int found;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int time, int before, int found) {
        this.x = x;
        this.y = y;
        this.time = time;
        this.before = before;
        this.found = found;
    }
}
 */
