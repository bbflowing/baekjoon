package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2606 {
    /*
    public static int computers;
    public static ArrayList<ArrayList<Integer>> network;
    public static boolean[] visited;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computers = Integer.parseInt(br.readLine());
        network = new ArrayList<>(computers+1);
        for (int i=0; i<=computers; ++i) {
            network.add(new ArrayList<>());
        }
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            network.get(start).add(end);
            network.get(end).add(start);
        }
        visited = new boolean[computers+1];
        visited[1] = true;
        solve(1);
        int answer = 0;
        for (int i=2; i<computers+1; ++i) {
            if (visited[i]) {
                ++answer;
            }
        }
        System.out.println(answer);
    }

    public static void solve (int computer) {
        ArrayList<Integer> target = network.get(computer);
        for (int i=0; i<target.size(); ++i) {
            int dst = target.get(i);
            if (!visited[dst]) {
                visited[dst] = true;
                solve(dst);
            }
        }
    }
     */
}