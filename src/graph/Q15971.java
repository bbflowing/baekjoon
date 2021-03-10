package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q15971 {
    /*
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Pair>> list = new ArrayList<>(N + 1);
        for (int i = 0; i < N + 1; ++i) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; ++i) {
            st = new StringTokenizer(br.readLine());
            int begin = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.get(begin).add(new Pair(dst, cost));
            list.get(dst).add(new Pair(begin, cost));
        }
        bfs(start, end, list);
    }

    public static void bfs(int start, int end, ArrayList<ArrayList<Pair>> list) {
        Queue<Node> queue = new LinkedList<>();
        boolean visited[] = new boolean[list.size()];
        ArrayList<Integer> route = new ArrayList<>();
        queue.add(new Node(start, route));
        visited[start] = true;
        int answer = 0;

        while (!queue.isEmpty()) {
            Node n = queue.poll();
            if (n.current == end) {
                int max = 0;
                for (int i = 0; i < n.route.size(); ++i) {
                    int target = n.route.get(i);
                    answer += target;
                    if (max < target) {
                        max = target;
                    }
                }
                System.out.println(answer - max);
                break;
            }

            for (int i = 0; i < list.get(n.current).size(); ++i) {
                int next = list.get(n.current).get(i).dst;
                if (!visited[next]) {
                    visited[next] = true;
                    ArrayList<Integer> nroute = (ArrayList<Integer>) n.route.clone();
                    nroute.add(list.get(n.current).get(i).cost);
                    queue.add(new Node(next, nroute));
                }
            }
        }
    }
     */
}

/*
class Node {
    int current;
    ArrayList<Integer> route;

    Node(int current, ArrayList<Integer> route) {
        this.current = current;
        this.route = route;
    }
}

class Pair {
    int dst;
    int cost;

    Pair(int dst, int cost) {
        this.dst = dst;
        this.cost = cost;
    }
}

 */
