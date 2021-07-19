package graph;

// 알파벳

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1987 {
    /*
    public static int R, C, answer;
    public static char[][] board;
    public static boolean[] visited;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        visited = new boolean[26];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) board[r][c] = line.charAt(c);
        }
        answer = 1;
        visited[board[0][0]-'A'] = true;
        dfs(0, 0, 1);
        System.out.println(answer);
    }

    public static void dfs (int r, int c, int distance) {
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (visited[board[nr][nc]-'A']) continue;
            visited[board[nr][nc]-'A'] = true;
            dfs(nr, nc, distance+1);
            visited[board[nr][nc]-'A'] = false;
        }
        answer = Math.max(distance, answer);
    }
     */
}
