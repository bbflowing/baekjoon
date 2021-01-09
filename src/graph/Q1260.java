package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1260 {
    public static ArrayList<ArrayList<Integer>> edges;
    public static int N;
    public static String answer;
    public static boolean [] check;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        edges = new ArrayList<>();
        N = Integer.parseInt(st.nextToken()); // number of vertices
        int M = Integer.parseInt(st.nextToken()); // number of edges
        int V = Integer.parseInt(st.nextToken()); // starting vertex

        for (int i=0; i<=N; ++i) {
            edges.add(new ArrayList<>());
        }

        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            edges.get(first).add(second);
            edges.get(second).add(first);
        }

        for (int i=0; i<=N; ++i) {
            Collections.sort(edges.get(i));
        }
        answer = "";
        check = new boolean [N+1];
        dfs(V);
        System.out.println(answer);

        bfs(V);

    }

    public static void dfs(int start) {
        check[start]= true;
        answer += start + " ";
        for (int i=0; i<edges.get(start).size(); ++i) {
            int visited = edges.get(start).get(i);
            if (!check [visited]) {
                dfs(visited);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean put [] = new boolean [N+1];
        queue.add(start);
        put [start] = true;
        String answer = "";
        while (!queue.isEmpty()) {
            int visited = queue.poll();
            answer += visited + " ";
            for (int i=0; i<edges.get(visited).size(); ++i) {
                if (!put[edges.get(visited).get(i)]) {
                    queue.add(edges.get(visited).get(i));
                    put[edges.get(visited).get(i)] = true;
                }
            }

        }
        System.out.println(answer);
    }
}
