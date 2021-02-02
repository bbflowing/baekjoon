package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1743 {
    public static int input [][];
    public static boolean check [][];
    public static int answer;
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        check = new boolean [N][M];
        for (int i=0; i<K; ++i) {
            st = new StringTokenizer(br.readLine());
            input [Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] = 1;
        }
        int max = -1;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (input[i][j] == 1 && !check[i][j]) {
                    answer = 1;
                    check[i][j] = true;
                    dfs(i, j, N, M);
                    if (max < answer) {
                        max = answer;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void dfs (int x, int y, int N, int M) {
        for (int i=0; i<4; ++i) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX < 0 || N <= newX || newY < 0 || M <= newY) {
                continue;
            }
            if (check[newX][newY]) {
                continue;
            }
            if (input[newX][newY] == 1) {
                ++answer;
                check[newX][newY] = true;
                dfs(newX, newY, N, M);
            }
        }
    }
}
