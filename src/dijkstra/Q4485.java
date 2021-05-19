package dijkstra;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q4485 {
    /*
    public static int N;
    public static int[][] cave;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int problem = 0;
        while (true) {
            N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            ++problem;
            cave = new int[N][N];
            int[][] visited = new int[N][N];
            for (int r=0; r<N; ++r) {
                Arrays.fill(visited[r], -1);
                st = new StringTokenizer(br.readLine());
                for (int c=0; c<N; ++c) cave[r][c] = Integer.parseInt(st.nextToken());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Problem "+problem+": "+dijkstra(visited));
            bw.append(sb);
            bw.newLine();
        }
        bw.flush();
    }

    public static int dijkstra(int[][] visited) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add(new Coordinate(0, 0, cave[0][0]));
        visited[0][0] = cave[0][0];

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == N-1 && cur.c == N-1) return cur.cost;
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (visited[nr][nc] == -1 || cur.cost + cave[nr][nc] < visited[nr][nc]) {
                    visited[nr][nc] = cur.cost + cave[nr][nc];
                    queue.add(new Coordinate(nr, nc, visited[nr][nc]));
                }
            }
        }
        return -1;
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
