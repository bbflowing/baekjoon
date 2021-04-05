package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16390 {
    /*
    public static int R, C;
    public static char pixels [][];
    public static boolean visited [][];
    public static int dx [] = {-1, -1, -1, +0, +0, +1, +1, +1};
    public static int dy [] = {-1, +0, +1, -1, +1, -1, +0, +1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        pixels = new char [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                pixels[i][j] = line.charAt(j);
            }
        }
        visited = new boolean [R][C];
        int counter = 0;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (pixels[i][j] == '#' && !visited[i][j]) {
                    ++counter;
                    solve(i, j);
                }
            }
        }
        System.out.println(counter);
    }

    public static void solve (int x, int y) {
        for (int i=0; i<8; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (pixels[nx][ny] == '.') {
                continue;
            }
            visited[nx][ny] = true;
            solve(nx,ny);
        }
    }
     */
}
