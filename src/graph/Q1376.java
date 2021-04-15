package graph;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1376 {
    public static boolean visited[];
    public static int sizes [];
    public static ArrayList<ArrayList<Integer>> list;
    public static BufferedWriter bw;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        list = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; ++i) {
            list.add(new ArrayList<>());
        }
        visited = new boolean [N+1];
        sizes = new int [N+1];
        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if (!list.get(start).contains(end)) {
                list.get(start).add(end);
                ++sizes[start];
            }
            if (!list.get(end).contains(start)) {
                list.get(end).add(start);
                ++sizes[end];
            }
        }
        for (int i = 1; i <= N; ++i) {
            Collections.sort(list.get(i));
        }
        solve(1);
        bw.flush();
    }

    public static void solve(int node) throws IOException {
        if (!visited[node]) {
            visited[node] = true;
            String value = node + " ";
            bw.append(value);
        } else {
            return;
        }

        if (list.get(node).size() == 0) {
            return;
        }

        ArrayList<Integer> target = list.get(node);
        int size = sizes[node];
        int index = 0;
        if (size % 2 == 0) {
            index = 0;
        } else {
            index = size / 2;
        }
        while (true) {
            if (index == target.size()-1) {
                break;
            }
            if (visited[target.get(index)]) {
                ++index;
                continue;
            }
            solve(target.get(index));
            ++index;
        }
    }
}

