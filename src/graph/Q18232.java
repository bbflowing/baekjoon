package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q18232 {

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(N+1);
        for (int i=0; i<=N; ++i) {
            list.add(new ArrayList<>());
        }
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x).add(y);
            list.get(y).add(x);
        }
        bfs(S, E, N, list);

    }

    public static void bfs (int S, int E, int N, ArrayList<ArrayList<Integer>> list) {
        boolean visited [] = new boolean [N+1];
        visited[S] = true;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(S, 0));

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (p.point == E) {
                System.out.println(p.distance);
                return;
            }
            //System.out.println(p.point+","+p.distance);
            ArrayList<Integer> target = list.get(p.point);
            if (target.size() != 0) {
                for (int i=0; i<target.size(); ++i) {
                    int dst = target.get(i);
                    if (!visited[dst]) {
                        queue.add(new Pair(dst, p.distance+1));
                        visited[dst] = true;
                    }
                }
            }
            if (1 <= p.point-1 && !visited[p.point-1]) {
                queue.add(new Pair(p.point-1, p.distance+1));
                visited[p.point-1] = true;
            }
            if (p.point+1 <= N && !visited[p.point+1]) {
                queue.add(new Pair(p.point+1, p.distance+1));
                visited[p.point+1] = true;
            }
        }
    }
}

class Pair {
    int point;
    int distance;

    Pair (int point, int distance) {
        this.point = point;
        this.distance = distance;
    }
}

