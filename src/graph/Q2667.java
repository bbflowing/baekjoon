package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2667 {
    /*
    public static int N, size;
    public static char map [][];
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char [N][N];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        visited = new boolean [N][N];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (map[i][j] == '1' && !visited[i][j]) {
                    visited[i][j] = true;
                    size = 1;
                    dfs(i, j);
                    result.add(size);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int i:result) {
            System.out.println(i);
        }
    }

    public static void dfs (int x, int y) {
        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < N && 0 <= ny && ny < N) {
                if (!visited[nx][ny] && map[nx][ny] == '1') {
                    visited[nx][ny] = true;
                    ++size;
                    dfs(nx, ny);
                }
            }
        }
    }
     */
}
