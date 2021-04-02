package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13398 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int input [] = new int [N];
        int result [][] = new int [2][N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        int max = input[0];
        result[0][0] = input[0];
        result[1][0] = input[0];
        for (int i=1; i<N; ++i) {
            result[0][i] = Math.max(result[0][i-1] + input[i], input[i]);
            result[1][i] = Math.max(result[0][i-1], result[1][i-1] + input[i]);
            max = Math.max(max, Math.max(result[0][i], result[1][i]));
        }
        System.out.println(max);
    }
     */
}
