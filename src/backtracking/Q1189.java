package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1189 {
    /*
    public static char map [][];
    public static int R, C, K, answer;
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        visited = new boolean [R][C];
        visited[R-1][0] = true;
        answer = 0;
        solve(R-1, 0, 1);
        System.out.println(answer);
    }

    public static void solve (int x, int y, int times) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        if (x == 0 && y == C-1 && times == K) {
            ++answer;
            return;
        }
        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

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
            solve(nx, ny, times+1);
            visited[nx][ny] = false;
        }
    }
     */
}