package graph;

import java.io.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// 나이트의 이동

public class Q7562 {
    /*
    public static int N;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t=0; t<T; ++t) {
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int sr = Integer.parseInt(st.nextToken());
            int sc = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int er = Integer.parseInt(st.nextToken());
            int ec = Integer.parseInt(st.nextToken());
            if (sr == er && sc == ec) bw.append("0");
            else bw.append(bfs(sr, sc, er, ec));
            bw.newLine();
        }
        bw.flush();
    }
    public static String bfs(int sr, int sc, int er, int ec) {
        int[] dr = {-1, -2, -2, -1, +1, +2, +2, +1};
        int[] dc = {-2, -1, +1, +2, -2, -1, +1, +2};
        Queue<Blank> queue = new ArrayDeque<>();
        queue.add(new Blank(sr, sc, 0));
        boolean[][] visited = new boolean[N][N];
        visited[sr][sc] = true;

        while (!queue.isEmpty()) {
            Blank cur = queue.poll();
            if (cur.r == er && cur.c == ec) return String.valueOf(cur.times);
            for (int dir=0; dir<8; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (visited[nr][nc]) continue;
                visited[nr][nc] = true;
                queue.add(new Blank(nr, nc, cur.times+1));
            }
        }
        return "";
    }
     */
}

/*
class Blank {
    int r, c, times;

    Blank(int r, int c, int times) {
        this.r = r;
        this.c = c;
        this.times = times;
    }
}
 */