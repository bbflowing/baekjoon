package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3187 {
    /*
    public static int R, C;
    public static char [][] fence;
    public static int [][] area;
    public static boolean [][] visited;
    public static int [] dx = {-1, 1, 0, 0};
    public static int [] dy = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        fence = new char [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                fence[i][j] = line.charAt(j);
            }
        }
        visited = new boolean [R][C];
        area = new int [R][C];
        int counter = 0;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (!visited[i][j] && fence[i][j] != '#') {
                    ++counter;
                    visited[i][j] = true;
                    area[i][j] = counter;
                    dfs(i, j, counter);
                }
            }
        }
        int result [][] = new int [counter][2];
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (fence[i][j] == 'v') { //wolf
                    ++result[area[i][j]-1][0];
                } else if (fence[i][j] == 'k') { //sheep
                    ++result[area[i][j]-1][1];
                }
            }
        }
        int sheep = 0;
        int wolf = 0;

        for (int i=0; i<counter; ++i) {;
            if (result[i][1] - result[i][0] > 0) { // more sheep
                sheep += result[i][1];
            } else { // same or more wolf
                wolf += result[i][0];
            }
        }
        System.out.println(sheep+" "+wolf);
    }

    public static void dfs (int x, int y, int counter) {
        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (fence[nx][ny] == '#') {
                continue;
            }
            visited[nx][ny] = true;
            area[nx][ny] = counter;
            dfs(nx, ny, counter);
        }
    }
     */
}
