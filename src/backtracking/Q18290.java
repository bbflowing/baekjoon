package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q18290 {
    /*
    public static int N, M, K, max;
    public static int map [][];
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int [N][M];
        visited = new boolean [N][M];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        max = -40001;
        solve(0, 0, 0, 0);
        System.out.println(max);
    }

    public static void solve (int x, int y, int sum, int selected) {
        if (selected == K) {
            if (max < sum) {
                max = sum;
            }
            return;
        }
        if (y == M) {
            solve(x+1, 0, sum, selected);
            return;
        }
        if (x == N) {
            return;
        }

        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        if (!visited[x][y]) {
            solve(x, y+1, sum, selected);
            visited[x][y] = true;
            int nselected = selected+1;
            int nsum = sum + map[x][y];
            ArrayList<Coordinate> check = new ArrayList<>();
            for (int i=0; i<4; ++i) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    continue;
                }
                if (!visited[nx][ny]) {
                    check.add(new Coordinate(nx,ny));
                    visited[nx][ny] = true;
                }
            }
            solve(x, y+1, nsum, nselected);
            visited[x][y] = false;
            if (check.size() != 0) {
                for (int i = 0; i < check.size(); ++i) {
                    Coordinate next = check.get(i);
                    visited[next.x][next.y] = false;
                }
            }
        } else {
            solve(x, y+1, sum, selected);
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */
