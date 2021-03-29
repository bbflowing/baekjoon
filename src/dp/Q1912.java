package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1912 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input [] = new int [N];
        int dp [] = new int [N];
        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = input[0];
        int max = dp[0];
        for (int i=1; i<N; ++i) {
            if (dp[i-1]+input[i] > input[i]) {
                dp[i] = dp[i-1]+input[i];
            } else {
                dp[i] = input[i];
            }
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        System.out.println(max);
    }
     */
}
