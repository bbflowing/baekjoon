package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if (N == K) {
            System.out.println(0);
            System.exit(0);
        }
        //dp(N, K);
        bfs(N, K);
    }

    public static void bfs (int N, int K) {
        Queue<Pair> queue = new LinkedList<>();
        boolean visited [] = new boolean [100001];
        queue.add(new Pair(N, 0));
        visited[N] = true;
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int distance = current.distance;

            for (int i=0; i<3; ++i) {
                int next = current.index;
                if (i == 0) {
                    next = next - 1;
                } else if (i == 1) {
                    next = next + 1;
                } else if (i == 2) {
                    next = 2 * next;
                }

                if (next >= 100001 || next < 0) {
                    continue;
                }

                if (visited[next]) {
                    continue;
                }

                if (next == K) {
                    System.out.println(distance + 1);
                    System.exit(0);
                }
                visited[next] = true;
                queue.add(new Pair(next, distance + 1));
            }
        }
    }

    public static void dp (int N, int K) {
        int answer[] = new int[K + 2];
        Arrays.fill(answer, 987_654_321);
        answer[N] = 1;
        answer[N + 1] = 1;
        if (N >= 1) {
            answer[N - 1] = 1;
        }
        if (K >= 2*N) {
            answer[2*N] = 1;
        }
        if (N == K) {
            System.out.println(answer[N]);
            System.exit(0);
        } else if (K == N + 1) {
            System.out.println(answer[N + 1]);
            System.exit(0);
        } else if (K == 2*N) {
            System.out.println(answer[2 * N]);
            System.exit(0);
        }

        for (int i = N+2; i <= K; ++i) {
            int temp = Math.min(answer[i - 1], answer[i + 1]);
            if (i % 2 == 0) {
                temp = Math.min(temp, answer[i / 2]);
            }
            answer[i] = temp+1;
            System.out.println(i + ":" + answer[i]);
        }
        System.out.println(answer[K]);
    }
}

class Pair {
    int index;
    int distance;

    Pair (int index, int distance) {
        this.index = index;
        this.distance = distance;
    }
}
