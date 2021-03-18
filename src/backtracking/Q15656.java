package backtracking;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15656 {
    /*
    public static BufferedWriter bw;
    public static int input [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        int result [] = new int [M];
        solve(N, M, 0, result);
        bw.flush();
    }

    public static void solve (int N, int M, int index, int [] result) throws IOException {
        if (index == M) {
            String answer = "";
            for (int i=0; i<M; ++i) {
                answer += result[i] + " ";
            }
            bw.append(answer);
            bw.newLine();
            return;
        }

        for (int i=0; i<N; ++i) {
            result[index] = input[i];
            solve(N, M, index+1, result);
        }
    }
     */
}
