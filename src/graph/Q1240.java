package graph;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1240 {
    /*
    public static int N;
    public static ArrayList<ArrayList<Pair>> tree;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        tree = new ArrayList<>(N+1);
        for (int i=0; i<N+1; ++i) {
            tree.add(new ArrayList<>());
        }
        for (int i=0; i<N-1; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            tree.get(start).add(new Pair(end, value));
            tree.get(end).add(new Pair(start, value));
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            bw.append(String.valueOf(bfs(start, end)));
            bw.newLine();
        }
        bw.flush();
    }

    public static int bfs (int start, int end) {
        boolean[] visited = new boolean[N+1];
        visited[start] = true;
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(start, 0));

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (p.dst == end) {
                return p.value;
            }
            ArrayList<Pair> list = tree.get(p.dst);
            for (int i=0; i<list.size(); ++i) {
                Pair next = list.get(i);
                int target = next.dst;
                if (!visited[target]) {
                    queue.add(new Pair(target, p.value+next.value));
                    visited[target] = true;
                }
            }
        }
        return 0;
    }
     */
}

/*
class Pair {
    int dst;
    int value;

    Pair (int dst, int value) {
        this.dst = dst;
        this.value = value;
    }
}
 */
