package MST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q13418 {
    /*
    public static int N;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()) + 1;
        int M = Integer.parseInt(st.nextToken()) + 1;
        ArrayList<Pair> queue = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            if (cost == 0) cost = 1;
            else cost = 0;
            if (i == 0) total += cost;
            else queue.add(new Pair(start, end, cost));
        }
        Collections.sort(queue, (p1, p2) -> p1.cost - p2.cost);
        int best = getMST(total, queue, 0);
        int worst = getMST(total, queue, 1);
        System.out.println(worst - best);
    }

    public static int getMST(int total, ArrayList<Pair> queue, int type) {
        parents = new int[N + 1];
        for (int i = 1; i < N + 1; ++i) parents[i] = i;
        parents[1] = 0;
        int size = queue.size();
        int count = N-1 ;
        if (type == 0) {
            for (int i = 0; i<size; ++i) {
                Pair p = queue.get(i);
                if (union(p.start, p.end)) {
                    total += p.cost;
                    --count;
                    if (count == 1) break;
                }
            }
        } else {
            for (int i = size-1; 0<=i; --i) {
                Pair p = queue.get(i);
                if (union(p.start, p.end)) {
                    total += p.cost;
                    --count;
                    if (count == 1) break;
                }
            }
        }
        return total*total;
    }

    public static boolean union(int building1, int building2) {
        int parent1 = find(building1);
        int parent2 = find(building2);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;
    }

    public static int find(int building) {
        if (parents[building] == building) return building;
        return parents[building] = find(parents[building]);
    }
     */
}

/*
class Pair {
    int start, end, cost;

    Pair(int start, int end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
    }
}
 */

