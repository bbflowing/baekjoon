package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2579 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int stairs [] = new int [N+1];
        for (int i=1; i<=N; ++i) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
        int answer [] = new int [N+1];
        answer[1] = stairs[1];
        if (N >= 2) {
            answer[2] = stairs[1] + stairs[2];
        }

        for (int i=3; i<=N; ++i) {
            answer[i] = Math.max(answer[i-2], answer[i-3]+stairs[i-1]) + stairs[i];
        }
        System.out.println(answer[N]);
    }
}
