package combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15649 {
    public static boolean visited [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean [N];
        int result [] = new int [M];
        backtracking(N, M, visited,0, result);
    }

    public static void backtracking (int N, int M, boolean [] visited, int index, int [] result) {
        if (index == M) {
            String answer = "";
            for (int i=0; i<result.length; ++i) {
                answer += result[i] +" ";
            }
            System.out.println(answer);
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = i+1;
                backtracking(N, M, visited, index+1, result);
                visited[i] = false;
            }
        }
    }
}

