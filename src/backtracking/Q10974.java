package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10974 {
    /*
    public static boolean visited [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        visited = new boolean [N];
        int result [] = new int [N];
        permutation(N, 0, result);
    }

    public static void permutation (int N, int index, int [] result) {
        if (index == N) {
            String answer = "";
            for (int i=0; i<N; ++i) {
                answer += result[i] + " ";
            }
            System.out.println(answer);
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = i+1;
                permutation(N, index+1, result);
                visited[i] = false;
            }
        }
    }
     */
}
