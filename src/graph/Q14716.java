package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14716 {
    public static int input [][];
    public static int dx [] = {-1, 1, 0, 0, -1, -1, 1, 1};
    public static int dy [] = {0, 0, -1, 1, -1, 1, -1, 1};
    public static boolean check [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        check = new boolean [N][M];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int counter = 1;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (input[i][j] == 1 && !check[i][j]) {
                    dfs(i, j, N, M);
                    ++counter;
                }
            }
        }
        System.out.println(counter-1);
    }

    public static void dfs (int x, int y, int N, int M) {
        check[x][y] = true;
        for (int i=0; i<8; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || N <= nx || ny < 0 || M <= ny) {
                continue;
            }
            if (check[nx][ny]) {
                continue;
            }
            if (input[nx][ny] == 0) {
                continue;
            }
            dfs(nx, ny, N, M);
        }
    }
}
