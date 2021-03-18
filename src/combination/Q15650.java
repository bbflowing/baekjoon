package combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15650 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result [] = new int [M];
        int input [] = new int [N];
        for (int i=0; i<N; ++i) {
            input[i] = i+1;
        }
        combination(input, N, M,0, 0, result);

    }

    public static void combination (int [] input, int N, int R, int index, int start, int [] result) {
        if (index == R) {
            String answer = "";
            for (int i=0; i<R; ++i) {
                answer += result[i] + " ";
            }
            System.out.println(answer);
            return;
        }

        if (start == N) {
            return;
        }

        result[index] = input[start];
        combination(input, N, R, index+1, start+1, result);
        combination(input, N, R, index, start+1, result);
    }
}
