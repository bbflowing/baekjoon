package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2749 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        int pisano = 1500000;
        long answers[] = new long[pisano];
        answers[0] = 0;
        answers[1] = 1;
        for (int i = 2; i <= N && i < pisano; ++i) {
            answers[i] = (answers[i - 2] + answers[i - 1]) % 1_000_000;
        }

        if (pisano <= N) {
            N %= pisano;
        }
        System.out.println(answers[(int)N]);
    }

}
