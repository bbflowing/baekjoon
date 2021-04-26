package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q18405 {
    /*
    public static int N;
    public static int[][] tube;
    public static Queue<Coordinate> queue;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        tube = new int[N][N];
        queue = new LinkedList<>();
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                tube[r][c] = Integer.parseInt(st.nextToken());
                if (tube[r][c] != 0) {
                    queue.add(new Coordinate(r, c, tube[r][c]));
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());
        int endR = Integer.parseInt(st.nextToken())-1;
        int endC = Integer.parseInt(st.nextToken())-1;

        for (int t=0; t<time; ++t) {
            bfs();
        }
        System.out.println(tube[endR][endC]);
    }

    public static void bfs() {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        PriorityQueue<Coordinate> next = new PriorityQueue<>();

        int size = queue.size();
        for (int i=0; i<size; ++i) {
            Coordinate c = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) {
                    continue;
                }
                if (tube[nr][nc] != 0) {
                    continue;
                }
                tube[nr][nc] = c.type;
                next.add(new Coordinate(nr, nc, c.type));
            }
        }
        queue = next;
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int r;
    int c;
    int type;

    Coordinate (int r, int c, int type) {
        this.r = r;
        this.c = c;
        this.type = type;
    }

    @Override
    public int compareTo (Coordinate c) {
        return this.type - c.type;
    }
}
 */