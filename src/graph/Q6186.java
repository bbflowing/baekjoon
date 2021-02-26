package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6186 {
    public static char input [][];
    public static boolean visited [][];
    public static int map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];
        visited = new boolean [N][M];
        map = new int [N][M];

        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        int counter = 0;

        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (input[i][j] == '#' && !visited[i][j]) {
                    ++counter;
                    map[i][j] = counter;
                    visited[i][j] = true;
                    dfs(i, j, N, M, counter);
                }
            }
        }
        System.out.println(counter);
    }

    public static void dfs (int x, int y, int N, int M, int counter) {
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
            if (input[nx][ny] == '.') {
                continue;
            }
            visited[nx][ny] = true;
            map[nx][ny] = counter;
            dfs(nx, ny, N, M, counter);
        }
    }
}
