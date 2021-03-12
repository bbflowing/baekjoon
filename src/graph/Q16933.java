package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16933 {
    /*
    public static int map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int [N+1][M+1];

        for (int i=1; i<=N; ++i) {
            String line = br.readLine();
            for (int j=1; j<=M; ++j) {
                map[i][j] = line.charAt(j-1)-'0';
            }
        }
        bfs(N, M, K);
    }

    public static void bfs (int N, int M, int K) {
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][][][] = new boolean [N+1][M+1][2][K+1];
        queue.add(new Coordinate(1, 1, 0, 0, 1));
        visited[1][1][0][0] = true;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == N && c.y == M) {
                System.out.println(c.distance);
                return;
            }

            if (c.time == 0 && !visited[c.x][c.y][1][c.broken]) {
                visited[c.x][c.y][1][c.broken] = true;
                queue.add(new Coordinate (c.x, c.y, c.broken, 1, c.distance+1));
            } else if (c.time == 1 && !visited[c.x][c.y][0][c.broken]) {
                visited[c.x][c.y][0][c.broken] = true;
                queue.add(new Coordinate(c.x, c.y, c.broken, 0, c.distance+1));
            }

            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<1 || N+1<=nx || ny<1 || M+1<=ny) {
                    continue;
                }
                if (c.time == 0) {
                    if (map[nx][ny] == 1 && c.broken+1 <= K && !visited[nx][ny][1][c.broken+1]) {
                        visited[nx][ny][1][c.broken+1] = true;
                        queue.add(new Coordinate(nx, ny, c.broken+1, 1,c.distance+1));
                    } else if (map[nx][ny] == 0 && !visited[nx][ny][1][c.broken]) {
                        visited[nx][ny][1][c.broken] = true;
                        queue.add(new Coordinate(nx, ny, c.broken, 1, c.distance+1));
                    }
                } else if (c.time == 1) {
                    if (map[nx][ny] == 1 && c.broken+1<=K && !visited[nx][ny][0][c.broken+1]) {
                        visited[c.x][c.y][1][c.broken] = true;
                        queue.add(new Coordinate(c.x, c.y, c.broken, 0, c.distance+1));
                    } else if (map[nx][ny] == 0 && !visited[nx][ny][0][c.broken]) {
                        visited[nx][ny][0][c.broken] = true;
                        queue.add(new Coordinate(nx, ny, c.broken, 0, c.distance+1));
                    }
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
    int broken;
    int time;
    int distance;

    Coordinate (int x, int y, int broken, int time, int distance) {
        this.x = x;
        this.y = y;
        this.broken = broken;
        this.time = time;
        this.distance = distance;
    }
}

 */
