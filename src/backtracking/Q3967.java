package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3967 {
    public static char puzzle [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        puzzle = new char [5][9];
        for (int i=0; i<5; ++i) {
            String line = br.readLine();
            for (int j=0; j<9; ++j) {
                puzzle[i][j] = line.charAt(j);
            }
        }
    }
}
