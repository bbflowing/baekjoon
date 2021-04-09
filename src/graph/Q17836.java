package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17836 {
    /*
    public static int map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        map = new int [N+1][M+1];
        for (int i=1; i<=N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=M; ++j) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(N, M, T);
    }

    public static void bfs (int N, int M, int T) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(1, 1, 0, 0));
        boolean visited [][][] = new boolean [N+1][M+1][2];
        visited[1][1][0] = true;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == N && c.y == M && c.distance <= T) {
                System.out.println(c.distance);
                return;
            }
            if (c.distance > T) {
                break;
            }
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];
                int nsword = c.sword;
                int ndistance = c.distance+1;

                if (nx<1 || N+1<=nx || ny<1 || M+1<=ny) {
                    continue;
                }
                if (map[nx][ny] == 0) {
                    if (!visited[nx][ny][nsword]) {
                        visited[nx][ny][nsword] = true;
                        queue.add(new Coordinate(nx, ny, nsword, ndistance));
                    }
                } else if (map[nx][ny] == 1) {
                    if (nsword == 1) {
                        if (!visited[nx][ny][nsword]) {
                            visited[nx][ny][nsword] = true;
                            queue.add(new Coordinate(nx, ny, nsword, ndistance));
                        }
                    }
                } else if (map[nx][ny] == 2) {
                    nsword = 1;
                    if (!visited[nx][ny][nsword]) {
                        visited[nx][ny][nsword] = true;
                        queue.add(new Coordinate(nx, ny, nsword, ndistance));
                    }
                }
            }
        }
        System.out.println("Fail");
    }

     */
}

/*
class Coordinate {
    int x;
    int y;
    int sword;
    int distance;

    Coordinate (int x, int y, int sword, int distance) {
        this.x = x;
        this.y = y;
        this.sword = sword;
        this.distance = distance;
    }
}

 */