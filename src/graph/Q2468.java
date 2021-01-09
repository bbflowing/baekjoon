package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2468 {
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static int N;
    public static int input [][];
    public static boolean check [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int min = 101;
        int max = -1;
        input = new int [N][N];
        for (int i=0; i<N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (min > input[i][j]) {
                    min = input[i][j];
                }
                if (input[i][j] > max) {
                    max = input[i][j];
                }
            }
        }

        int answer = 1;

        for (int i=min; i<=max; ++i) {
            check = new boolean[N][N];
            int counter = 0;
            for (int j = 0; j < N; ++j) {
                for (int k = 0; k < N; ++k) {
                    if (input[j][k] <= i) {
                        input[j][k] = 0;
                    }
                }
            }

            for (int j = 0; j < N; ++j) {
                for (int k = 0; k < N; ++k) {
                    if (input[j][k] != 0 && !check[j][k]) {
                        dfs(j, k);
                        counter++;
                    }
                }
            }
            if (counter >= answer) {
                answer = counter;
            }
        }
        System.out.println(answer);
    }

    public static void dfs(int x, int y) {
        check[x][y] = true;
        for (int i=0; i<4; ++i) {
            if (0 <= x + dx[i] && x + dx[i] < N && 0 <= y + dy[i] && y + dy[i] < N) {
                if (input[x + dx[i]][y + dy[i]] != 0 && !check[x + dx[i]][y + dy[i]]) {
                    int newX = x + dx[i];
                    int newY = y + dy[i];
                    dfs(newX, newY);
                }
            }
        }
    }
}
