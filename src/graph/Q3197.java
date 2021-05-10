package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q3197 {
    /*
    public static int R, C;
    public static int[][] map;
    public static Queue<Coordinate> queue;
    public static Queue<Coordinate> water;
    public static boolean[][] visited;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        String line = "";
        Coordinate start = null;
        Coordinate dst = null;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                char target = line.charAt(c);
                if (target == '.') {
                    map[r][c] = -1;
                } else if (target == 'L') {
                    map[r][c] = -1;
                    if (start == null) {
                        start = new Coordinate (r, c, 0);
                    } else {
                        dst = new Coordinate(r, c, 0);
                    }
                }
            }
        }
        int counter = 0;
        queue = new ArrayDeque<>();
        water = new ArrayDeque<>();
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (map[r][c] == -1) {
                    ++counter;
                    dfs(r, c, counter);
                }
            }
        }
        start.number = map[start.r][start.c];
        dst.number = map[dst.r][dst.c];
        parents = new int[counter+1];
        for (int i=1; i<counter+1; ++i) {
            parents[i] = i;
        }
        int time = 0;
        while (true) {
            merge();
            int parent1 = find(start.number);
            int parent2 = find(dst.number);
            if (parent1 == parent2 ||
                parent1 == dst.number ||
                parent2 == start.number) break;
            melt();
            ++time;
        }
        System.out.println(time);
    }

    public static void merge() {
        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            water.add(cur);
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (map[nr][nc] == cur.number) continue;
                if (map[nr][nc] != 0) {
                    union(map[cur.r][cur.c], map[nr][nc]);
                }
            }
        }
    }

    public static void melt() {
        int size = water.size();
        for (int i=0; i<size; ++i) {
            Coordinate cur = water.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (map[nr][nc] == 0) {
                    map[nr][nc] = map[cur.r][cur.c];
                    queue.add(new Coordinate(nr, nc, map[cur.r][cur.c]));
                }
            }
        }
    }

    public static int find (int island) {
        if (parents[island] == island) return island;
        return parents[island] = find(parents[island]);
    }

    public static void union (int island1, int island2) {
        int parent1 = find(island1);
        int parent2 = find(island2);

        if (parent1 == parent2) {
            return;
        } else if (parent1 > parent2) {
            parents[parent1] = parent2;
        } else {
            parents[parent2] = parent1;
        }
    }

    public static void dfs (int r, int c, int counter) {
        map[r][c] = counter;
        queue.add(new Coordinate(r, c, counter));
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (map[nr][nc] == -1) dfs(nr, nc, counter);
        }
    }
     */
}

/*
class Coordinate {
    int r, c, number;

    Coordinate(int r, int c, int number) {
        this.r = r;
        this.c = c;
        this.number = number;
    }
}
 */