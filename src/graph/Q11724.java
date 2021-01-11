package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11724 {
    public static ArrayList<ArrayList<Integer>> input;
    public static boolean check [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new ArrayList<>();
        for (int i=0; i<=N; ++i) {
            input.add(new ArrayList<>());
        }
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            input.get(start).add(end);
            input.get(end).add(start);
        }
        int counter = 0;
        check = new boolean [N+1];
        for (int i=1; i<=N; ++i) {
            if (!check[i]) {
                dfs(i, N);
                ++counter;
            }
        }
        System.out.println(counter);
    }
    public static void dfs(int start, int N) {
        check[start] = true;
        for (int i=0; i<input.get(start).size(); ++i) {
            int next = input.get(start).get(i);
            if (!check[next]) {
                dfs(next, N);
            }
        }
    }
}
