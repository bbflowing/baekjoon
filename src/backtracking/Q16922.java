package backtracking;

import java.io.*;
import java.util.HashMap;

public class Q16922 {
    /*
    public static int input [] = {1, 5, 10, 50};
    public static HashMap<Integer, Boolean> visited;
    public static int answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        visited = new HashMap<>();
        answer = 0;
        solve(N, 0, 0, 0);
        System.out.println(answer);
    }

    public static void solve (int N, int count, int sum, int index) {
        if (count == N) {
            if (!visited.containsKey(sum)) {
                visited.put(sum, true);
                ++answer;
            }
            return;
        }

        for (int i=index; i<4; ++i) {
            solve(N, count + 1, sum+input[i], i);
        }
    }
     */
}
