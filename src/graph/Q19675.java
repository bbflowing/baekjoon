package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q19675 {
    /*
    public static int grid [][];
    public static int answer;
    public static void main (String args[]) throws IOException {
        grid = new int [3][3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int blanks = 0;
        int startX = 0; int startY = 0;
        for (int i=0; i<3; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<3; ++j) {
                grid[i][j] = Integer.parseInt(st.nextToken());
                if (grid[i][j] == 0) {
                    if (blanks == 0) {
                        startX = i; startY = j;
                    }
                    ++blanks;
                }
            }
        }
        answer = 0;
        sudoku(startX, startY, blanks);
        System.out.println(answer);
    }

    public static void sudoku(int x, int y, int blanks) {
        if (blanks == 0) {
            ++answer;
            return;
        }
        if (x == 3) {
            return;
        }
        if (y == 3) {
            sudoku(x+1, 0, blanks);
            return;
        }
        if (grid[x][y] != 0) {
            sudoku(x, y+1, blanks);
            return;
        }
        for (int number=1; number<=9; ++number) {
            if (check(x, y, number)) {
                grid[x][y] = number;
                sudoku(x, y+1, blanks-1);
                grid[x][y] = 0;
            }
        }
    }
    public static boolean check (int x, int y, int number) {
        for (int i=0; i<3; ++i) {
            if (grid[x][i] == number) {
                return false;
            }
            if (grid[i][y] == number) {
                return false;
            }
        }
        return true;
    }
     */
}
