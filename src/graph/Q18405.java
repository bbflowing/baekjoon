package graph;

// 경쟁적 전염

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q18405 {
    /*
    public static int N;
    public static int[][] laboratory;
    public static PriorityQueue<Virus> queue;
    public static PriorityQueue<Virus> next;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        laboratory = new int[N][N];
        queue = new PriorityQueue<>();
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                laboratory[r][c] = Integer.parseInt(st.nextToken());
                if (laboratory[r][c] != 0) queue.add(new Virus(r, c, laboratory[r][c]));
            }
        }
        st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        for (int t=0; t<S; ++t) spread();
        System.out.println(laboratory[X-1][Y-1]);
    }

    public static void spread() {
        next = new PriorityQueue<>();
        while (!queue.isEmpty()) {
            Virus cur = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (laboratory[nr][nc] != 0) continue;
                laboratory[nr][nc] = cur.type;
                next.add(new Virus(nr, nc, cur.type));
            }
        }
        queue = next;
    }
     */
}

/*
class Virus implements Comparable<Virus> {
    int r, c, type;

    Virus (int r, int c, int type) {
        this.r = r;
        this.c = c;
        this.type = type;
    }

    @Override
    public int compareTo (Virus v) {
        if (this.type > v.type) return 1;
        else if (this.type == v.type) return 0;
        else return -1;
    }
}
 */