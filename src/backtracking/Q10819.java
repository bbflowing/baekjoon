package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10819 {
    /*
    public static int input [];
    public static boolean visited [];
    public static int max;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        int result [] = new int [N];
        visited = new boolean [N];
        max = -1;
        permutation(N, 0, result);
        System.out.println(max);
    }

    public static void permutation (int N, int index, int [] result) {
        if (index == N) {
            int answer = 0;
            Arrays.toString(result);
            for (int i=0; i<N-1; ++i) {
                answer += Math.abs(result[i] - result[i+1]);
            }
            if (max < answer) {
                max = answer;
            }
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = input[i];
                permutation(N, index+1, result);
                visited[i] = false;
            }
        }
    }
     */
}
