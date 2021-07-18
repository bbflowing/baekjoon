package dijkstra;

// 녹색 옷 입은 애가 젤다지?

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q4485 {
    /*
    public static int N;
    public static int[][] cave;
    public static int[][] dp;

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = -1;
        int cases = 0;
        while (true) {
            N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            ++cases;
            cave = new int[N][N];
            dp = new int[N][N];
            for (int r = 0; r < N; ++r) {
                st = new StringTokenizer(br.readLine());
                for (int c = 0; c < N; ++c) {
                    cave[r][c] = Integer.parseInt(st.nextToken());
                    dp[r][c] = -1;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Problem "+cases+": ");
            sb.append(bfs());
            bw.append(sb);
            bw.newLine();
        }
        bw.flush();
    }

    public static int bfs() {
        PriorityQueue<Location> queue = new PriorityQueue<>();
        queue.add(new Location(0, 0, cave[0][0]));
        dp[0][0] = cave[0][0];
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == N-1 && cur.c == N-1) return cur.cost;
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (dp[nr][nc] == -1 || (dp[nr][nc] > cur.cost + cave[nr][nc])) {
                    dp[nr][nc] = cur.cost + cave[nr][nc];
                    queue.add(new Location(nr, nc, dp[nr][nc]));
                }
            }
        }
        return -1;
    }
     */
}

/*
class Location implements Comparable<Location>{
    int r, c, cost;

    Location(int r, int c, int cost) {
        this.r = r;
        this.c = c;
        this.cost = cost;
    }

    @Override
    public int compareTo (Location l) {
        if (this.cost > l.cost) return 1;
        else return -1;
    }
}
 */


