package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2606 {
    public static ArrayList<ArrayList<Integer>> connection;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computers = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine());
        connection = new ArrayList<>(computers);
        for (int i=0; i<=computers; ++i) {
            connection.add(new ArrayList<>());
        }
        for (int i=0; i<edges; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            connection.get(start).add(end);
            connection.get(end).add(start);
        }
        bfs(1, computers);
    }

    public static void bfs(int start, int computers) {
        Queue<Integer> queue = new LinkedList<>();
        boolean check [] = new boolean[computers];
        queue.add(start);
        check[start-1] = true;
        int counter = 0;

        while (!queue.isEmpty()) {
            int visited = queue.poll();
            for (int i=0; i<connection.get(visited).size(); ++i) {
                int next = connection.get(visited).get(i);
                if (!check[next-1]) {
                    check[next-1] = true;
                    queue.add(next);
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
