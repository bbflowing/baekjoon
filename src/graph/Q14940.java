package graph;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14940 {
    /*
    public static int R, C;
    public static int result [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        result = new int [R][C];
        Coordinate start = null;
        int blanks = 0;
        for (int i=0; i<R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<C; ++j) {
                int value = Integer.parseInt(st.nextToken());
                if (value == 2) {
                    start = new Coordinate(i, j, 0);
                } else if (value == 1) {
                    result[i][j] = -1;
                    ++blanks;
                }
            }
        }
        bfs(start, blanks);
    }

    public static void bfs (Coordinate start, int blanks) throws IOException{
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(start);

        outer:
        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (result[nx][ny] != -1) {
                    continue;
                }
                result[nx][ny] = c.distance+1;
                queue.add(new Coordinate(nx, ny, c.distance+1));
                --blanks;
                if (blanks == 0) {
                    break outer;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=0; i<R; ++i) {
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<C; ++j) {
                sb.append(result[i][j]+" ");
            }
            bw.append(sb.toString());
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
