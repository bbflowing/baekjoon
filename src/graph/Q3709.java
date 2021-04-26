package graph;

import java.io.*;
import java.util.StringTokenizer;

public class Q3709 {
    /*
    public static int N;
    public static int[][] board;
    public static boolean[][][] visited;
    public static BufferedWriter bw;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            board = new int[N+2][N+2];
            int R = Integer.parseInt(st.nextToken());
            int r = 0;
            int c = 0;
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
            if (r == 0) { // south
                direction = 1;
            } else if (r == N+1) { // north
                direction = 0;
            } else if (c == 0) { //east
                direction = 3;
            } else { // west
                direction = 2;
            }
            visited = new boolean[4][N+2][N+2];
            r += dr[direction]; c += dc[direction];
            solve(r, c, direction);
        }
        bw.flush();
    }

    public static void solve (int r, int c, int direction) throws IOException {
        if (r==0 || r==N+1 || c==0 || c==N+1) {
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
        if (board[r][c] == 1) {
            direction = getDirection(direction);
        }
        int nr = r + dr[direction];
        int nc = c + dc[direction];
        solve(nr, nc, direction);
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
