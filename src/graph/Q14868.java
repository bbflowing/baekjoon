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
    public static int N, count;
    public static int[][] world;
    public static Queue<Coordinate> queue;
    public static Queue<Coordinate> next;
    public static int[] parents;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        world = new int[N][N];
        queue = new ArrayDeque<>();
        next = new ArrayDeque<>();
        for (int i=1; i<=M; ++i) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken())-1;
            int r = N-Integer.parseInt(st.nextToken());
            world[r][c] = i;
            queue.add(new Coordinate(r, c, i));
        }
        parents = new int[M+1];
        for (int i=0; i<M+1; ++i) parents[i] = i;
        count = M;
        int years = 0;
        while (true) {
            merge();
            if (count == 1) {
                System.out.println(years);
                break;
            }
            spread();
            ++years;
        }
    }

    public static void merge() {
        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            next.add(cur);

            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (world[nr][nc] != 0) {
                    if (union(cur.civilization, world[nr][nc])) --count;
                }
            }
        }
    }

    public static int find(int c) {
        if (parents[c] == c) return c;
        return parents[c] = find(parents[c]);
    }

    public static boolean union(int c1, int c2) {
        int parent1 = find(c1);
        int parent2 = find(c2);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;
    }

    public static void spread() {
        while (!next.isEmpty()) {
            Coordinate cur = next.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (world[nr][nc] == 0) {
                    world[nr][nc] = cur.civilization;
                    queue.add(new Coordinate(nr, nc, world[nr][nc]));
                }
            }
        }
    }
     */
}

/*
class Coordinate {
    int r, c, civilization;

    Coordinate (int r, int c, int civilization) {
        this.r = r;
        this.c = c;
        this.civilization = civilization;
    }
}
 */