package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q17070 {
    /*
    public static int N, answer;
    public static int[][] house;
    public static boolean[][] pipes;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        house = new int[N + 1][N + 1];
        StringTokenizer st;
        for (int r = 1; r < N + 1; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 1; c < N + 1; ++c) {
                house[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        pipes = new boolean[N + 1][N + 1];
        pipes[1][1] = true;
        pipes[1][2] = true;
        answer = 0;
        solve(0, 1, 2);
        System.out.println(answer);
    }

    public static void solve(int type, int r, int c) {
        if (r == N && c == N) {
            ++answer;
            return;
        }
        if (type == 0) {
            horizontal(r, c);
            diagonal(r, c);
        } else if (type == 1) {
            vertical(r, c);
            diagonal(r, c);
        } else {
            horizontal(r, c);
            vertical(r, c);
            diagonal(r, c);
        }
    }

    public static void horizontal(int r, int c) {
        int nr = r;
        int nc = c+1;
        if (nc <= N) {
            if (!pipes[nr][nc] && house[nr][nc] == 0) {
                pipes[nr][nc] = true;
                solve(0, nr, nc);
                pipes[nr][nc] = false;
            }
        }
    }

    public static void vertical (int r, int c) {
        int nr = r+1;
        int nc = c;
        if (nr <= N) {
            if (!pipes[nr][nc] && house[nr][nc] == 0) {
                pipes[nr][nc] = true;
                solve(1, nr, nc);
                pipes[nr][nc] = false;
            }
        }
    }

    public static void diagonal (int r, int c) {
        int nr = r+1;
        int nc = c+1;
        if (nr <= N && nc <= N) {
            if (!pipes[nr][nc] && !pipes[r][nc] && !pipes[nr][c] &&
                    house[nr][nc] == 0 && house[r][nc] == 0 && house[nr][c] == 0) {
                pipes[nr][nc] = true;
                pipes[r][nc] = true;
                pipes[nr][c] = true;
                solve(2, nr, nc);
                pipes[nr][nc] = false;
                pipes[r][nc] = false;
                pipes[nr][c] = false;
            }
        }
    }
     */
}
