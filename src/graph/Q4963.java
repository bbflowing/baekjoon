package graph;

import java.io.*;
import java.util.StringTokenizer;

public class Q4963 {
    /*
    public static int W, H;
    public static int map [][];
    public static boolean visited [][];
    public static int dx [] = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int dy [] = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(line);
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            map = new int [H][W];
            for (int i=0; i<H; ++i) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<W; ++j) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            visited = new boolean [H][W];
            int counter = 0;
            for (int i=0; i<H; ++i) {
                for (int j=0; j<W; ++j) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        ++counter;
                        visited[i][j] = true;
                        dfs(i, j);
                    }
                }
            }
            bw.append(String.valueOf(counter));
            bw.newLine();
        }
        bw.flush();
    }

    public static void dfs (int x, int y) {
        for (int i=0; i<8; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < H && 0 <= ny && ny < W) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
    }
     */
}
