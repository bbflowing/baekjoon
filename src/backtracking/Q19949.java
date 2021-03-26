package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q19949 {
    /*
    public static int answers [];
    public static int answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        answers = new int [10];
        for (int i=0; i<10; ++i) {
            answers[i] = Integer.parseInt(st.nextToken());
        }
        int result [] = new int [10];
        answer = 0;
        solve(0, 0, result);
        System.out.println(answer);
    }

    public static void solve (int index, int score, int [] result) {
        if (index >= 6) {
            if (index - score > 5) {
                return;
            }
        }

        if (index == 10) {
            if (score >= 5) {
                ++answer;
            }
            return;
        }

        if (index <= 1) {
            for (int i = 1; i <= 5; ++i) {
                result[index] = i;
                if (result[index] == answers[index]) {
                    solve(index+1, score+1, result);
                } else {
                    solve(index + 1, score, result);
                }
            }
        } else {
            for (int i = 1; i <= 5; ++i) {
                if (result[index-2] != result[index-1] || result[index-1] != i) {
                    result[index] = i;
                    if (result[index] == answers[index]) {
                        solve(index + 1, score + 1, result);
                    } else {
                        solve(index+1, score, result);
                    }
                }
            }
        }
    }
     */
}
