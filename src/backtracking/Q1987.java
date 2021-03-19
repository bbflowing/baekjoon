package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1987 {
    public static char map [][];
    public static boolean visited [];
    public static int R, C;
    public static int answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        visited = new boolean [26];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        answer = -1;
        visited[map[0][0]-'A'] = true;
        solve(0, 0, 1);
        System.out.println(answer);
    }

    public static void solve (int x, int y, int times) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        if (answer < times) {
            answer = times;
        }

        if (answer == 26) {
            return;
        }

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (visited[map[nx][ny]-'A']) {
                continue;
            }

            visited[map[nx][ny]-'A'] = true;
            solve(nx, ny, times+1);
            visited[map[nx][ny]-'A'] = false;
        }
    }
}
