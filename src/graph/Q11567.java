package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11567 {
    /*
    public static int R, C;
    public static char[][] road;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        road = new char[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) road[r][c] = line.charAt(c);
        }
        st = new StringTokenizer(br.readLine());
        Location start = new Location(Integer.parseInt(st.nextToken())-1, Integer.parseInt(st.nextToken())-1, -1, -1);
        st = new StringTokenizer(br.readLine());
        Location end = new Location(Integer.parseInt(st.nextToken())-1, Integer.parseInt(st.nextToken())-1, -1, -1);
        boolean result = bfs(start, end);
        if (result) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean bfs(Location start, Location end) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Location> queue = new ArrayDeque<>();
        queue.add(start);
        boolean[][] visited = new boolean[R][C];
        visited[start.r][start.c] = true;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (nr == end.r && nc == end.c) {
                    if (road[nr][nc] == 'X') return true;
                    if (visited[nr][nc]) return true;
                    else {
                        int ndir = 0;
                        for (ndir=0; ndir<4; ++ndir) {
                            int checkr = nr + dr[ndir];
                            int checkc = nc + dc[ndir];
                            if (checkr<0 || R<=checkr || checkc<0 || C<=checkc) continue;
                            if (road[checkr][checkc] == '.' && checkr != cur.br && checkc != cur.bc) return true;
                        }
                    }
                    queue.add(new Location(nr, nc, cur.r, cur.c));
                    visited[nr][nc] = true;
                    continue;
                }
                if (visited[nr][nc]) continue;
                if (road[nr][nc] == 'X') continue;
                visited[nr][nc] = true;
                queue.add(new Location(nr, nc, cur.r, cur.c));

            }
        }
        return false;
    }
     */
}

/*
class Location {
    int r, c, br, bc;

    Location(int r, int c, int br, int bc) {
        this.r = r;
        this.c = c;
        this.br = br;
        this.bc = bc;
    }
}
 */
