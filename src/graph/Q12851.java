package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q12851 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        bfs(N, K);

    }

    public static void bfs (int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        int times[] = new int[100000 + 1];
        Arrays.fill(times, 987_654_321);
        times[N] = 0;
        queue.add(N);
        int answer = 0;
        boolean flag = false;
        int min = 0;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            if (!flag && now == K) {
                min = times[now];
                ++answer;
                flag = true;
                continue;
            }
            if (min == times[now] && now == K) {
                ++answer;
                continue;
            }

            for (int i = 0; i < 3; ++i) {
                int next = now;
                if (i == 0) {
                    next -= 1;
                } else if (i == 1) {
                    next += 1;
                } else if (i == 2) {
                    next *= 2;
                }
                if (next < 0 || 100000 < next) {
                    continue;
                }
                if (times[next] >= times[now] + 1) {
                    times[next] = times[now] + 1;
                    queue.add(next);
                }
            }
        }
        System.out.println(min);
        System.out.println(answer);
    }
}
