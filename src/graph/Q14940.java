package graph;

import java.io.*;
import java.util.*;

public class Q14940 {
    /*
    public static int R, C;
    public static int map[][];
    public static int distances[][];
    
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        distances = new int[R][C];
        Coordinate start = null;
        for (int i=0; i<R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<C; ++j) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    start = new Coordinate(i, j, 0);
                } else if (map[i][j] == 1) {
                    distances[i][j] = -1;
                }
            }
        }
        bfs(start);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0; i<R; ++i) {
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<C; ++j) {
                sb.append(distances[i][j]+" ");
            }
            bw.append(sb);
            bw.newLine();
        }
        bw.flush();
    }
    public static void bfs (Coordinate start) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.offer(new Coordinate(start.x, start.y, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (distances[nx][ny] != -1) {
                    continue;
                }
                queue.add(new Coordinate(nx, ny, c.distance+1));
                distances[nx][ny] = c.distance+1;
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int distance;

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
 */