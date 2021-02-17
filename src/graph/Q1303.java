package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1303 {
    public static char [][] input;
    public static boolean [][] visited;
    public static int counter;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [M][N];
        visited = new boolean [M][N];

        for (int i=0; i<M; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                input[i][j] = line.charAt(j);
            }
        }

        int white = 0;
        int blue = 0;

        for (int i=0; i<M; ++i) {
            for (int j=0; j<N; ++j) {
                if (!visited[i][j]) {
                    counter = 1;
                    visited[i][j] = true;
                    dfs(i, j, M, N);
                    if (input[i][j] == 'B') {
                        blue += Math.pow(counter, 2);
                    } else {
                        white += Math.pow(counter, 2);
                    }
                }
            }
        }
        System.out.println(white);
        System.out.println(blue);
    }

    public static void dfs (int x, int y, int M, int N) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || M<=nx || ny<0 || N<=ny) {
                continue;
            }

            if (visited[nx][ny]) {
                continue;
            }
            if (input[nx][ny] != input[x][y]) {
                continue;
            }
            visited[nx][ny] = true;
            ++counter;
            dfs(nx, ny, M, N);
        }
    }
}
