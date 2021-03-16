package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5938 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(N+1);
        for (int i=0; i<N+1; ++i) {
            list.add(new ArrayList<>());
        }
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.get(start).add(end);
            list.get(end).add(start);
        }
        bfs(list, N);
    }

    public static void bfs (ArrayList<ArrayList<Integer>> list, int N) {
        boolean visited [] = new boolean [N+1];
        visited[1] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        while (!queue.isEmpty()) {
            int next = queue.poll();

            ArrayList<Integer> target = list.get(next);
            for (int i=0; i<target.size(); ++i) {
                if (!visited[target.get(i)]) {
                    visited[target.get(i)] = true;
                    queue.add(target.get(i));
                }
            }
        }
        int counter = 0;
        for (int i=2; i<=N; ++i) {
            if (!visited[i]) {
                ++counter;
                System.out.println(i);
            }
        }
        if (counter == 0) {
            System.out.println(0);
        }
    }

     */
}
