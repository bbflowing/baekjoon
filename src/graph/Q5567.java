package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5567 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> friends = new ArrayList<>();
        for (int i=0; i<=N; ++i) {
            friends.add(new ArrayList<>());
        }
        StringTokenizer st;
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            friends.get(start).add(end);
            friends.get(end).add(start);
        }

        bfs(1, N, friends);
    }
    public static void bfs(int start, int N, ArrayList<ArrayList<Integer>> friends) {
        boolean check [] = new boolean [N+1];
        check[1] = true;
        Queue<Integer> queue = new LinkedList();
        queue.add(1);
        int answer = 0;
        int counter = 0; // friend: 1, friend's friend: 2

        while (!queue.isEmpty()) {
            int size = queue.size();
            ++counter;
            for (int i=0; i<size; ++i) {
                int current = queue.poll();
                for (int j=0; j<friends.get(current).size(); ++j) {
                    int next = friends.get(current).get(j);
                    if (!check[next]) {
                        check[next] = true;
                        queue.add(next);
                        ++answer;
                    }

                }
            }
            if (counter == 2) {
                break;
            }
        }
        System.out.println(answer);
    }
}