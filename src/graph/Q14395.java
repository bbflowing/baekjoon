package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14395 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long S = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        if (S == T) {
            System.out.println(0);
        } else {
            bfs(S, T);
        }
    }

    public static void bfs (long S, int T) {
        HashMap<Long, Boolean> visited = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(S, 0, ""));
        visited.put(S, true);
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            for (int i=0; i<4; ++i) {
                long nv = current.value;
                String nop = current.operations;
                int ncount = current.count;
                if (i == 0) { //*
                    nv *= nv; nop += "*";
                } else if (i == 1) { //+
                    nv += nv; nop += "+";
                } else if (i == 2) { //-
                    nv = 0; nop += "-";
                } else if (i == 3) { // /
                    if (nv == 0) {
                        continue;
                    }
                    nv = 1; nop += "/";
                }


                if (nv == T) {
                    System.out.println(nop);
                    System.exit(0);
                }
                if (visited.containsKey(nv)) {
                    continue;
                }
                queue.add(new Pair(nv, ncount+1, nop));
                visited.put(nv, true);
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Pair {
    long value;
    int count;
    String operations;

    Pair (long value, int count, String operations) {
        this.value = value;
        this.count = count;
        this.operations = operations;
    }
}
 */
