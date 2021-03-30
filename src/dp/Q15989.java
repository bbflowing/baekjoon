package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q15989 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int dp [][] = new int [10001][4];
        dp[1][1] = 1; // sum:1, ends with 1, increasing order
        dp[1][2] = 0;
        dp[1][3] = 0;

        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[2][3] = 0;

        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i=4; i<=10000; ++i) {
            dp[i][1] = dp[i-1][1];
            dp[i][2] = dp[i-2][1] + dp[i-2][2];
            dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3];
        }
        String answer = "";
        for (int t=0; t<T; ++t) {
            int N = Integer.parseInt(br.readLine());
            int temp = dp[N][1] + dp[N][2] + dp[N][3];
            if (t != T-1) {
                answer += temp + "\n";
            } else {
                answer += temp;
            }
        }
        System.out.println(answer);
    }
     */
}
