package graph;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

// 상범빌딩

public class Q6593 {
    /*
    public static int L, R, C;
    public static char[][][] building;

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String line = "";
        while (true) {
            line = br.readLine();
            if (line.equals("0 0 0")) break;
            st = new StringTokenizer(line);
            L = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            building = new char[L][R][C];
            Location S = null; Location E = null;
            for (int l=0; l<L; ++l) {
                for (int r=0; r<R; ++r) {
                    line = br.readLine();
                    for (int c=0; c<C; ++c) {
                        building[l][r][c] = line.charAt(c);
                        if (building[l][r][c] == 'S') S = new Location(l, r, c);
                        else if (building[l][r][c] == 'E') E = new Location(l, r, c);
                    }
                }
                line = br.readLine();
            }
            int result = bfs(S, E);
            if (result == -1) bw.append("Trapped!");
            else bw.append("Escaped in "+result+" minute(s).");
            bw.newLine();
        }
        bw.flush();
    }

    public static int bfs(Location S, Location E) {
        int[] dl = {-1, 1, 0, 0, 0, 0};
        int[] dr = {0, 0, -1, 1, 0, 0};
        int[] dc = {0, 0, 0, 0, -1, 1};
        Queue<Location> queue = new ArrayDeque<>();
        boolean[][][] visited = new boolean[L][R][C];
        queue.add(S);
        visited[S.l][S.r][S.c] = true;
        int minutes = 0;

        while (!queue.isEmpty()) {
            int qs = queue.size();
            ++minutes;
            for (int i=0; i<qs; ++i) {
                Location cur = queue.poll();
                for (int dir = 0; dir < 6; ++dir) {
                    int nl = cur.l + dl[dir];
                    int nr = cur.r + dr[dir];
                    int nc = cur.c + dc[dir];

                    if (nl < 0 || L <= nl || nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                    if (building[nl][nr][nc] == '#') continue;
                    if (visited[nl][nr][nc]) continue;
                    if (nl == E.l && nr == E.r && nc ==E.c) return minutes;
                    visited[nl][nr][nc] = true;
                    queue.add(new Location(nl, nr, nc));
                }
            }
        }
        return -1;
    }
     */
}

/*
class Location {
    int l, r, c;

    Location(int l, int r, int c) {
        this.l = l;
        this.r = r;
        this.c = c;
    }
}
 */