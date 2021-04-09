package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1516 {
    public static int answer [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        answer = new int [N+1];
        for (int i=0; i<=N; ++i) {
            list.add(new ArrayList<>());
        }
        for (int i=1; i<=N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken());
            list.get(i).add(cost);
            while (true) {
                int prior = Integer.parseInt(st.nextToken());
                if (prior == -1) {
                    break;
                } else {
                    list.get(i).add(prior);
                }
            }
        }
        for (int i=1; i<=N; ++i) {
            boolean check [] = new boolean [N+1];
            check[i] = true;
            dfs(i, N, list, check);
        }

    }
    public static void dfs (int i, int N, ArrayList<ArrayList<Integer>> list, boolean [] check) {
        answer[i] += list.get(i).get(0);
        for (int a=1; a<list.get(i).size(); ++a) {

        }

    }
}
