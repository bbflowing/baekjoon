package graph;

// Robot in a maze

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q9311 {
    /*
    public static int R, C;
    public static char[][] maze;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        String line = "";
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            maze = new char[R][C];
            Location start = null;
            for (int r=0; r<R; ++r) {
                line = br.readLine();
                for (int c=0; c<C; ++c) {
                    maze[r][c] = line.charAt(c);
                    if (maze[r][c] == 'S') start = new Location(r, c, 0);
                }
            }
            int result = bfs(start);
            StringBuilder sb = new StringBuilder();
            if (result == -1) sb.append("No Exit");
            else sb.append("Shortest Path: "+result);
            bw.append(sb);
            bw.newLine();
        }
        bw.flush();
    }

    public static int bfs(Location start) {
        Queue<Location> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[R][C];
        queue.add(start);
        visited[start.r][start.c] = true;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;;
                if (visited[nr][nc]) continue;
                if (maze[nr][nc] == 'X') continue;
                else if (maze[nr][nc] == 'G') return cur.length+1;
                visited[nr][nc] = true;
                queue.add(new Location(nr, nc, cur.length+1));
            }
        }
        return -1;
    }
     */
}

/*
class Location {
    int r, c, length;

    Location(int r, int c, int length) {
        this.r = r;
        this.c = c;
        this.length = length;
    }
}
 */
