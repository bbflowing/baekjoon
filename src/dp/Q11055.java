package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11055 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input [] = new int [N];
        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        int sum [] = new int [N];
        sum[0] = input[0];
        for (int i=1; i<N; ++i) {
            sum[i] = input[i];
            for (int j=0; j<i; ++j) {
                if (input[j] < input[i] && sum[i] <= sum[j]+input[i]) {
                    sum[i] = sum[j] + input[i];
                }
            }
        }
        int max = sum[0];
        for (int i=1; i<N; ++i) {
            if (max < sum[i]) {
                max = sum[i];
            }
        }
        System.out.println(max);
    }
     */
}
