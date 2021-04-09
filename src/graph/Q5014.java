package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5014 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        bfs(F, S, G, U, D);
    }

    public static void bfs (int F, int S, int G, int U, int D) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(S, 0));
        int dst = G;
        int distance [] = {U, -D};
        boolean visited [] = new boolean [F+1];
        visited[S] = true;

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            if (current.location == dst) {
                System.out.println(current.count);
                System.exit(0);
            }
            for (int i=0; i<2; ++i) {
                int nlocation = current.location + distance[i];
                if (nlocation < 1 || F < nlocation) {
                    continue;
                }
                if (visited[nlocation]) {
                    continue;
                }
                visited[nlocation] = true;
                queue.add(new Pair(nlocation, current.count+1));
            }
        }
        System.out.println("use the stairs");
    }
     */
}

/*
class Pair {
    int location;
    int count;

    Pair (int location, int count) {
        this.location = location;
        this.count = count;
    }
}
 */
