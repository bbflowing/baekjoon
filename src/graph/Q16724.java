package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16724 {
    /*
    public static int R, C, answer;
    public static char map[][];
    public static boolean visited[][];
    public static int group[][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        group = new int[R][C];
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
        if (map[x][y] == 'D') {
            ++nx;
        } else if (map[x][y] == 'U') {
            --nx;
        } else if (map[x][y] == 'L') {
            --ny;
        } else {
            ++ny;
        }

        if (group[nx][ny] == counter) {
            ++answer;
            return;
        } else if (group[nx][ny] != 0) {
            return;
        } else if (group[nx][ny] == 0) {
            group[nx][ny] = counter;
            solve(nx, ny, counter);
        }
    }
     */
}
