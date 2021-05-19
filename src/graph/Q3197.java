package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

// 백조의 호수

public class Q3197 {
    /*
    public static int R, C, count;
    public static int[][] lake;
    public static Queue<Coordinate> queue;
    public static Queue<Coordinate> next;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        lake = new int[R][C];
        String line = "";
        Coordinate first = null;
        Coordinate second = null;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                char target = line.charAt(c);
                if (target == 'L') {
                    lake[r][c] = -1;
                    if (first == null) first = new Coordinate(r, c, 0);
                    else second = new Coordinate(r, c, 0);
                } else if (target == '.') lake[r][c] = -1;
            }
        }
        int counter = 0;
        queue = new ArrayDeque<>();
        next = new ArrayDeque<>();
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (lake[r][c] == -1) {
                    ++counter;
                    dfs(r, c, counter);
                }
            }
        }
        first.number = lake[first.r][first.c];
        second.number = lake[second.r][second.c];
        parents = new int[counter+1];
        for (int i=1; i<counter+1; ++i) parents[i] = i;
        int time = 0;
        while (true) {
            merge();
            int parent1 = find(first.number);
            int parent2 = find(second.number);
            if (parent1 == parent2 || first.number == parent2 || second.number == parent1) {
                System.out.println(time);
                break;
            }
            melt();
            ++time;
        }
    }
    public static int find(int number) {
        if (parents[number] == number) return number;
        return parents[number] = find(parents[number]);
    }

    public static void merge() {
        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            next.add(cur);
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                if (lake[nr][nc] != 0)  union(lake[nr][nc], cur.number);
            }
        }
    }

    public static void melt() {
        while (!next.isEmpty()) {
            Coordinate cur = next.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                if (lake[nr][nc] == 0) {
                    queue.add(new Coordinate(nr, nc, cur.number));
                    lake[nr][nc] = cur.number;
                }
            }
        }
    }

    public static void union(int number1, int number2) {
        int parent1 = find(number1);
        int parent2 = find(number2);

        if (parent1 == parent2) return;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
    }

    public static void dfs(int r, int c, int counter) {
        lake[r][c] = counter;
        queue.add(new Coordinate(r, c, counter));
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (lake[nr][nc] != -1) continue;
            dfs(nr, nc, counter);
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