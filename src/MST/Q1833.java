package MST;

import java.io.*;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 고속철도 설계하기

public class Q1833 {
    /*
    public static int N;
    public static int[] parents;
    public static ArrayList<Pair> answer = new ArrayList<>();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        int total = 0;
        int count = N;
        parents = new int[N + 1];
        int[][] input = new int[N][N];
        for (int r = 0; r < N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < N; ++c) input[r][c] = Integer.parseInt(st.nextToken());
        }
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        for (int i = 1; i < N + 1; ++i) parents[i] = i;
        for (int r = 0; r < N; ++r) {
            for (int c = r; c < N; ++c) {
                int cost = input[r][c];
                if (cost < 0) {
                    total += -cost;
                    union(r, c);
                } else {
                    queue.add(new Pair(r, c, cost));
                }
            }
        }
        answer = new ArrayList<>();
        int result = getMST(queue, total, count);

        bw.append(result + " " + answer.size());
        bw.newLine();
        for (int i = 0; i < answer.size(); ++i) {
            Pair p = answer.get(i);
            bw.append(p.start + " " + p.end);
            bw.newLine();
        }
        bw.flush();
    }

    public static int getMST(PriorityQueue<Pair> queue, int total, int count) {
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (union(p.start, p.end)) {
                total += p.cost;
                --count;
                answer.add(new Pair(p.start + 1, p.end + 1));
            }
        }
        return total;
    }

    public static boolean union(int city1, int city2) {
        int parent1 = find(city1);
        int parent2 = find(city2);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;
    }

    public static int find(int city) {
        if (parents[city] == city) return city;
        return parents[city] = find(parents[city]);
    }
     */
}

/*
class Pair implements Comparable<Pair> {
    int start, end, cost;

    Pair(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }

    Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Pair p) {
        return this.cost - p.cost;
    }
}
 */
