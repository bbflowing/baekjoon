package dp;

import java.io.*;
import java.util.ArrayList;

public class Q15990 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dp [][] = new int [100_000+1][4];
        dp[1][1] = 1;
        dp[1][2] = 0;
        dp[1][3] = 0;

        dp[2][1] = 0;
        dp[2][2] = 1;
        dp[2][3] = 0;

        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i=4; i<=100_000; ++i) {
            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1_000_000_009;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1_000_000_009;
            dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1_000_000_009;
        }

        int T = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int t=0; t<T; ++t) {
            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            sum += dp[N][1] % 1_000_000_009;
            sum += dp[N][2] % 1_000_000_009;
            sum += dp[N][3] % 1_000_000_009;
            bw.append(String.valueOf(sum));
            if (t != T-1) {
                bw.newLine();
            }
        }
        bw.flush();
    }
     */
}
