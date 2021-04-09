package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q9376 {
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            input = new char [N+2][M+2];
            for (int j=0; j<N+2; ++j) {
                Arrays.fill(input[j], '.');
            }
            for (int j=1; j<=N; ++j) {
                String line = br.readLine();
                for (int k=1; k<=M; ++k) {
                    input[j][k] = line.charAt(k-1);
                }
            }
            for (int j=0; j<N+2; ++j) {
                System.out.println(Arrays.toString(input[j]));
            }
            System.out.println();
        }
    }
}
