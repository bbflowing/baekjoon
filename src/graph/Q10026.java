package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10026 {
    public static char weak [][];
    public static char nonWeak [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static boolean weakCheck [][];
    public static boolean nonWeakCheck [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        weakCheck = new boolean [N][N];
        nonWeakCheck = new boolean [N][N];
        weak = new char [N][N];
        nonWeak = new char [N][N];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                char target = line.charAt(j);
                nonWeak [i][j] = target;
                if (target == 'G') {
                    weak [i][j] = 'R';
                } else {
                    weak [i][j] = target;
                }
            }
        }
        int weak = 0;
        int nonWeak = 0;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (!weakCheck[i][j]) {
                    dfs(i, j, N, 1);
                    ++weak;
                    /*
                    for (boolean a[]:weakCheck) {
                        System.out.println(Arrays.toString(a));
                    }
                     */
                }
                if (!nonWeakCheck[i][j]) {
                    dfs(i, j, N, 2);
                    ++nonWeak;
                    /*
                    for (boolean a[]:nonWeakCheck) {
                        System.out.println(Arrays.toString(a));
                    }
                     */
                }
            }
        }
        System.out.println(nonWeak+" "+weak);
    }
    public static void dfs(int x, int y, int N, int label) {
        for (int i=0; i<4; ++i) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX < 0 || N <= newX || newY < 0 || N <= newY) continue;
            if (label == 1) {
                if (weak[newX][newY] == weak[x][y] && !weakCheck[newX][newY]) {
                    weakCheck[newX][newY] = true;
                    dfs(newX, newY, N, 1);
                }
            } else {
                if (nonWeak[newX][newY] == nonWeak[x][y] && !nonWeakCheck[newX][newY]) {
                    nonWeakCheck[newX][newY] = true;
                    dfs(newX, newY, N, 2);
                }
            }

        }
    }
}

