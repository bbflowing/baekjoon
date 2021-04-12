package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Q2667 {
    /*
    public static int N, size;
    public static char map [][];
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char [N][N];
        visited = new boolean [N][N];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (!visited[i][j] && map[i][j] == '1') {
                    size = 1;
                    visited[i][j] = true;
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
        for (int dir=0; dir<4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || N<=nx || ny<0 || N<=ny) {
                continue;
            }

            if (visited[nx][ny]) {
                continue;
            }

            if (map[nx][ny] == '0') {
                continue;
            }
            visited[nx][ny] = true;
            ++size;
            dfs(nx, ny);
        }
    }
     */
}

