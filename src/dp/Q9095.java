package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9095 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int N = 0;
        for (int i=0; i<T; ++i) {
            int output [] = new int [11];
            output[0] = 1;
            output[1] = 2;
            output[2] = 4;
            N = Integer.parseInt(br.readLine());
            for (int j=3; j<N; ++j) {
                output[j] = output[j-1]+output[j-2]+output[j-3];
            }
            System.out.println(output[N-1]);
        }
    }
}
