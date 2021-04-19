package graph;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2580 {
    /*
    public static int sudoku[][];
    public static BufferedWriter bw;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sudoku = new int[9][9];
        StringTokenizer st;
        for (int i=0; i<9; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<9; ++j) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0, 0);
    }

    public static boolean solve (int x, int y) throws IOException {
        if (x == 9) {
            for (int i=0; i<9; ++i) {
                StringBuilder sb = new StringBuilder();
                for (int j=0; j<9; ++j) {
                    sb.append(sudoku[i][j]+" ");
                }
                bw.append(sb);
                bw.newLine();
            }
            bw.flush();
            return true;
        }
        if (y == 9) {
            return solve(x+1, 0);
        }
        if (sudoku[x][y] != 0) {
            return solve(x, y+1);
        }
        for (int number=1; number<=9; ++number) {
            if (check(x, y, number)) {
                sudoku[x][y] = number;
                if (solve(x, y+1)) {
                    return true;
                } else {
                    sudoku[x][y] = 0;
                }
            }
        }
        return false;
    }

    public static boolean check (int x, int y, int number) {
        for (int i=0; i<9; ++i) {
            if (sudoku[x][i] == number) return false;
            if (sudoku[i][y] == number) return false;
        }
        int startX = x/3*3;
        int startY = y/3*3;

        for (int i=startX; i<startX+3; ++i) {
            for (int j=startY; j<startY+3; ++j) {
                if (sudoku[i][j] == number) return false;
            }
        }
        return true;
    }
     */
}