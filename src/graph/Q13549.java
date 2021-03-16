package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q13549 {
    /*
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        bfs(N, K);
    }

    public static void bfs(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        int times[] = new int[100000 + 1];
        Arrays.fill(times, 987_654_321);
        times[N] = 0;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            if (now == K) {
                System.out.println(times[K]);
                return;
            }

            int index = 2 * now;
            while (index <= 100000 && times[index] == 987_654_321) {
                times[index] = times[now];
                queue.add(index);
                index *= 2;
            }

            for (int i = 0; i < 2; ++i) {
                int next = now;
                if (i == 0) {
                    next -= 1;
                } else if (i == 1) {
                    next += 1;
                }
                if (next < 0 || next > 100000) {
                    continue;
                }
                if (times[next] == 987_654_321) {
                    times[next] = times[now]+1;
                    queue.add(next);
                }
            }
        }
    }

     */
}
