package MST;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 전력난

public class Q6497 {
    /*
    public static int N;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) break;
            st = new StringTokenizer(line);
            N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int total = 0;
            PriorityQueue<Pair> queue = new PriorityQueue<>();
            for (int i = 0; i < M; ++i) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());
                total += cost;
                queue.add(new Pair(start, end, cost));
            }
            parents = new int[N + 1];
            for (int i = 1; i < N + 1; ++i) parents[i] = i;
            int cost = getMST(queue);
            if (cost != -1) {
                bw.append(String.valueOf(total-cost));
                bw.newLine();
            }
        }
        bw.flush();
    }

    public static int getMST(PriorityQueue<Pair> queue) {
        int answer = 0;
        int count = N;

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (union(p.start, p.end)) {
                --count;
                answer += p.cost;
                if (count == 1) return answer;
            }
        }
        return -1;
    }

    public static boolean union(int start, int end) {
        int parent1 = find(start);
        int parent2 = find(end);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;
    }

    public static int find(int node) {
        if (parents[node] == node) return node;
        else return parents[node] = find(parents[node]);
    }
     */
}

/*
class Pair implements Comparable<Pair> {
    int start, end, cost;

    Pair (int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(Pair p) {
        return this.cost - p.cost;
    }
}
 */
