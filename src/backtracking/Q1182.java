package backtracking;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1182 {
    /*
    public static BufferedWriter bw;
    public static int input [];
    public static HashMap<String, Boolean> map;
    public static boolean visited [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new HashMap<>();
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        visited = new boolean [N];
        int result [] = new int [M];
        solve(N, M, 0, result);
        bw.flush();
    }

    public static void solve (int N, int M, int index, int [] result) throws IOException {
        if (M == index) {
            String answer = "";
            for (int i=0; i<M; ++i) {
                answer += result[i] + " ";
            }
            if (map.containsKey(answer)) {
                return;
            } else {
                map.put(answer, true);
                bw.append(answer);
                bw.newLine();
            }
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                result[index] = input[i];
                visited[i] = true;
                solve(N, M, index + 1, result);
                visited[i] = false;
            }
        }
    }
     */
}
