package graph;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2580 {
    public static int board [][];
    public static BufferedWriter bw;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int startX = 0; int startY = 0;
        boolean flag = false;
        int blanks = 0;
        board = new int [9][9];
        for (int i=0; i<9; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<9; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 0) {
                    ++blanks;
                    if (!flag) {
                        flag = true;
                        startX = i; startY= j;
                    }
                }
            }
        }
        solve(startX, startY, blanks);
    }

    public static void solve (int x, int y, int blanks) throws IOException {
        if (blanks == 0) {
            for (int i=0; i<9; ++i) {
                String line = "";
                for (int j=0; j<9; ++j) {
                    line += board[i][j] + " ";
                }
                bw.append(line);
                bw.newLine();
            }
            bw.flush();
            System.exit(0);
        }

        if (y == 9) {
            solve(x+1, 0, blanks);
            return;
        }
        if (x == 9) {
            return;
        }

        if (board[x][y] != 0) {
            solve(x, y+1, blanks);
            return;
        }

        for (int i=1; i<=9; ++i) {
            if (check(x, y, i)) {
                board[x][y] = i;
                solve(x, y+1, blanks-1);
                board[x][y] = 0;
            }
        }
    }

    public static boolean check (int x, int y, int number) {
        for (int i=0; i<9; ++i) {
            if (board[x][i] == number) {
                return false;
            }
            if (board[i][y] == number) {
                return false;
            }
        }
        int startX = x/3*3;
        int startY = y/3*3;
        for (int i=startX; i<startX+3; ++i) {
            for (int j=startY; j<startY+3; ++j) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }
        return true;
    }
}
