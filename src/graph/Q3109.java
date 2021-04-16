package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3109 {
    /*
    public static int R, C, answer;
    public static int gas[][];
    public static int dx[] = {-1, 0, +1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        gas = new int [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                char value = line.charAt(j);
                if (value == '.') {
                    gas[i][j] = 0;
                } else {
                    gas[i][j] = 1;
                }
            }
        }
        answer = 0;
        for (int i=0; i<R; ++i) {
            solve(i, 0);
        }
        System.out.println(answer);
    }

    public static boolean solve (int x, int y) {
        for (int dir = 0; dir < 3; ++dir) {
            int nx = x + dx[dir];
            int ny = y + 1;

            if (nx < 0 || R <= nx || ny < 0 || C <= ny) {
                continue;
            }
            if (gas[nx][ny] == 0) {
                if (ny == C - 1) {
                    gas[nx][ny] = 2;
                    ++answer;
                    return true;
                }
                gas[nx][ny] = 2;
                if (solve(nx, ny)) {
                    return true;
                }
            }
        }
        return false;
    }

     */
}
