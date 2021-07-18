package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1194 {
    /*
    public static int R, C;
    public static char[][] maze;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char[R][C];
        Location start = null;
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                maze[r][c] = line.charAt(c);
                if (maze[r][c] == '0') {
                    start = new Location(r, c, 0, 0);
                    maze[r][c] = '.';
                }
            }
        }
        System.out.println(bfs(start));
    }

    public static int bfs(Location start) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][][] visited = new boolean[R][C][1<<6];
        Queue<Location> queue = new ArrayDeque<>();
        visited[start.r][start.c][0] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                int nkey = cur.key;
                int ntimes = cur.times+1;
                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[nr][nc][cur.key]) continue;
                if (maze[nr][nc] == '#') continue;
                else if ('a' <= maze[nr][nc] && maze[nr][nc] <= 'f') {
                    nkey = cur.key | 1<<maze[nr][nc]-'a';
                } else if ('A' <= maze[nr][nc] && maze[nr][nc] <= 'F') {
                    if ((cur.key & 1<<maze[nr][nc]-'A') == 0) continue;
                } else if (maze[nr][nc] == '1') {
                    return ntimes;
                }
                visited[nr][nc][nkey] = true;
                queue.add(new Location(nr, nc, nkey, ntimes));
            }
        }
        return -1;
    }
     */
}

/*
class Location {
    int r, c, key, times;

    Location(int r, int c, int key, int times) {
        this.r = r;
        this.c = c;
        this.key = key;
        this.times = times;
    }
}
 */