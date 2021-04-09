package combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q2407 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.ONE;
        for (int i=0; i<M; ++i) {
            numerator = numerator.multiply(new BigInteger(String.valueOf(N-i)));
            denominator = denominator.multiply(new BigInteger(String.valueOf(i+1)));
        }
        String answer = String.valueOf(numerator.divide(denominator));
        System.out.println(answer);
    }
     */
}
