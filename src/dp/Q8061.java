package dp;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q8061 {
    public static int H, W;
    public static int map [][];
    public static int dp [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        map = new int [H][W];
        for (int i=0; i<H; ++i) {
            String line = br.readLine();
            for (int j=0; j<W; ++j) {
                map[i][j] = line.charAt(j)-'0';
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0; i<H; ++i) {
            for (int j=0; j<W; ++j) {
                if (map[i][j] == 0) {
                    bw.append(String.valueOf(solve(i, j)));
                } else {
                    bw.append("0");
                }
            }
            bw.newLine();
        }
        bw.flush();
    }

    public static int solve (int x, int y) {
        boolean visited [][] = new boolean [H][W];
        visited[x][y] = true;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (map[c.x][c.y] == 1) {
                return c.distance;
            }
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || H<=nx || ny<0 || W<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, c.distance+1));
            }
        }
        return 0;
    }
}

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
