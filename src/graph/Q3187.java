package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3187 {
    public static char input [][];
    public static int temp [][];
    public static boolean check [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        temp = new int [N][M];
        for (int i=0; i<N; ++i) {
            Arrays.fill(temp[i], -1);
        }
        check = new boolean [N][M];
        int counter = 1;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (input[i][j] != '#' && !check[i][j]) {
                    dfs(i, j, N, M, counter);
                    ++counter;
                }
            }
        }
        /*
        for (int i=0; i<N; ++i) {
            System.out.println(Arrays.toString(temp[i]));
        }

         */
        int wolves [] = new int [counter];
        int sheep [] = new int [counter];
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (input[i][j] == 'v') { //wolf
                    ++wolves[temp[i][j]];
                } else if (input[i][j] == 'k') { //sheep
                    ++sheep[temp[i][j]];
                }
            }
        }
        //System.out.println(Arrays.toString(wolves));
        //System.out.println(Arrays.toString(sheep));

        int s = 0; int w = 0;

        for (int i=1; i<counter; ++i) {
            if (sheep[i] > wolves[i]) {
                s += sheep[i];
            } else {
                w += wolves[i];
            }
        }
        System.out.println(s+" "+w);
    }
    public static void dfs(int x, int y, int N, int M, int counter) {
        check[x][y] = true;
        temp[x][y] = counter;
        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || N <= nx || ny < 0 || M <= ny) {
                continue;
            }
            if (check[nx][ny]) {
                continue;
            }
            if (input[nx][ny] != '#') {
                temp [nx][ny] = counter;
                check[nx][ny] = true;
                dfs(nx, ny, N, M, counter);
            }
        }
    }
}
