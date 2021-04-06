package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1987 {
    /*
    public static int R, C, max;
    public static char board [][];
    public static boolean words [];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char [R+1][C+1];
        for (int i=1; i<=R; ++i) {
            String line = br.readLine();
            for (int j=1; j<=C; ++j) {
                board[i][j] = line.charAt(j-1);
            }
        }
        words = new boolean [26];
        words [board[1][1]-'A'] = true;
        max = -1;
        solve(1, 1, 1);
        System.out.println(max);
    }

    public static void solve (int x, int y, int distance) {
        if (max < distance) {
            max = distance;
        }

        if (distance == 26) {
            max = distance;
            return;
        }

        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 < nx && nx <= R && 0 < ny && ny <= C) {
                if (!words[board[nx][ny]-'A']) {
                    words[board[nx][ny]-'A'] = true;
                    solve(nx, ny, distance+1);
                    words[board[nx][ny]-'A'] = false;
                }
            }
        }
    }
     */
}