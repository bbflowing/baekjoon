package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11053 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        int length[] = new int[N];
        length[0] = 1;
        for (int i = 0; i < N; ++i) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; ++i) {
            length[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (A[j] < A[i] && length[j] >= length[i]) {
                    length[i] = length[j] + 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < N; ++i) {
            if (max < length[i]) {
                max = length[i];
            }
        }
        System.out.println(max);
    }
     */
}
