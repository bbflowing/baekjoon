package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1926 {
    /*
    public static int R, C, size;
    public static int paper [][];
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        paper = new int [R][C];
        visited = new boolean [R][C];
        for (int i=0; i<R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<C; ++j) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (!visited[i][j] && paper[i][j] == 1) {
                    size = 1;
                    ++counter;
                    visited[i][j] = true;
                    solve(i, j);
                    result.add(size);
                }
            }
        }
        result.sort(Collections.reverseOrder());
        System.out.println(counter);
        if (counter == 0) {
            System.out.println(0);
        } else {
            System.out.println(result.get(0));
        }

    }

    public static void solve (int x, int y) {
        for (int dir=0; dir<4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (paper[nx][ny] == 0) {
                continue;
            }
            visited[nx][ny] = true;
            ++size;
            solve(nx, ny);
        }
    }
     */
}
