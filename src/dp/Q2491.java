package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2491 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input [] = new int [N];
        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        int big [] = new int [N];
        int small [] = new int [N];
        big[0] = 1;
        small[0] = 1;
        for (int i=1; i<N; ++i) {
            big[i] = 1;
            small[i] = 1;
            for (int j=0; j<i; ++j) {
                if (input[j] <= input[i] && big[j]+1 > big[i]) {
                    big[i] = big[j]+1;
                }
                if (input[j] >= input[i] && small[j]+1 > small[i]) {
                    small[i] = small[j]+1;
                }
            }
        }
        int max = big[0];
        int min = small[0];
        for (int i=1; i<N; ++i) {
            if (max < big[i]) {
                max = big[i];
            }
            if (min < small[i]) {
                min = small[i];
            }
        }
        int answer = Math.max(max, min);
        if (answer >= 3) {
            System.out.println(answer);
        } else {
            System.out.println(2);
        }
    }
}
