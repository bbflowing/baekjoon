package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2606 {
    public static ArrayList<ArrayList<Integer>> network;
    public static boolean visited [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        network = new ArrayList<>();
        for (int i=0; i<=N; ++i) {
            network.add(new ArrayList<>());
        }
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            network.get(start).add(end);
            network.get(end).add(start);
        }
        visited = new boolean [N+1];
        visited[1] = true;
        solve(1);
        int virus = 0;
        for (int i=2; i<=N; ++i) {
            if (visited[i]) {
                ++virus;
            }
        }
        System.out.println(virus);
    }

    public static void solve (int start) {
        ArrayList<Integer> target = network.get(start);
        for (int i=0; i<target.size(); ++i) {
            if (!visited[target.get(i)]) {
                visited[target.get(i)] = true;
                solve(target.get(i));
            }
        }
    }
}
