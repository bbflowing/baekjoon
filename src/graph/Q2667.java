package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2667 {
    public static char input [][];
    public static boolean visited [][];
    public static int number = 0;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new char [N][N];
        visited = new boolean [N][N];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        int counter = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (input[i][j] == '1' && !visited[i][j]) {
                    visited[i][j] = true;
                    number = 1;
                    ++counter;
                    dfs(i, j, N, counter);
                    numbers.add(number);
                }
            }
        }
        String answer = counter+"\n";
        Collections.sort(numbers);
        for (int i=0; i<counter; ++i) {
            answer += numbers.get(i)+"\n";
        }
        System.out.println(answer);
    }

    public static void dfs (int x, int y, int N, int counter) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || N<=nx || ny<0 || N<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (input[nx][ny] == '0') {
                continue;
            }

            visited[nx][ny] = true;
            ++number;
            dfs(nx, ny, N, counter);

        }
    }
}
