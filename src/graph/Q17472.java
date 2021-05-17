package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 다리 만들기2

public class Q17472 {
    /*
    public static int R, C, count;
    public static int[][] map;
    public static Queue<Coordinate> queue;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static PriorityQueue<Coordinate> bridges;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) {
                if (Integer.parseInt(st.nextToken()) == 1) map[r][c] = -1;
            }
        }
        queue = new ArrayDeque<>();
        int counter = 0;
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (map[r][c] == -1) {
                    ++counter;
                    dfs(r, c, counter);
                }
            }
        }
        bridges = new PriorityQueue<>();
        getDistance();
        parents = new int[counter+1];
        count = counter;
        for (int i=1; i<counter+1; ++i) parents[i] = i;
        System.out.println(getMST());
    }

    public static int getMST() {
        int answer = 0;
        while (!bridges.isEmpty()) {
            Coordinate cur = bridges.poll();
            if (union(cur.start, cur.end)) {
                --count;
                answer += cur.number;
            }
        }
        return count == 1 ? answer : -1;
    }

    public static boolean union(int island1, int island2) {
        int parent1 = find(island1);
        int parent2 = find(island2);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;
    }

    public static int find(int island) {
        if (parents[island] == island) return island;
        else return parents[island] = find(parents[island]);
    }

    public static void getDistance() {
        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.start; int nc = cur.end; int bridge = 0;
                while (true) {
                    nr += dr[dir];
                    nc += dc[dir];

                    if (nr<0 || R<=nr || nc<0 || C<=nc) break;
                    if (map[nr][nc] != 0) {
                        if (cur.number < map[nr][nc] && 2 <= bridge) bridges.add(new Coordinate(cur.number, map[nr][nc], bridge));
                        break;
                    }
                    ++bridge;
                }
            }
        }
    }

    public static void dfs(int r, int c, int counter) {
        map[r][c] = counter;
        queue.add(new Coordinate(r, c, counter));

        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (map[nr][nc] != -1) continue;
            dfs(nr, nc, counter);
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int start, end, number;

    Coordinate (int start, int end, int number) {
        this.start = start;
        this.end = end;
        this.number = number;
    }

    @Override
    public int compareTo(Coordinate c) {
        return this.number - c.number;
    }
}
 */