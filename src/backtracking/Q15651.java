package backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class Q15651 {
    public static BufferedWriter bw;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result [] = new int [M];
        solve(N, M, 0, result);
        bw.flush();
    }

    public static void solve (int N, int M, int depth, int result []) throws IOException {
        if (depth == M) {
            String answer = "";
            for (int i=0; i<M; ++i) {
                answer += result[i] + " ";
            }
            bw.append(answer);
            bw.newLine();
            return;
        }

        for (int i=1; i<=N; ++i) {
            result [depth] = i;
            solve(N, M, depth+1, result);
        }
    }
}
