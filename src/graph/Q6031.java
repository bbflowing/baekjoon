package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6031 {
    public static char map [][];
    public static boolean visited [][];
    public static int size;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        visited = new boolean [R][C];
        int answer = -1;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (map[i][j] == '.' && !visited[i][j]) {
                    visited[i][j] = true;
                    size = 1;
                    dfs(i, j, R, C);
                    if (size > answer) {
                        answer = size;
                    }
                }
            }
        }
        System.out.println(answer);
    }
    public static void dfs (int x, int y, int R, int C) {
        int dx [] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dy [] = {-1, 0, +1, -1, +1, -1, 0, 1};

        for (int i=0; i<8; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (map[nx][ny] == '*') {
                continue;
            }
            visited[nx][ny] = true;
            ++size;
            dfs(nx, ny, R, C);
        }
    }
}
