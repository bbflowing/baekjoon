package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1926 {
    /*
    public static int N, M, size;
    public static int paper [][];
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        paper = new int [N][M];
        visited = new boolean [N][M];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int counter = 0;
        int answer = 0;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (paper[i][j] == 1 && !visited[i][j]) {
                    size = 1;
                    ++counter;
                    visited[i][j] = true;
                    dfs(i, j);
                    if (size > answer) {
                        answer = size;
                    }
                }
            }
        }
        System.out.println(counter);
        System.out.println(answer);
    }

    public static void dfs (int x, int y) {
        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || N<=nx || ny<0 || M<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (paper[nx][ny] == 1) {
                ++size;
                visited[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }
     */
}
