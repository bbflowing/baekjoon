package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1743 {
    /*
    public static int R, C, size;
    public static int map [][];
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int [R+1][C+1];
        visited = new boolean [R+1][C+1];
        for (int i=0; i<K; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=1; i<=R; ++i) {
            for (int j=1; j<=C; ++j) {
                if (!visited[i][j] && map[i][j] == 1) {
                    visited[i][j] = true;
                    size = 1;
                    solve(i, j);
                    result.add(size);
                }
            }
        }
        result.sort(Collections.reverseOrder());
        System.out.println(result.get(0));
    }

    public static void solve (int x, int y) {
        for (int dir=0; dir<4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<1 || R<nx || ny<1 || C<ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (map[nx][ny] == 0) {
                continue;
            }
            visited[nx][ny] = true;
            ++size;
            solve(nx, ny);
        }
    }
     */
}
