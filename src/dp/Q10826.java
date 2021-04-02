package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q10826 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N==0) {
            System.out.println(0);
        } else if (N==1) {
            System.out.println(1);
        } else {
            BigInteger list [] = new BigInteger[N+1];
            list[0] = BigInteger.ZERO;
            list[1] = BigInteger.ONE;
            for (int i=2; i<=N; ++i) {
                list[i] = list[i-2].add(list[i-1]);
            }
            System.out.println(list[N]);
        }
    }
     */
}
