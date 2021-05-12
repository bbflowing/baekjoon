package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2917 {
    /*
    public static int R, C, answer;
    public static char[][] forest;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static int[][] distances;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        forest = new char[R][C];
        String line = "";
        Queue<Coordinate> trees = new ArrayDeque<>();
        Coordinate person = null;
        Coordinate hut = null;
        distances = new int[R][C];
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                forest[r][c] = line.charAt(c);
                distances[r][c] = Integer.MAX_VALUE;
                if (forest[r][c] == '+') {
                    trees.add(new Coordinate(r, c, 0));
                    distances[r][c] = 0;
                }
                else if (forest[r][c] == 'V') person = new Coordinate(r, c, 0);
                else if (forest[r][c] == 'J') hut = new Coordinate(r, c, 0);
            }
        }
        while (!trees.isEmpty()) {
            Coordinate t = trees.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = t.r + dr[dir];
                int nc = t.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (t.distance+1 < distances[nr][nc]) {
                    distances[nr][nc] = t.distance+1;
                    trees.add(new Coordinate(nr, nc, t.distance+1));
                }
            }
        }
        answer = Math.min(distances[person.r][person.c], distances[hut.r][hut.c]);
        solve(person, hut);
        System.out.println(answer);
    }

    public static void solve(Coordinate person, Coordinate hut) {
        PriorityQueue<Coordinate> pq = new PriorityQueue<>();
        pq.add(new Coordinate(person.r, person.c, distances[person.r][person.c]));
        boolean[][] visited = new boolean[R][C];
        visited[person.r][person.c] = true;

        while (!pq.isEmpty()) {
            Coordinate cur = pq.poll();
            answer = Math.min(cur.distance, answer);
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[nr][nc]) continue;
                if (nr == hut.r && nc == hut.c) return;
                visited[nr][nc] = true;
                pq.add(new Coordinate(nr, nc, distances[nr][nc]));
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r;
    int c;
    int distance;

    Coordinate (int r, int c, int distance) {
        this.r = r;
        this.c = c;
        this.distance = distance;
    }

    @Override
    public int compareTo (Coordinate c) {
        if (c.distance > this.distance) return 1;
        return -1;
    }
}
 */
