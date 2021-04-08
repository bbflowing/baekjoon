package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14248 {
    /*
    public static int N;
    public static int bridge [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        bridge = new int [N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; ++i) {
            bridge[i] = Integer.parseInt(st.nextToken());
        }
        int start = Integer.parseInt(br.readLine());
        bfs(start);
    }

    public static void bfs (int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean visited [] = new boolean [N+1];
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int stone = queue.poll();
            int left = stone - bridge[stone];
            int right = stone + bridge[stone];

            if (left >= 1) {
                if (!visited[left]) {
                    visited[left] = true;
                    queue.add(left);
                }
            }

            if (right <= N) {
                if (!visited[right]) {
                    visited[right] = true;
                    queue.add(right);
                }
            }
        }

        int answer = 0;
        for (int i=1; i<=N; ++i) {
            if (visited[i]) {
                ++answer;
            }
        }
        System.out.println(answer);
    }
     */
}
