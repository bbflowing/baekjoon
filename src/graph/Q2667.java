package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2667 {
    public static char input [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static int counter;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> answers = new ArrayList<>();
        input = new char[N][N];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (input[i][j] == '1') {
                    counter = 1;
                    input[i][j] = 0;
                    dfs(i, j, N);
                    answers.add(counter);
                }
            }
        }
        Collections.sort(answers);
        System.out.println(answers.size());
        for (int i:answers) {
            System.out.println(i);
        }
    }

    public static void dfs(int x, int y, int N) {
        for (int i=0; i<4; ++i) {
            if (0 <= x + dx[i] && x + dx[i] < N &&
                0 <= y + dy[i] && y + dy[i] < N) {
                if (input[x + dx[i]][y + dy[i]] == '1') {
                    int newX = x + dx[i];
                    int newY = y + dy[i];
                    input[newX][newY] = 0;
                    counter++;
                    dfs(newX, newY, N);
                }
            }
        }
    }
}
