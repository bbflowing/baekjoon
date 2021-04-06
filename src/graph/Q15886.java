package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15886 {
    /*
    public static int N, answer;
    public static char map [];
    public static int cycles [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        map = new char [N];
        cycles = new int [N];
        for (int i=0; i<N; ++i) {
            map[i] = line.charAt(i);
        }
        int counter = 0;
        answer = 0;
        for (int i=0; i<N; ++i) {
            if (cycles[i] == 0) {
                ++counter;
                cycles[i] = counter;
                solve(i, counter);
            }
        }
        System.out.println(answer);

    }
    public static void solve (int y, int counter) {
        int ny = y;
        if (map[y] == 'E') {
            ++ny;
        } else if (map[y] == 'W') {
            --ny;
        }
        if (cycles[ny] == counter) {
            ++answer;
            return;
        } else if (cycles[ny] != counter && cycles[ny] != 0) {
            return;
        }
        cycles[ny] = counter;
        solve(ny, counter);
    }
     */
}

