package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1189 {
    /*
    public static int R, C, K, answer;
    public static char map [][];
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        visited = new boolean [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        answer = 0;
        K = Integer.parseInt(st.nextToken());
        visited[R-1][0] = true;
        solve(R-1, 0, 1);
        System.out.println(answer);
    }

    public static void solve (int x, int y, int distance) {
        if (x==0 && y==C-1) {
            if (distance == K) {
                ++answer;
            }
            return;
        }

        for (int dir=0; dir<4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (map[nx][ny] == 'T') {
                continue;
            }
            visited[nx][ny] = true;
            solve(nx, ny, distance+1);
            visited[nx][ny] = false;
        }
    }
     */
}

