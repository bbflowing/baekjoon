package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q18352 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> road = new ArrayList<>(N+1);
        for (int i=0; i<=N; ++i) {
            road.add(new ArrayList<>());
        }
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            road.get(start).add(end);
        }
        bfs(N, K, X, road);
    }
    public static void bfs(int N, int K, int X, ArrayList<ArrayList<Integer>> road) {
        Queue<Integer> queue = new LinkedList<>();
        boolean check [] = new boolean [N+1];
        queue.add(X);
        check[X] = true;
        int counter = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        boolean flag = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            ++counter;

            for (int i=0; i<size; ++i) {
                int current = queue.poll();
                check[current] = true;
                for (int j=0; j<road.get(current).size(); ++j) {
                    int target = road.get(current).get(j);
                    if (!check[target]) {
                        queue.add(target);
                        check[target] = true;
                        if (counter == K) {
                            answer.add(target);
                            flag = true;
                        }
                    }
                }
            }

            if (flag) {
                break;
            }
        }

        if (flag) {
            if (answer.size() == 0) {
                System.out.println(-1);
            } else {
                Collections.sort(answer);
                for (int i=0; i<answer.size(); ++i) {
                    System.out.println(answer.get(i));
                }
            }
        } else {
            System.out.println(-1);
        }
    }
}
