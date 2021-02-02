package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1926 {
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static int input [][];
    public static boolean check [][];
    public static int N;
    public static int M;
    public static int answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        check = new boolean [N][M];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int counter = 0;
        int max = -1;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (input[i][j] == 1 && !check[i][j]) {
                    answer = 1;
                    check[i][j] = true;
                    dfs(i, j);
                    ++counter;
                    if (answer > max) {
                        max = answer;
                    }
                }
            }
        }
        if (counter == 0) {
            max = 0;
        }
        System.out.println(counter);
        System.out.println(max);
    }
    public static void dfs (int x, int y) {
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
                check[newX][newY] = true;
                ++answer;
                dfs (newX, newY);
            }
        }
    }
}
