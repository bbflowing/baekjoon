package graph;

// 미로 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2665 {
    /*
    public static int N;
    public static char[][] rooms;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        rooms = new char[N][N];
        String line = "";
        for (int r = 0; r < N; ++r) {
            line = br.readLine();
            for (int c = 0; c < N; ++c) {
                rooms[r][c] = line.charAt(c);
            }
        }
        bfs();

    }

    public static void bfs() {
        PriorityQueue<Location> queue = new PriorityQueue<>();
        int[][] dp = new int[N][N];
        for (int r = 0; r < N; ++r) {
            for (int c = 0; c < N; ++c) dp[r][c] = Integer.MAX_VALUE;
        }
        queue.add(new Location(0, 0, 0));
        dp[0][0] = 0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == N-1 && cur.c == N-1) {
                System.out.println(cur.changes);
                return;
            }
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                int nchanges = cur.changes;

                if (nr < 0 || N <= nr || nc < 0 || N <= nc) continue;
                if (rooms[nr][nc] == '0') ++nchanges;
                if (nchanges >= dp[nr][nc]) continue;
                dp[nr][nc] = nchanges;
                queue.add(new Location(nr, nc, nchanges));
            }
        }
    }
     */
}

/*
class Location implements Comparable<Location> {
    int r, c, changes;

    Location(int r, int c, int changes) {
        this.r = r;
        this.c = c;
        this.changes = changes;
    }

    @Override
    public int compareTo(Location l) {
        if (this.changes > l.changes) {
            return 1;
        } else {
            return -1;
        }
    }
}
 */