package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16390 {
    /*
    public static char dish [][];
    public static boolean visited [][];
    public static int dx [] = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int dy [] = {-1, 0, +1, -1, +1, -1, 0, 1};
    public static int N, M;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dish = new char [N][M];
        visited = new boolean [N][M];
        int answer = 0;
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                dish[i][j] = line.charAt(j);
            }
        }

        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (!visited[i][j] && dish[i][j] == '#') {
                    visited[i][j] = true;
                    dfs(i, j);
                    //System.out.println(i+","+j);
                    ++answer;
                }
            }
        }
        System.out.println(answer);
    }

    public static void dfs (int x, int y) {
        for (int i=0; i<8; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || N<=nx || ny<0 || M<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (dish[nx][ny] == '.') {
                continue;
            }
            visited[nx][ny] = true;
            dfs(nx, ny);
        }
    }
     */
}
