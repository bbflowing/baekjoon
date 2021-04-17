package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15559 {
    /*
    public static int R, C, answer;
    public static char directions[][];
    public static int groups[][];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        directions = new char[R][C];
        groups = new int[R][C];
        for (int i = 0; i < R; ++i) {
            String line = br.readLine();
            for (int j = 0; j < C; ++j) {
                directions[i][j] = line.charAt(j);
            }
        }
        int counter = 0;
        for (int i = 0; i < R; ++i) {
            for (int j = 0; j < C; ++j) {
                if (groups[i][j] == 0) {
                    ++counter;
                    solve(i, j, counter);
                }
            }
        }
        System.out.println(answer);

    }

    public static void solve(int x, int y, int counter) {
        int nx = x; int ny = y;
        if (directions[x][y] == 'N') {
            --nx;
        } else if (directions[x][y] == 'S') {
            ++nx;
        } else if (directions[x][y] == 'E') {
            ++ny;
        } else {
            --ny;
        }

        if (nx < 0 || R <= nx || ny < 0 || C <= ny) {
            return;
        }
        if (groups[nx][ny] == counter) {
            ++answer;
        } else if (groups[nx][ny] == 0) {
            groups[nx][ny] = counter;
            solve(nx, ny, counter);
        }
    }
     */
}

