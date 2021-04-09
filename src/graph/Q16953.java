package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16953 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        bfs(A, B);
    }

    public static void bfs (int A, int B) {
        Queue<Pair> queue = new LinkedList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        queue.add(new Pair(A, 1));
        map.put(A, true);
        while (!queue.isEmpty()) {
            Pair cur = queue.poll();
            int current = cur.value;
            if (current == B) {
                System.out.println(cur.time);
                System.exit(0);
            }
            for (int i=0; i<2; ++i) {
                int next = current;
                if (i==0) {
                    next *= 2;
                } else {
                    next = 10*next+1;

                }

                if (next < 1 || next > 1_000_000_000) {
                    continue;
                }
                if (map.containsKey(next)) {
                    continue;
                }
                map.put(next, true);
                queue.add(new Pair(next, cur.time+1));

            }
        }
        System.out.println(-1);
    }

     */
}

/*
class Pair {
    int value;
    int time;

    Pair (int value, int time) {
        this.value = value;
        this.time = time;
    }
}
 */
