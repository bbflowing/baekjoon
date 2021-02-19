package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q6118 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        for (int i=0; i<=N; ++i) {
            input.add(new ArrayList<>());
        }
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            input.get(start).add(end);
            input.get(end).add(start);
        }

        bfs(1, N, input);

    }
    public static void bfs(int start, int N, ArrayList<ArrayList<Integer>> input) {
        int visited [] = new int [N+1];
        Arrays.fill(visited, -1);
        visited[start] = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(start, 0));
        int max = -1;

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            for (int i=0; i<input.get(current.value).size(); ++i) {
                int target = input.get(current.value).get(i);
                if (visited[target] == -1) {
                    queue.add(new Pair(input.get(current.value).get(i), current.distance+1));
                    visited[target] = current.distance+1;
                    if (max < current.distance+1) {
                        max = current.distance+1;
                    }
                }
            }
        }
        int count = 0;
        int location = 0;
        boolean flag = false;
        for (int i=1; i<=N; ++i) {
            //System.out.println(i+","+visited[i]);
            if (visited[i] == max) {
                ++count;
                if (!flag) {
                    location = i;
                    flag = true;
                }
            }
        }
        System.out.println(location+" "+max+" "+count);
    }
}
class Pair {
    int value;
    int distance;

    Pair (int value, int distance) {
        this.value = value;
        this.distance = distance;
    }
}
