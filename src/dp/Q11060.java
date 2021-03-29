package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11060 {
    /*
    public static int maze [];
    public static int dp [];
    public static int N;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        maze = new int [N];
        dp = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; ++i) {
            maze[i] = Integer.parseInt(st.nextToken());
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i=0; i<N; ++i) {
            if (dp[i] != Integer.MAX_VALUE) {
                int jump = maze[i];
                for (int j=1; j<=jump; ++j) {
                    if (i+j <= N-1) {
                        dp[i+j] = Math.min(dp[i]+1, dp[i+j]);
                    }
                }
            }
        }
        if (dp[N-1] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dp[N-1]);
        }
    }

     */
}
