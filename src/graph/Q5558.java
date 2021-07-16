package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q5558 {
    /*
    public static char[][] map;
    public static int R, C;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        Location S = null;
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'S') S = new Location(1, r, c, 0);
            }
        }
        bfs(S, max);
    }

    public static void bfs(Location S, int max) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][][] visited = new boolean[max+1][R][C];
        Queue<Location> queue = new ArrayDeque<>();
        queue.add(S);
        visited[1][S.r][S.c] = true;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (map[cur.r][cur.c]-'0' == cur.goal) {
                if (cur.goal == max) {
                    System.out.println(cur.times);
                    return;
                } else {
                    visited[cur.goal+1][cur.r][cur.c] = true;
                    queue.add(new Location(cur.goal+1, cur.r, cur.c, cur.times));
                    continue;
                }
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[cur.goal][nr][nc]) continue;
                if (map[nr][nc] == 'X') continue;
                visited[cur.goal][nr][nc] = true;
                queue.add(new Location(cur.goal, nr, nc, cur.times+1));
            }
        }
    }
     */
}

/*
class Location {
    int goal, r, c, times;

    Location(int goal, int r, int c, int times) {
        this.goal = goal;
        this.r = r;
        this.c = c;
        this.times = times;
    }
}
 */