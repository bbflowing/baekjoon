package dp;

import java.io.*;
import java.util.Arrays;

public class Q1003 {
    public static int dp [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        dp = new int [41][2];
        for (int i=0; i<41; ++i) {
            Arrays.fill(dp[i], -1);
        }
        dp [0][0] = 1;
        dp [0][1] = 0;
        dp [1][0] = 0;
        dp [1][1] = 1;

        for (int t=0; t<T; ++t) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            bw.append(dp[N][0]+" "+dp[N][1]);
            bw.newLine();
        }
        bw.flush();
    }

    public static int[] fibonacci (int N) {
        if (dp[N][0] == -1 || dp[N][1] == -1) {
            dp[N][0] = fibonacci(N-1)[0] + fibonacci(N-2)[0];
            dp[N][1] = fibonacci(N-1)[1] + fibonacci(N-2)[1];
        }
        return dp[N];
    }
}
