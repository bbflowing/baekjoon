package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15559 {
    /*
    public static int R, C, answer;
    public static char map [][];
    public static int group [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        group = new int [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        int counter = 0;
        answer = 0;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (group[i][j] == 0) {
                    ++counter;
                    group[i][j] = counter;
                    solve(i, j, counter);
                }
            }
        }
        System.out.println(answer);

    }

    public static void solve (int x, int y, int counter) {
        int nx = x; int ny = y;
        if (map[x][y] == 'S') {
            ++nx;
        } else if (map[x][y] == 'N') {
            --nx;
        } else if (map[x][y] == 'E') {
            ++ny;
        } else if (map[x][y] == 'W') {
            --ny;
        }
        if (group[nx][ny] == counter) {
            ++answer;
            return;
        }
        if (group[nx][ny] != counter && group[nx][ny] != 0) {
            return;
        }
        group[nx][ny] = counter;
        solve(nx, ny, counter);
    }
     */
}
