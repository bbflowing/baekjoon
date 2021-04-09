package graph;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1012 {
    /*
    public static int land [][];
    public static int M, N;
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int t=0; t<T; ++t) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            land = new int [M][N];
            for (int i=0; i<K; ++i) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                land[x][y] = 1;
            }
            visited = new boolean [M][N];
            int counter = 0;
            for (int i=0; i<M; ++i) {
                for (int j=0; j<N; ++j) {
                    if (!visited[i][j] && land[i][j] == 1) {
                        visited[i][j] = true;
                        ++counter;
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
        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < M && 0 <= ny && ny < N) {
                if (!visited[nx][ny] && land[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
    }
     */
}
