package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5975 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(N+1);
        for (int i=0; i<=N; ++i) {
            list.add(new ArrayList<>());
        }
        for (int i=1; i<=N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=N; ++j) {
                int target = Integer.parseInt(st.nextToken());
                if (target == 1) {
                    list.get(i).add(j);
                }
            }
        }
        bfs(N, M, list);
    }
    public static void bfs (int N, int M, ArrayList<ArrayList<Integer>> list) {
        boolean visited [] = new boolean [N+1];
        visited[M] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(M);
        String answer = "";

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i<size; ++i) {
                int node = queue.poll();
                answer += node+" ";
                ArrayList<Integer> target = list.get(node);
                for (int j=0; j<target.size(); ++j) {
                    if (!visited[target.get(j)]) {
                        visited[target.get(j)] = true;
                        queue.add(target.get(j));
                    }
                }
            }
            if (queue.size() != 0) {
                answer += "\n";
            }
        }
        System.out.println(answer);
    }
}
