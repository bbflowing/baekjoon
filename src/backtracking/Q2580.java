package backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class Q2580 {
    /*
    public static int puzzle [][];
    public static BufferedWriter bw;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        puzzle = new int [9][9];
        for (int i=0; i<9; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<9; ++j) {
                puzzle[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0, 0);
    }

    public static void solve (int x, int y) throws IOException {
        if (y == 9) {
            solve(x+1, 0);
            return;
        }

        if (x == 9) {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i=0; i<9; ++i) {
                for (int j=0; j<9; ++j) {
                    bw.append(puzzle[i][j] + " ");
                }
                bw.newLine();
            }
            bw.flush();
            System.exit(0);
        }

        if (puzzle[x][y] == 0) {
            for (int i=1; i<=9; ++i) {
                if (isPossible(x, y, i)) {
                    puzzle[x][y] = i;
                    solve(x, y+1);
                }
            }
            puzzle[x][y] = 0;
            return;
        }
        solve(x, y+1);
    }

    public static boolean isPossible(int x, int y, int value) {
        for (int i=0; i<9; ++i) {
            if (puzzle[x][i] == value) {
                return false;
            }
            if (puzzle[i][y] == value) {
                return false;
            }
        }
        int rowStart = (x/3)*3;
        int colStart = (y/3)*3;
        for (int i=rowStart; i<rowStart+3; ++i) {
            for (int j=colStart; j<colStart+3; ++j) {
                if (puzzle[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
     */
}



