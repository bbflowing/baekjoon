package graph;

import java.io.*;
import java.util.*;

public class Q6087 {
    /*
    public static int R, C;
    public static char[][] map;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        String line = "";
        Location first = null;
        Location second = null;
        for (int r = 0; r < R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'C') {
                    if (first == null) first = new Location(r, c, -1, 0);
                    else second = new Location(r, c, -1, 0);
                }
            }
        }
        bfs(first, second);
    }

    public static void bfs(Location first, Location second) {
        PriorityQueue<Location> queue = new PriorityQueue<>();
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int[][][] dp = new int[4][R][C];
        for (int i=0; i<4; ++i) {
            for (int r=0; r<R; ++r) Arrays.fill(dp[i][r], -1);
        }
        for (int dir=0; dir<4; ++dir) {
            dp[dir][first.r][first.c] = 0;
            queue.add(new Location(first.r, first.c, dir, 0));
        }
        int answer = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == second.r && cur.c == second.c) {
                System.out.println(cur.mirrors);
                return;
            }
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                if (map[nr][nc] == '*') continue;
                int nmirrors = cur.mirrors;
                if (dir != cur.before) ++nmirrors;
                if (dp[dir][nr][nc] == -1 || nmirrors <= dp[dir][nr][nc]) {
                    dp[dir][nr][nc] = nmirrors;
                    queue.add(new Location(nr, nc, dir, nmirrors));
                }
            }
        }
    }
     */
}

/*
class Location implements Comparable<Location> {
    int r, c, before, mirrors;

    Location(int r, int c, int before, int mirrors) {
        this.r = r;
        this.c = c;
        this.before = before;
        this.mirrors = mirrors;
    }

    @Override
    public int compareTo(Location l) {
        if (this.mirrors > l.mirrors) return 1;
        else return -1;
    }
}
 */