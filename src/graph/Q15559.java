package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15559 {
    /*
    public static int N, M, answer;
    public static char map [][];
    public static int groups [][];
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        answer = 0;
        groups = new int [N][M];
        visited = new boolean [N][M];
        int counter = 0;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (!visited[i][j]) {
                    ++counter;
                    groups[i][j] = counter;
                    visited[i][j] = true;
                    dfs(i, j, counter);
                }
            }
        }
        System.out.println(answer);
    }

    public static void dfs (int x, int y, int counter) {
        int nx = x;
        int ny = y;
        if (map[x][y] == 'S') {
            ++nx;
        } else if (map[x][y] == 'N') {
            --nx;
        } else if (map[x][y] == 'E') {
            ++ny;
        } else {
            --ny;
        }

        if (!visited[nx][ny]) {
            visited[nx][ny] = true;
            groups[nx][ny] = counter;
            dfs(nx, ny, counter);
        } else {
            if (groups[nx][ny] == counter) {
                ++answer;
            }
            return;
        }
    }
     */
}
