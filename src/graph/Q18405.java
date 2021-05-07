package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q18405 {
    /*
    public static int N;
    public static int[][] laboratory;
    public static PriorityQueue<Coordinate> queue;
    public static boolean[][] visited;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        laboratory = new int[N+1][N+1];
        visited = new boolean[N+1][N+1];
        queue = new PriorityQueue<>();
        for (int r=1; r<N+1; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=1; c<N+1; ++c) {
                laboratory[r][c] = Integer.parseInt(st.nextToken());
                if (laboratory[r][c] != 0) {
                    queue.add(new Coordinate(laboratory[r][c], r, c));
                    visited[r][c] = true;
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());
        int endR = Integer.parseInt(st.nextToken());
        int endC = Integer.parseInt(st.nextToken());
        for (int t=0; t<time; ++t) {
            bfs();
        }
        System.out.println(laboratory[endR][endC]);
    }

    public static void bfs() {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        PriorityQueue<Coordinate> next = new PriorityQueue<>();
        int size = queue.size();
        for (int i=0; i<size; ++i) {
            Coordinate cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<1 || N<nr || nc<1 || N<nc) continue;
                if (visited[nr][nc]) continue;
                visited[nr][nc] = true;
                laboratory[nr][nc] = cur.type;
                next.add(new Coordinate(laboratory[nr][nc], nr, nc));
            }
        }
        queue = next;
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int type;
    int r;
    int c;

    Coordinate (int type, int r, int c) {
        this.type = type;
        this.r = r;
        this.c = c;
    }

    @Override
    public int compareTo (Coordinate c) {
        return this.type - c.type;
    }
}
 */