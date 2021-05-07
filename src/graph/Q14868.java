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
    public static int[][] map;
    public static int[] parents;
    public static boolean[][] visited;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static Queue<Coordinate> queue, next;

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
            queue.add(new Coordinate(r, c));
        }
        count = M;
        parents = new int[M+1];
        Arrays.fill(parents, -1);
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
                if (map[nr][nc] != 0) {
                    if (union(map[cur.r][cur.c], map[nr][nc])) {
                        --count;
                    }
                }
            }
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
                    queue.add(new Coordinate(nr, nc));
                    map[nr][nc] = map[cur.r][cur.c];
                }
            }
        }
    }

    public static boolean union (int island1, int island2) {
        int parent1 = find(island1);
        int parent2 = find(island2);

        if (parent1 == parent2) {
            return false;
        } else {
            if (parent1 < parent2) {
                parents[parent2] = parent1;
            } else {
                parents[parent1] = parent2;
            }
            return true;
        }
    }

    public static int find (int island) {
        if (parents[island] == -1) return island;
        else return parents[island] = find(parents[island]);
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
