package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9663 {
    /*
    public static int board [];
    public static int N;
    public static int answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int [N]; // index: col#, value: row#
        answer = 0;
        solve(0);
        System.out.println(answer);
    }

    public static void solve (int index) {
        if (index == N) {
            ++answer;
            return;
        }

        for (int i=0; i<N; ++i) {
            board[index] = i;
            if (isPossible(index)) {
                solve(index+1);
            }
        }
    }

    public static boolean isPossible(int index) {
        for (int i=0; i<index; ++i) {
            if (board[index] == board[i]) {
                return false;
            }
            if (Math.abs(index-i) == Math.abs(board[index] - board[i])) {
                return false;
            }
        }
        return true;
    }
     */
}
