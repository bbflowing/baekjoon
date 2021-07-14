package graph;

// 바이러스

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2606 {
    /*
    public static ArrayList<ArrayList<Integer>> connection;
    public static int computers;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        computers = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine());
        connection = new ArrayList<>();
        for (int i=0; i<=computers; ++i) connection.add(new ArrayList<>());
        for (int i=0; i<edges; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            connection.get(start).add(end);
            connection.get(end).add(start);
        }
        bfs();
    }

    public static void bfs() {
        boolean[] check = new boolean[computers+1];
        check[1] = true;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        int answer = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            ArrayList<Integer> list = connection.get(cur);
            for (int i=0; i<list.size(); ++i) {
                if (check[list.get(i)]) continue;
                check[list.get(i)] = true;
                queue.add(list.get(i));
                ++answer;
            }
        }
        System.out.println(answer);
    }
     */
}
