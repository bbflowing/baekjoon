package theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Combination {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int input [] = new int [N];

        for (int i=1; i<=N; ++i) {
            input[i-1] = i;
        }

        int result [] = new int [M];
        combination(input, N, M, 0, 0, result);
    }

    public static void combination (int [] input, int N, int R, int start, int index, int [] result) {
        if (index == R) {

            System.out.println(Arrays.toString(result));
            return;
        }

        if (start == N) {
            return;
        }

        result[index] = input[start];
        combination(input, N, R, start+1, index+1, result);
        combination(input, N, R, start+1, index, result);
    }
}
