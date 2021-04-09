package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1260 {
    public static boolean check [];
    public static String route;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i=0; i<=N; ++i) {
            list.add(new ArrayList<>());
        }
        check = new boolean [N+1];
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.get(start).add(end);
            list.get(end).add(start);
        }
        for (int i=0; i<=N; ++i) {
            Collections.sort(list.get(i));
        }
        route = "";
        dfs(list, V, N);
        System.out.println(route);
        bfs(list, V, N);

    }

    public static void bfs(ArrayList<ArrayList<Integer> >list, int start, int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        boolean check [] = new boolean [N+1];
        check[start] = true;
        String answer = "";
        while (!queue.isEmpty()) {
            int current = queue.poll();
            answer += current + " ";
            for (int i=0; i<list.get(current).size(); ++i) {
                if (!check[list.get(current).get(i)]) {
                    queue.add(list.get(current).get(i));
                    check[list.get(current).get(i)] = true;
                }
            }
        }
        System.out.println(answer);
    }

    public static void dfs(ArrayList<ArrayList<Integer>> list, int start, int N) {
        check[start] = true;
        route += start + " ";
        for (int i=0; i<list.get(start).size(); ++i) {
            if (!check[list.get(start).get(i)]) {
                //route += list.get(start).get(i) + " ";
                dfs(list, list.get(start).get(i), N);
            }
        }
    }
}
