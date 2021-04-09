package graph;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q15240 {
    /*
    public static int R, C, paint;
    public static int pixels [][];
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        pixels = new int [R][C];
        visited = new boolean [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                pixels[i][j] = line.charAt(j) - '0';
            }
        }
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        paint = Integer.parseInt(st.nextToken());
        int start = pixels[x][y];
        pixels[x][y] = paint;
        visited[x][y] = true;
        dfs(x, y, start);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0; i<R; ++i) {
            String line = "";
            for (int j=0; j<C; ++j) {
                line += pixels[i][j];
            }
            bw.append(line);
            bw.newLine();
        }
        bw.flush();
    }

    public static void dfs (int x, int y, int number) {
        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (pixels[nx][ny] != number) {
                continue;
            } else if (pixels[nx][ny] == number) {
                pixels[nx][ny] = paint;
            }
            visited[nx][ny] = true;
            dfs(nx, ny, number);
        }
    }
     */
}
