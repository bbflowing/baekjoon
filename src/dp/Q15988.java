package dp;

import java.io.*;

public class Q15988 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int t=0; t<T; ++t) {
            int N = Integer.parseInt(br.readLine());
            long answer [] = new long [N+3];
            answer[1] = 1;
            answer[2] = 2;
            answer[3] = 4;
            for (int i=4; i<=N; ++i) {
                answer[i] = (answer[i-3]+answer[i-2]+answer[i-1]) % 1_000_000_009;
            }
            bw.append(String.valueOf(answer[N]));
            bw.newLine();
        }
        bw.flush();
    }
     */
}
