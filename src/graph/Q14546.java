package graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14546 {
    /*
    public static int R, C;
    public static char map [][];
    public static char shape;
    public static BufferedWriter bw;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t<T; ++t) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken())-1;
            int startX = R-Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken())-1;
            int endX = R-Integer.parseInt(st.nextToken());
            map = new char [R][C];
            for (int i=0; i<R; ++i) {
                String line = br.readLine();
                for (int j=0; j<C; ++j) {
                    map[i][j] = line.charAt(j);
                }
            }
            shape = map[startX][startY];
            bfs(startX, startY, endX, endY);
        }
        bw.flush();
    }

    public static void bfs (int startX, int startY, int endX, int endY) throws IOException {
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [R][C];
        queue.add(new Coordinate(startX, startY));
        visited[startX][startY] = true;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == endX && c.y == endY) {
                bw.append("YES");
                bw.newLine();
                return;
            }

            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] != shape) {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny));

            }
        }
        bw.append("NO");
        bw.newLine();
    }
     */
}

/*
class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */
