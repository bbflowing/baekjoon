package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14868 {
    /*
    public static int N, K, count;
    public static int[][] world;
    public static int[] parents;
    public static Queue<Civilization> queue;
    public static Queue<Civilization> next;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        world = new int[N][N];
        parents = new int[K+1];
        queue = new ArrayDeque<>();
        next = new ArrayDeque<>();
        for (int i=1; i<=K; ++i) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken())-1;
            int r = N-Integer.parseInt(st.nextToken());
            queue.add(new Civilization(r, c, i));
            world[r][c] = i;
            parents[i] = i;
        }
        int years = 0;
        count = K;
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
            Civilization c = queue.poll();
            next.add(c);
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];
                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (world[nr][nc] != 0) {
                    if (union(c.civilization, world[nr][nc])) --count;
                }
            }
        }
    }

    public static boolean union (int c1, int c2) {
        int parent1 = find(c1);
        int parent2 = find(c2);

        if (parent1 == parent2) return false;
        else {
            if (parent1 < parent2) parents[parent2] = parent1;
            else parents[parent1] = parent2;
        }
        return true;
    }

    public static int find(int c) {
        if (parents[c] == c) return c;
        return parents[c] = find(parents[c]);
    }

    public static void spread() {
        while (!next.isEmpty()) {
            Civilization c = next.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];
                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (world[nr][nc] == 0) {
                    world[nr][nc] = c.civilization;
                    queue.add(new Civilization(nr, nc, c.civilization));
                }
            }
        }
    }
     */
}

/*
class Civilization {
    int r, c, civilization;

    Civilization (int r, int c, int civilization) {
        this.r = r;
        this.c = c;
        this.civilization = civilization;
    }
}
 */