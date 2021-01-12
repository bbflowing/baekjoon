package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2156 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp [] = new int [N];
        ArrayList<Integer> input = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            input.add(Integer.parseInt(br.readLine()));
        }

        if (N == 1) {
            System.out.println(input.get(0));
        } else if (N == 2) {
            System.out.println(input.get(0)+input.get(1));
        } else {
            dp[0] = input.get(0);
            dp[1] = input.get(0) + input.get(1);
            dp[2] = Math.max(dp[1], Math.max(input.get(2) + input.get(0), input.get(2) + input.get(1)));
            for (int i=3; i<N; ++i) {
                dp[i] = Math.max(input.get(i) + input.get(i-1) + dp[i-3], input.get(i) + dp[i-2]);
                dp[i] = Math.max(dp[i-1], dp[i]);

            }
            System.out.println(dp[N-1]);
        }
    }
}
