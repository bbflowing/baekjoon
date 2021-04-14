package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14716 {
    /*
    public static int R, C;
    public static int banner [][];
    public static int dx [] = {-1, -1, -1, 0, 0, +1, +1, +1};
    public static int dy [] = {-1, 0, +1, -1, +1, -1, 0, +1};
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        banner = new int [R][C];
        visited = new boolean [R][C];
        for (int i=0; i<R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<C; ++j) {
                banner[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int count = 0;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (!visited[i][j] && banner[i][j] == 1) {
                    visited[i][j] = true;
                    ++count;
                    solve(i, j);
                }
            }
        }
        System.out.println(count);
    }

    public static void solve(int x, int y) {
        for (int dir=0; dir<8; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (banner[nx][ny] == 0) {
                continue;
            }

            visited[nx][ny] = true;
            solve(nx, ny);
        }
    }
     */
}
