package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q14226 {
    /*
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        bfs(S);
    }

    public static void bfs(int S) {
        Queue<Operation> queue = new LinkedList<>();
        boolean visited[][][] = new boolean[2][S + 2][S + 2]; // copy, stickers, copied
        queue.add(new Operation(1, 0, 0, 0));
        visited[0][1][0] = true;

        while (!queue.isEmpty()) {
            Operation o = queue.poll();
            if (o.stickers == S) {
                System.out.println(o.times);
                return;
            }

            for (int i = 0; i < 3; ++i) {
                int nstickers = o.stickers; int ncopy = o.copy;
                int ncopied = o.copied; int ntimes = o.times + 1;

                if (i == 0) {
                    ncopy = 1; ncopied = nstickers;
                    if (!visited[ncopy][nstickers][ncopied]) {
                        visited[ncopy][nstickers][ncopied] = true;
                        queue.add(new Operation(nstickers, ncopy, ncopied, ntimes));
                    }
                } else if (i == 1) {
                    if (o.copy == 1) {
                        nstickers += ncopied;
                        if (nstickers > S + 1) {
                            continue;
                        } else {
                            if (!visited[ncopy][nstickers][ncopied]) {
                                visited[ncopy][nstickers][ncopied] = true;
                                queue.add(new Operation(nstickers, ncopy, ncopied, ntimes));
                            }
                        }
                    }
                } else if (i == 2) {
                    if (nstickers-1 < 0) {
                        continue;
                    }
                    --nstickers;
                    if (!visited[ncopy][nstickers][ncopied]) {
                        visited[ncopy][nstickers][ncopied] = true;
                        queue.add(new Operation(nstickers, ncopy, ncopied, ntimes));
                    }
                }
            }
        }
    }
     */
}

/*
class Operation {
    int stickers;
    int copy;
    int copied;
    int times;

    Operation(int stickers, int copy, int copied, int times) {
        this.stickers = stickers;
        this.copy = copy;
        this.copied = copied;
        this.times = times;
    }
}
 */
