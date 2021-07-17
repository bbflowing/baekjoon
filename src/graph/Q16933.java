package graph;

// 벽 부수고 이동하기3

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q16933 {
    /*
    public static int R, C;
    public static char[][] map;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) map[r][c] = line.charAt(c);
        }
        bfs(K);
    }

    public static void bfs(int K) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Blank> queue = new ArrayDeque<>();
        queue.add(new Blank(1, 0, 0, 0, 1));
        boolean[][][][] visited = new boolean[2][K+1][R][C];
        visited[1][0][0][0] = true;

        while (!queue.isEmpty()) {
            Blank cur = queue.poll();
            if (cur.r == R-1 && cur.c == C-1) {
                System.out.println(cur.distance);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                int nday = cur.day;
                if (cur.day == 0) nday = 1;
                else nday = 0;

                if (map[nr][nc] == '0') {
                    if (!visited[nday][cur.broken][nr][nc]) {
                        visited[nday][cur.broken][nr][nc] = true;
                        queue.add(new Blank(nday, cur.broken, nr, nc, cur.distance+1));
                    }
                } else {
                    if (cur.broken+1 <= K) {
                        if (cur.day == 1) {
                            if (!visited[nday][cur.broken + 1][nr][nc]) {
                                visited[nday][cur.broken + 1][nr][nc] = true;
                                queue.add(new Blank(nday, cur.broken+1, nr, nc, cur.distance+1));
                            }
                        } else {
                            if (!visited[1][cur.broken+1][nr][nc]) {
                                queue.add(new Blank(nday, cur.broken, cur.r, cur.c, cur.distance+1));
                            }
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }
     */
}

/*
class Blank {
    int r, c, day, broken, distance;

    Blank (int day, int broken, int r, int c, int distance) {
        this.day = day;
        this.broken = broken;
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */