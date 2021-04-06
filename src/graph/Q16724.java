package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16724 {
    /*
    public static int N, M, answer;
    public static char map [][];
    public static boolean visited [][];
    public static int group [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char [N][M];
        visited = new boolean [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        answer = 0;
        int counter = 0;
        group = new int [N][M];
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (!visited[i][j]) {
                    ++counter;
                    visited[i][j] = true;
                    group[i][j] = counter;
                    solve(i, j, counter);
                }
            }
        }
        System.out.println(answer);
    }

    public static void solve(int x, int y, int counter) {
        int nx = x; int ny = y;
        if (map[x][y] == 'D') {
            ++nx;
        } else if (map[x][y] == 'U') {
            --nx;
        } else if (map[x][y] == 'R') {
            ++ny;
        } else if (map[x][y] == 'L') {
            --ny;
        }
        if (visited[nx][ny]) {
            if (group[nx][ny] == counter) {
                ++answer;
                return;
            } else if (group[nx][ny] != counter) {
                return;
            }
        }

        group[nx][ny] = counter;
        visited[nx][ny] = true;
        solve(nx, ny, counter);
    }
     */
}
