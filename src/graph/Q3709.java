package graph;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q3709 {
    /*
    public static int N;
    public static int[][] board;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static boolean[][][] visited;
    public static BufferedWriter bw;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            board = new int[N+1][N+1];
            int R = Integer.parseInt(st.nextToken());
            int r = 0; int c = 0;
            for (int i=0; i<R; ++i) {
                st = new StringTokenizer(br.readLine());
                r = Integer.parseInt(st.nextToken());
                c = Integer.parseInt(st.nextToken());
                board[r][c] = 1;
            }
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            int direction = 0;
            if (r == 0) {
                direction = 1;
            } else if (c == 0) {
                direction = 3;
            } else if (c == N+1) {
                direction = 2;
            }
            visited = new boolean[4][N+1][N+1];
            r += dr[direction];
            c += dc[direction];
            solve(r, c, direction);
        }
        bw.flush();
    }

    public static void solve (int r, int c, int direction) throws IOException {
        if (r==0 || N+1==r || c==0 || N+1==c) {
            bw.append(r+" "+c);
            bw.newLine();
            return;
        }

        if (visited[direction][r][c]) {
            bw.append("0 0");
            bw.newLine();
            return;
        }
        visited[direction][r][c] = true;
        int ndirection = direction;
        if (board[r][c] == 1) {
            ndirection = getDirection(direction);
        }
        int nr = r + dr[ndirection];
        int nc = c + dc[ndirection];
        solve(nr, nc, ndirection);
        visited[direction][r][c] = false;
    }

    public static int getDirection (int direction) {
        if (direction == 0) {
            return 3;
        } else if (direction == 1) {
            return 2;
        } else if (direction == 2) {
            return 0;
        } else {
            return 1;
        }
    }
     */
}