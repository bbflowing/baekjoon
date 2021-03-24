package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6148 {
    /*
    public static boolean visited [];
    public static int heights [];
    public static int answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        heights = new int [N];
        for (int i=0; i<N; ++i) {
            heights[i] = Integer.parseInt(br.readLine());
        }
        visited = new boolean [N];
        answer = 987_654_321;
        solve(0, 0, N, H);
        System.out.println(answer);
    }

    public static void solve (int index, int sum, int N, int H) {
        if (sum >= H) {
            if (answer > (sum-H)) {
                answer = sum-H;
            }
            return;
        }

        if (index == N) {
            return;
        }

        solve(index+1, sum, N, H);
        solve(index+1, sum+heights[index], N, H);
    }
     */
}
