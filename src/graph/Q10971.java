package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10971 {
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
        }
        bfs(N, list);
    }

    public static void bfs (int N, ArrayList<ArrayList<Integer>> list) {
        Queue<Pair> queue = new LinkedList<>();
        boolean visited [] = new boolean [N+1];
        visited[1] = true;
        queue.add(new Pair(1, 0));

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (p.status == N) {
                System.out.println(p.distance);
                return;
            }
            for (int i=0; i<list.get(p.status).size(); ++i) {
                int target = list.get(p.status).get(i);
                if (!visited[target]) {
                    visited[target] = true;
                    queue.add(new Pair(target, p.distance+1));
                }
            }
        }
        System.out.println(-1);
    }

     */
}

/*
class Pair {
    int status;
    int distance;

    Pair (int status, int distance) {
        this.status = status;
        this.distance = distance;
    }
}

 */
