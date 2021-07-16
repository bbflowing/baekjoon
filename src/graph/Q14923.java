package graph;

// 미로 탈출

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14923 {
    /*
    public static int R, C;
    public static int[][] maze;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new int[R+1][C+1];
        st = new StringTokenizer(br.readLine());
        Location S = new Location(0, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
        st = new StringTokenizer(br.readLine());
        Location E = new Location(0, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
        for (int r=1; r<R+1; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=1; c<C+1; ++c) maze[r][c] = Integer.parseInt(st.nextToken());
        }
        bfs(S, E);
    }

    public static void bfs(Location S, Location E) {
        Queue<Location> queue = new ArrayDeque<>();
        boolean[][][] visited = new boolean[2][R+1][C+1];
        queue.add(S);
        visited[0][S.r][S.c] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == E.r && cur.c == E.c) {
                System.out.println(cur.time);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<1 || R+1<=nr || nc<1 || C+1<=nc) continue;
                if (visited[cur.used][nr][nc]) continue;
                if (maze[nr][nc] == 1) {
                    if (cur.used == 0) {
                        queue.add(new Location(1, nr, nc, cur.time+1));
                        visited[1][nr][nc] = true;
                    }
                } else {
                    queue.add(new Location(cur.used, nr, nc, cur.time+1));
                    visited[cur.used][nr][nc] = true;
                }
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Location {
    int r, c, used, time;

    Location (int used, int r, int c, int time) {
        this.used = used;
        this.r = r;
        this.c = c;
        this.time = time;
    }
}
 */