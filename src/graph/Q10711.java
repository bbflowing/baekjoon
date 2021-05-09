package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q10711 {
    /*
    public static int R, C, answer;
    public static int[][] beach;
    public static boolean[][] visited;
    public static int[] dr = {-1, -1, -1, 0, 0, +1, +1, +1};
    public static int[] dc = {-1, 0, +1, -1, +1, -1, 0, +1};
    public static Queue<Coordinate> queue;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        beach = new int[R][C];
        visited = new boolean[R][C];
        String line = "";
        int count = 0;
        queue = new ArrayDeque<>();
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                char target = line.charAt(c);
                if (target == '.') {
                    queue.add(new Coordinate(r, c));
                    visited[r][c] = true;
                } else {
                    beach[r][c] = target-'0';
                    ++count;
                }
            }
        }
        answer = count;
        int time = 0;
        while (true) {
            int before = answer;
            ++time;
            bfs();
            if (answer == 0) {
                System.out.println(time);
                break;
            } else if (answer == before) {
                System.out.println(time-1);
                break;
            }
        }
    }

    public static void bfs() {
        int size = queue.size();
        for (int i=0; i<size; ++i) {
            Coordinate cur = queue.poll();
            for (int dir=0; dir<8; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[nr][nc]) continue;
                if (beach[nr][nc] != 0) {
                    --beach[nr][nc];
                    if (beach[nr][nc] == 0) {
                        visited[nr][nc] = true;
                        --answer;
                        queue.add(new Coordinate(nr, nc));
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate {
    int r;
    int c;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */
