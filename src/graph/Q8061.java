package graph;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q8061 {
    /*
    public static int R, C;
    public static int pixels [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        pixels = new int [R][C];
        boolean visited [][] = new boolean [R][C];
        Queue<Coordinate> queue = new LinkedList<>();
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                pixels[i][j] = line.charAt(j) - '0';
                if (pixels[i][j] == 1) {
                    queue.add(new Coordinate(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }
        bfs(queue, visited);
    }

    public static void bfs (Queue<Coordinate> queue, boolean [][] visited) throws IOException {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        int result [][] = new int [R][C];

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (pixels[nx][ny] == 1) {
                    continue;
                }
                visited[nx][ny] = true;
                result[nx][ny] = c.distance+1;
                queue.add(new Coordinate(nx, ny, c.distance+1));
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0; i<R; ++i) {
            String line = "";
            for (int j=0; j<C; ++j) {
                line += result[i][j]+" ";
            }
            bw.append(line);
            bw.newLine();
        }
        bw.flush();
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
