package graph;

// 경로 찾기

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11403 {
    /*
    public static int N;
    public static ArrayList<ArrayList<Integer>> edges;
    public static int[][] result;

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        edges = new ArrayList<>();
        result = new int[N][N];
        for (int i=0; i<N; ++i) edges.add(new ArrayList<>());
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                if (Integer.parseInt(st.nextToken()) == 1) edges.get(r).add(c);
            }
        }
        for (int i=0; i<N; ++i) solve(i);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int r=0; r<N; ++r) {
            for (int c=0; c<N; ++c) bw.append(result[r][c]+" ");
            bw.newLine();
        }
        bw.flush();
    }

    public static void solve(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            ArrayList<Integer> temp = edges.get(cur);
            for (int i=0; i<temp.size(); ++i) {
                int next = temp.get(i);
                if (result[start][next] == 0) {
                    result[start][next] = 1;
                    queue.add(next);
                }
            }
        }
    }
     */
}

