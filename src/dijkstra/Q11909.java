package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q11909 {
    /*
    public static int N;
    public static int[][] array;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new int[N+1][N+1];
        int[][] dp = new int[N+1][N+1];
        StringTokenizer st;
        for (int r=1; r<=N; ++r) {
            st = new StringTokenizer(br.readLine());
            Arrays.fill(dp[r], -1);
            for (int c=1; c<=N; ++c) {
                array[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        solve(dp);
    }

    public static void solve(int[][] dp) {
        dp[1][1] = 0;
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add(new Coordinate(1, 1, 0));

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == N && cur.c == N) {
                System.out.println(cur.cost);
                return;
            }
            if (1 <= cur.r && cur.r < N && 1 <= cur.c && cur.c < N) {
                for (int dir=0; dir<2; ++dir) {
                    int nr = cur.r; int nc = cur.c; int ncost = cur.cost;
                    if (dir==0) ++nc;
                    else ++nr;

                    if (nr<1 || N<nr || nc<1 || N<nc) continue;
                    if (array[nr][nc] < array[cur.r][cur.c]) {
                        if (dp[nr][nc] == -1 || cur.cost < dp[nr][nc]) {
                            dp[nr][nc] = cur.cost;
                            queue.add(new Coordinate(nr, nc, cur.cost));
                        }
                    } else {
                        ncost += (array[nr][nc]-array[cur.r][cur.c])+1;
                        if (dp[nr][nc] == -1 || ncost < dp[nr][nc]) {
                            dp[nr][nc] = ncost;
                            queue.add(new Coordinate(nr, nc, ncost));
                        }
                    }
                }
            } else if (cur.r == N && 1 <= cur.c && cur.c < N) {
                int nr = cur.r; int nc = cur.c+1; int ncost = cur.cost;
                if (nr<1 || N<nr || nc<1 || N<nc) continue;
                if (array[nr][nc] < array[cur.r][cur.c]) {
                    if (dp[nr][nc] == -1 || cur.cost < dp[nr][nc]) {
                        dp[nr][nc] = cur.cost;
                        queue.add(new Coordinate(nr, nc, cur.cost));
                    }
                } else {
                    ncost += (array[nr][nc]-array[cur.r][cur.c])+1;
                    if (dp[nr][nc] == -1 || ncost < dp[nr][nc]) {
                        dp[nr][nc] = ncost;
                        queue.add(new Coordinate(nr, nc, ncost));
                    }
                }
            } else if (1 <= cur.r && cur.r < N && cur.c == N) {
                int nr = cur.r+1; int nc = cur.c; int ncost = cur.cost;
                if (nr<1 || N<nr || nc<1 || N<nc) continue;
                if (array[nr][nc] < array[cur.r][cur.c]) {
                    if (dp[nr][nc] == -1 || cur.cost < dp[nr][nc]) {
                        dp[nr][nc] = cur.cost;
                        queue.add(new Coordinate(nr, nc, cur.cost));
                    }
                } else {
                    ncost += (array[nr][nc]-array[cur.r][cur.c])+1;
                    if (dp[nr][nc] == -1 || ncost < dp[nr][nc]) {
                        dp[nr][nc] = ncost;
                        queue.add(new Coordinate(nr, nc, ncost));
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r, c, cost;

    Coordinate (int r, int c, int cost) {
        this.r = r;
        this.c = c;
        this.cost = cost;
    }

    @Override
    public int compareTo(Coordinate c) {
        return this.cost - c.cost;
    }
}
 */
