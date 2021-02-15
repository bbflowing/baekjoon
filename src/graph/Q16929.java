package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16929 {
    public static char input [][];
    public static boolean visited [][];
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
        visited = new boolean [N][M];
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
               if (!visited[i][j]) {
                   visited[i][j] = true;
                   dfs(i, j, -1, -1, N, M, 1);
               }
            }
        }
        System.out.println("No");
    }

    public static boolean dfs (int x, int y, int bx, int by, int N, int M, int counter) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || N<=nx || ny<0 || M<=ny) {
                continue;
            }

            if (bx == nx && by == ny) {
                continue;
            }

            if (visited[nx][ny] && input[nx][ny] == input[x][y]) {
                System.out.println("Yes");
                System.exit(0);
            }

            if (input[nx][ny] != input[x][y]) {
                continue;
            }

            if (visited[nx][ny]) {
                continue;
            }
            visited[nx][ny] = true;
            ++counter;
            dfs(nx, ny, x, y, N, M, counter);
        }
        return false;
    }
}
