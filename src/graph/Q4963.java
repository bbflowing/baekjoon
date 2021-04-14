package graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4963 {
    /*
    public static int map [][];
    public static boolean visited [][];
    public static int R, C;
    public static int dx [] = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int dy [] = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) {
                break;
            }
            st = new StringTokenizer(line);
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            map = new int[R][C];
            visited = new boolean[R][C];
            for (int i = 0; i < R; ++i) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < C; ++j) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;
            for (int i = 0; i < R; ++i) {
                for (int j = 0; j < C; ++j) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        ++count;
                        visited[i][j] = true;
                        solve(i, j);
                    }
                }
            }
            bw.append(String.valueOf(count));
            bw.newLine();
        }
        bw.flush();
    }

    public static void solve (int x, int y) {
        for (int dir=0; dir<8; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (map[nx][ny] == 0) {
                continue;
            }
            visited[nx][ny] = true;
            solve(nx, ny);
        }
    }
     */
}