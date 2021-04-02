package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2293 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int dp [] = new int [K+1];

        dp[0] = 1;
        for (int i=0; i<N; ++i) {
            int coin = Integer.parseInt(br.readLine());
            for (int j=1; j<=K; ++j) {
                if (coin <= j) {
                    dp[j] += dp[j-coin];
                }
            }
        }
        System.out.println(dp[K]);
    }
}
