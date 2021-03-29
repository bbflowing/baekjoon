package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q1463 {
    /*
    public static int min;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        min = 987_654_321;
        solve(X, 0);
        System.out.println(min);
    }

    public static void solve (int X, int count) {
        if (X == 1) {
            if (min > count) {
                min = count;
            }
            return;
        }
        if (count >= min) {
            return;
        }
        if (X % 3 == 0) {
            int next = X/3;
            solve(next, count+1);
        }
        if (X % 2 == 0) {
            int next = X/2;
            solve(next, count+1);
        }
        solve(X-1, count+1);
    }
     */
}
