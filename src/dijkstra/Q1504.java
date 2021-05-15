package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1504 {
    /*
    public static int N;
    public static ArrayList<ArrayList<Pair>> list;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        list = new ArrayList<>(N+1);
        for (int i=0; i<N+1; ++i) list.add(new ArrayList<>());
        int E = Integer.parseInt(st.nextToken());
        for (int i=0; i<E; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.get(start).add(new Pair(dst, cost));
            list.get(dst).add(new Pair(start, cost));
        }
        st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int answer1 = 0; int answer2 = 0;
        int temp = 0;
        for (int i=0; i<3; ++i) {
            temp = 0;
            if (i==0) temp = solve(1, first);
            else if (i==1) temp = solve(first, second);
            else temp = solve(second, N);
            if (temp == -1) {
                answer1 = -1;
                break;
            }
            answer1 += temp;
        }
        for (int i=0; i<3; ++i) {
            temp = 0;
            if (i==0) temp = solve(1, second);
            else if (i==1) temp = solve(second, first);
            else temp = solve(first, N);
            if (temp == -1) {
                answer2 = -1;
                break;
            }
            answer2 += temp;
        }
        int answer = 0;
        if (answer1 == -1 && answer2 == -1) answer = -1;
        else if (answer1 == -1 && answer2 != -1) answer = answer2;
        else if (answer1 != -1 && answer2 == -1) answer = answer1;
        else answer = Math.min(answer1, answer2);
        System.out.println(answer);
    }

    public static int solve (int start, int end) {
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        int[] distance = new int[N+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;
        for (int i=0; i<list.get(start).size(); ++i) {
            Pair target = list.get(start).get(i);
            distance[target.dst] = target.cost;
            queue.add(target);
        }

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            for (int i=0; i<list.get(p.dst).size(); ++i) {
                Pair next = list.get(p.dst).get(i);
                if (p.cost + next.cost < distance[next.dst]) {
                    distance[next.dst] = p.cost + next.cost;
                    queue.add(new Pair(next.dst, distance[next.dst]));
                }
            }
        }
        if (distance[end] == Integer.MAX_VALUE) distance[end] = -1;
        return distance[end];
    }
     */
}

/*
class Pair implements Comparable<Pair> {
    int dst, cost;

    Pair (int dst, int cost) {
        this.dst = dst;
        this.cost = cost;
    }

    @Override
    public int compareTo(Pair p) {
        return this.cost - p.cost;
    }
}
 */
