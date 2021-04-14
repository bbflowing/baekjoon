package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2468 {
    /*
    public static int N;
    public static int area [][];
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        area = new int [N][N];
        int min = 101;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                area[i][j] = Integer.parseInt(st.nextToken());
                if (area[i][j] < min) {
                    min = area[i][j];
                }
            }
        }
        int points = N*N;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                area[i][j] -= min;
                if (area[i][j] == 0) {
                    --points;
                }
            }
        }
        solve(points);
    }

    public static void solve (int points) {
        int answer = 1;
        while (true) {
            visited = new boolean[N][N];
            int count = 0;
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    if (!visited[i][j] && area[i][j] != 0) {
                        ++count;
                        dfs(i, j);
                    }
                }
            }
            if (answer < count) {
                answer = count;
            }

            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    if (area[i][j] != 0) {
                        area[i][j] -= 1;
                        if (area[i][j] == 0) {
                            --points;
                        }
                    }
                }
            }
            if (points == 0) {
                break;
            }
        }
        System.out.println(answer);
    }

    public static void dfs (int x, int y) {
        for (int dir=0; dir<4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || N<=nx || ny<0 || N<=ny) {
                continue;
            }
            if (area[nx][ny] == 0) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            visited[nx][ny] = true;
            dfs(nx, ny);
        }
    }
     */
}
