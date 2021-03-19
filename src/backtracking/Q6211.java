package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6211 {
    /*
    public static int C, max;
    public static int input [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        max = -1;
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        input = new int [B];
        for (int i=0; i<B; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        solve(0, 0, B);
        System.out.println(max);
    }

    public static void solve (int sum, int index, int N) {
        if (sum > C) {
            return;
        }
        if (index == N) {
            if (max < sum) {
                max = sum;
            }
            return;
        }
        solve(sum, index+1, N);
        solve(sum+input[index], index+1, N);
    }
     */
}
