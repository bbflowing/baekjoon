package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18422 {
    /*
    public static char map [][];
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new char [N][M];
        visited = new boolean [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        int counter = 0;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (!visited[i][j] && map[i][j] == '*') {
                    visited[i][j] = true;
                    ++counter;
                    dfs(i, j, N, M);
                }
            }
        }
        System.out.println(counter);
    }

    public static void dfs (int x, int y, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || N<=nx || ny<0 || M<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (map[nx][ny] == '.') {
                continue;
            }
            visited[nx][ny] = true;
            dfs(nx, ny, N, M);
        }
    }
     */
}
