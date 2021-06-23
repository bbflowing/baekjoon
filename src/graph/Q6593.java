package graph;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q6593 {
    /*
    public static int H, R, C;
    public static char[][][] building;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String line = "";
        String fail = "Trapped!";
        Coordinate start;
        while (true) {
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            if (H == 0 && R == 0 && C == 0) break;
            building = new char[H][R][C];
            start = null;
            for (int h=0; h<H; ++h) {
                for (int r=0; r<R; ++r) {
                    line = br.readLine();
                    for (int c=0; c<C; ++c) {
                        building[h][r][c] = line.charAt(c);
                        if (building[h][r][c] == 'S') start = new Coordinate(h, r, c);
                    }
                }
                line = br.readLine();
            }
            int answer = bfs(start);

            if (answer == -1) bw.append(fail);
            else {
                StringBuilder sb = new StringBuilder("Escaped in "+answer+" minute(s).");
                bw.append(sb);
            }
            bw.newLine();
        }
        bw.flush();
    }

    public static int bfs(Coordinate start) {
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(start);
        boolean[][][] visited = new boolean[H][R][C];
        visited[start.h][start.r][start.c] = true;
        int[] dh = {0, 0, 0, 0, -1, 1};
        int[] dr = {-1, 1, 0, 0, 0, 0};
        int[] dc = {0, 0, -1, 1, 0, 0};
        int time = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ++time;
            for (int i = 0; i < size; ++i) {
                Coordinate cur = queue.poll();
                for (int dir=0; dir<6; ++dir) {
                    int nh = cur.h + dh[dir];
                    int nr = cur.r + dr[dir];
                    int nc = cur.c + dc[dir];

                    if (!check(nh, nr, nc)) continue;
                    if (visited[nh][nr][nc]) continue;
                    if (building[nh][nr][nc] == '#') continue;
                    else if (building[nh][nr][nc] == 'E') return time;
                    visited[nh][nr][nc] = true;
                    queue.add(new Coordinate(nh, nr, nc));

                }
            }
        }
        return -1;
    }

    public static boolean check(int h, int r, int c) {
        if (h<0 || H<=h || r<0 || R<=r || c<0 || C<=c) return false;
        return true;
    }
     */
}

/*
class Coordinate {
    int h, r, c;

    Coordinate (int h, int r, int c) {
        this.h = h;
        this.r = r;
        this.c = c;
    }
}
 */