package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14500 {
    public static int input [][];
    public static boolean check [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static int N;
    public static int M;
    public static int answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        check = new boolean[N][M];
        int total = -1;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                answer = -1;
                check[i][j] = true;
                dfs(i, j, input[i][j], 1);
                check[i][j] = false;
                check(i, j);
                if (answer > total) {
                    total = answer;
                }
            }
        }
        System.out.println(total);
    }

    public static void dfs (int x, int y, int sum, int counter) {
        if (counter == 4) {
            if (sum > answer) {
                answer = sum;
            }
            return;
        }
        for (int i=0; i<4; ++i) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX < 0 || N <= newX || newY < 0 || M <= newY) {
                continue;
            }
            if (check[newX][newY]) {
                continue;
            }
            check[newX][newY] = true;
            dfs(newX, newY, sum+input[newX][newY], counter + 1);
            check[newX][newY] = false;
        }
    }

    public static void check (int x, int y) {
        int sum = input[x][y];
        int sum1 = sum; int sum2 = sum; int sum3 = sum; int sum4 = sum;
        if (0 <= x-1 && 0 <= y-1 && y+1 < M) { // ㅜ
            sum1 += input[x-1][y-1] + input[x-1][y] + input[x-1][y+1];
        }
        if (0 <= x-1 && x+1 < N && 0 <= y-1) { // ㅏ
            sum2 += input[x-1][y-1] + input[x][y-1] + input[x+1][y-1];
        }
        if (x+1 < N && 0 <= y-1 && y+1 < M) { // ㅗ
            sum3 += input[x+1][y-1] + input[x+1][y] + input[x+1][y+1];
        }
        if (0 <= x-1 && x+1 < N && y+1 < M) { // ㅓ
            sum4 += input[x-1][y+1] + input[x][y+1] + input[x+1][y+1];
        }
        int temp1 = Math.max(sum1, sum2);
        int temp2 = Math.max(sum3, sum4);
        int temp3 = Math.max(temp1, temp2);
        if (temp3 > answer) {
            answer = temp3;
        }
    }
}
