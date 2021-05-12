package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14868 {
    /*
    public static int N, civilizations;
    public static int[][] map;
    public static Queue<Coordinate> queue;
    public static Queue<Coordinate> next;
    public static int[] parents;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1 ,1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        queue = new ArrayDeque<>();
        next = new ArrayDeque<>();
        int M = Integer.parseInt(st.nextToken());
        for (int i=1; i<=M; ++i) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken())-1;
            int r = N-Integer.parseInt(st.nextToken());
            map[r][c] = i;
            queue.add(new Coordinate(r, c, i));
        }
        civilizations = M;
        parents = new int[M+1];
        for (int i=1; i<=M; ++i) parents[i] = i;
        int time = 0;
        while (true) {
            merge();
            if (civilizations == 1) {
                System.out.println(time);
                break;
            }
            spread();
            ++time;
        }
    }

    public static void spread() {
        while (!next.isEmpty()) {
            Coordinate cur = next.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (map[nr][nc] == 0) {
                    map[nr][nc] = cur.number;
                    queue.add(new Coordinate(nr, nc, cur.number));
                }
            }
        }
    }

    public static int find (int c) {
        if (parents[c] == c) return c;
        else return parents[c] = find(parents[c]);
    }

    public static boolean union (int c1, int c2) {
        int p1 = find(c1);
        int p2 = find(c2);

        if (p1 == p2) return false;
        else if (p1 < p2) parents[p2] = p1;
        else parents[p1] = p2;
        return true;
    }

    public static void merge() {
        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            next.add(cur);
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (map[nr][nc] != 0) {
                    if (union(map[cur.r][cur.c], map[nr][nc])) --civilizations;
                }
            }
        }
    }
     */
}

/*
class Coordinate {
    int r, c, number;

    Coordinate (int r, int c, int number) {
        this.r = r;
        this.c = c;
        this.number = number;
    }
}
 */
