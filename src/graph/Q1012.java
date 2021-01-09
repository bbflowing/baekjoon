package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1012 {
    public static int input [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};// west east south north
    public static int N;
    public static int M;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int k=0; k<T; ++k) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            input = new int [N][M];
            int counter = 0;
            for (int a[]:input) {
                Arrays.fill(a, 0);
            }

            for (int i=0; i<K; ++i) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                input[x][y] = 1;
            }
            for (int i=0; i<N; ++i) {
                for (int j=0; j<M; ++j) {
                    if (input[i][j] == 1) {
                        dfs(i, j);
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
    }

    public static void dfs(int x, int y) {
        for (int i=0; i<4; ++i) {
            if (0 <= x + dx[i] && x + dx[i] < N && 0 <= y + dy[i] && y + dy[i] < M) {
                if (input[x + dx[i]][y + dy[i]] == 1) {
                    int newX = x + dx[i];
                    int newY = y + dy[i];
                    input[newX][newY] = 0;
                    dfs(newX, newY);
                }
            }
        }
    }
}
