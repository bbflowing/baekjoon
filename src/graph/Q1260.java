package graph;

// DFS와 BFS

import java.io.*;
import java.util.*;

public class Q1260 {
    /*
    public static int N;
    public static boolean[] check;
    public static String answer;
    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        for (int i=0; i<=N; ++i) list.add(new ArrayList<>());
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int begin = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.get(begin).add(end);
            list.get(end).add(begin);
        }
        for (int i=1; i<=N; ++i) Collections.sort(list.get(i));
        check = new boolean[N+1];
        answer = "";
        dfs(start);
        bw.append(answer);
        bw.newLine();
        answer = "";
        bfs(start);
        bw.append(answer);
        bw.flush();
    }

    public static void dfs(int start) {
        check[start] = true;
        answer += start+" ";
        for (int i=0; i<list.get(start).size(); ++i) {
            int next = list.get(start).get(i);
            if (!check[next]) dfs(next);
        }
    }

    public static void bfs(int start) {
        boolean[] check = new boolean[N+1];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        check[start] = true;
        answer += start + " ";
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int i=0; i<list.get(cur).size(); ++i) {
                int next = list.get(cur).get(i);
                if (!check[next]) {
                    queue.add(next);
                    check[next] = true;
                    answer += next + " ";
                }
            }
        }
    }
     */
}

