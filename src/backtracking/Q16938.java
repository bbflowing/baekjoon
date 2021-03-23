package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q16938 {
    /*
    public static int N, L, R, X, answer;
    public static int [] problems;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        problems = new int [N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; ++i) {
            problems[i] = Integer.parseInt(st.nextToken());
        }
        answer = 0;
        for (int i=2; i<=N; ++i) {
            int result [] = new int [i];
            combination(i, result, 0, 0);
        }

        System.out.println(answer);
    }

    public static void combination (int select, int [] result, int index, int start) {
        if (index == select) {
            int min = 1_000_000_000;
            int max = 0;
            int sum = 0;

            for (int i=0; i<select; ++i) {
                sum += result[i];
                if (result[i] < min) {
                    min = result[i];
                }
                if (max < result[i]) {
                    max = result[i];
                }
            }

            if (max - min >= X && L <= sum && sum <= R) {
                ++answer;
            }
            return;
        }

        if (start == N) {
            return;
        }
        result [index] = problems[start];
        combination(select, result, index+1, start+1);
        combination(select, result, index, start+1);
    }
     */
}
