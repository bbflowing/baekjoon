package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 다리 만들기2

public class Q17472 {
    /*
    public static int R, C;
    public static int[][] islands;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static Queue<Location> queue;
    public static PriorityQueue<Location> bridges;
    public static int[] parents;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        islands = new int[R][C];
        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) {
                if (Integer.parseInt(st.nextToken()) == 1) islands[r][c] = -1;
                else islands[r][c] = 0;
            }
        }
        int counter = 0;
        queue = new ArrayDeque<>();
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (islands[r][c] == -1) {
                    ++counter;
                    dfs(r, c, counter);
                }
            }
        }
        bridges = new PriorityQueue<>();
        getDistance();
        parents = new int[counter+1];
        for (int i=1; i<counter+1; ++i) parents[i] = i;
        System.out.println(getMST(counter));
    }

    public static boolean union(int start, int end) {
        int parent1 = find(start);
        int parent2 = find(end);

        if (parent1 == parent2) return false;
        else if (parent1 < parent2) parents[parent2] = parent1;
        else parents[parent1] = parent2;
        return true;

    }

    public static int find(int island) {
        if (parents[island] == island) return island;
        else return parents[island] = find(parents[island]);
    }

    public static int getMST(int counter) {
        int bridge = 0;
        while (!bridges.isEmpty()) {
            Location l = bridges.poll();
            if (union(l.r, l.c)) {
                bridge += l.number;
                --counter;
            }
            if (counter == 1) return bridge;
        }
        return -1;
    }

    public static void getDistance() {
        while (!queue.isEmpty()) {
            Location l = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = l.r; int nc = l.c; int length = 0;
                while (true) {
                    nr += dr[dir];
                    nc += dc[dir];
                    if (nr<0 || R<=nr || nc<0 || C<=nc) break;
                    if (islands[nr][nc] != 0) {
                        if (l.number < islands[nr][nc] && 2 <= length) {
                            bridges.add(new Location(l.number, islands[nr][nc], length));
                        }
                        break;
                    }
                    ++length;
                }
            }
        }
    }

    public static void dfs(int r, int c, int counter) {
        islands[r][c] = counter;
        queue.add(new Location(r, c, counter));
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (islands[nr][nc] != -1) continue;
            dfs(nr, nc, counter);
        }
    }
     */
}

/*
class Location implements Comparable<Location>{
    int r, c, number;

    Location (int r, int c, int number) {
        this.r = r;
        this.c = c;
        this.number = number;
    }

    @Override
    public int compareTo(Location l) {
        if (this.number > l.number) return 1;
        else return -1;
    }
}
 */