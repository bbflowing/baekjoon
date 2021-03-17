package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1987 {
    /*
    public static char map [][];
    public static boolean check [];
    public static int max, R, C;
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        check = new boolean [26];
        check[map[0][0]-'A'] = true;
        max = -1;
        dfs(0, 0, 1);
        System.out.println(max);
    }

    public static void dfs (int x, int y, int distance) {
        if (max < distance) {
            max = distance;
        }

        if (max == 26) {
            return;
        }

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (check[map[nx][ny]-'A']) {
                continue;
            }
            check[map[nx][ny]-'A'] = true;
            dfs(nx, ny, distance+1);
            check[map[nx][ny]-'A'] = false;
        }
    }
     */
}