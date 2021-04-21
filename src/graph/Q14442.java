package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14442 {
    /*
    public static int R, C;
    public static int map[][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int[R+1][C+1];
        for (int i=1; i<=R; ++i) {
            String line = br.readLine();
            for (int j=1; j<=C; ++j) {
                map[i][j] = line.charAt(j-1) - '0';
            }
        }
        bfs (K);
    }

    public static void bfs (int K) {
        boolean visited[][][] = new boolean[K+1][R+1][C+1];
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(1, 1, 0, 1));
        visited[0][1][1] = true;
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == R && c.y == C) {
                System.out.println(c.distance);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<1 || R<nx || ny<1 || C<ny) {
                    continue;
                }
                if (map[nx][ny] == 1) {
                    if (c.broken <= K-1) {
                        if (!visited[c.broken+1][nx][ny]) {
                            visited[c.broken+1][nx][ny] = true;
                            queue.add(new Coordinate(nx, ny, c.broken+1, c.distance+1));
                        }
                    }
                } else {
                    if (!visited[c.broken][nx][ny]) {
                        visited[c.broken][nx][ny] = true;
                        queue.add(new Coordinate(nx, ny, c.broken, c.distance+1));
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
    int distance;

    Coordinate (int x, int y, int broken, int distance) {
        this.x = x;
        this.y = y;
        this.broken = broken;
        this.distance = distance;
    }
}
 */