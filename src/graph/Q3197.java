package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q3197 {
    /*
    public static int R, C, waters;
    public static int[][] lake;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static Queue<Coordinate> queue;
    public static Queue<Coordinate> next;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        lake = new int[R][C];
        String line = "";
        Coordinate start = null;
        Coordinate dst = null;

        for (int r = 0; r < R; ++r) {
            line = br.readLine();
            for (int c = 0; c < C; ++c) {
                char target = line.charAt(c);
                if (target == 'L') {
                    if (start == null) start = new Coordinate(r, c, 0);
                    else dst = new Coordinate(r, c, 0);
                    lake[r][c] = -1;
                } else if (target == '.') lake[r][c] = -1;
            }
        }

        int counter = 0;
        queue = new ArrayDeque<>();
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c < C; ++c) {
                if (lake[r][c] == -1) {
                    ++counter;
                    dfs(r, c, counter);
                }
            }
        }

        int begin = lake[start.r][start.c];
        int end = lake[dst.r][dst.c];
        waters = counter;
        parents = new int[counter + 1];
        for (int i = 1; i < counter + 1; ++i) parents[i] = i;
        int time = 0;
        next = new ArrayDeque<>();
        while (true) {
            merge();
            if (find(begin) == find(end)) {
                System.out.println(time);
                break;
            }
            spread();
            ++time;
        }
    }

    public static int find(int w) {
        if (parents[w] == w) return w;
        return parents[w] = find(parents[w]);
    }

    public static boolean union(int w1, int w2) {
        int p1 = find(w1);
        int p2 = find(w2);
        if (p1 == p2) return false;
        else if (p1 < p2) parents[p2] = p1;
        else parents[p1] = p2;
        return true;
    }

    public static void merge() {
        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            next.add(cur);
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                if (lake[nr][nc] != 0) {
                    if (union(cur.number, lake[nr][nc])) --waters;
                }
            }
        }
    }

    public static void spread() {
        while (!next.isEmpty()) {
            Coordinate cur = next.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                if (lake[nr][nc] == 0) {
                    lake[nr][nc] = cur.number;
                    queue.add(new Coordinate(nr, nc, cur.number));
                }
            }
        }
    }

    public static void dfs(int r, int c, int counter) {
        lake[r][c] = counter;
        queue.add(new Coordinate(r, c, counter));
        for (int dir = 0; dir < 4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
            if (lake[nr][nc] != -1) continue;
            dfs(nr, nc, counter);
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