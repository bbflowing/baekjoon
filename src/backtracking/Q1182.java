package backtracking;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1182 {
    /*
    public static int answer;
    public static int input [];
    public static int N, S;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        input = new int [N];
        st = new StringTokenizer(br.readLine());
        answer = 0;

        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        solve(0,0);
        Arrays.sort(input);
        if (S == 0) {
            --answer;
        }
        System.out.println(answer);
    }

    public static void solve (int index, int sum) {
        if (N == index) {
            if (S == sum) {
                ++answer;
            }
            return;
        }
        solve(index+1, sum);
        solve(index+1, sum+input[index]);
    }
    */
}

