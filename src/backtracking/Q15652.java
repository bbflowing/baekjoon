package backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class Q15652 {
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

    public static void solve (int N, int M, int index, int [] result) throws IOException {
        if (index == M) {
            String answer = "";
            for (int i=0; i<M; ++i) {
                answer += result[i]+" ";
            }
            bw.append(answer);
            bw.newLine();
            return;
        }

        for (int i=1; i<=N; ++i) {
            if (1 <= index) {
                if (result[index - 1] <= i) {
                    result[index] = i;
                    solve(N, M, index+1, result);
                }
            } else if (index == 0) {
                result[index] = i;
                solve(N, M, index+1, result);
            }

        }
    }
}
