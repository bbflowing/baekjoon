package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q14225 {
    /*
    public static int input [];
    public static int N;
    public static boolean visited [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        input = new int [N];
        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        int largest = 0;
        for (int i=0; i<N; ++i) {
            largest += input[i];
        }
        visited = new boolean [largest+1];
        solve(0, 0);
        for (int i=1; i<largest+1; ++i) {
            if (!visited[i]) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(largest+1);

    }

    public static void solve (int index, int sum) {
        if (index == N) {
            if (!visited[sum]) {
                visited[sum] = true;
            }
            return;
        }
        solve(index+1, sum+input[index]);
        solve(index+1, sum);
    }
     */
}
