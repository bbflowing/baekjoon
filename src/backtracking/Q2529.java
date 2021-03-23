package backtracking;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2529 {
    /*
    public static char[] inequalities;
    public static boolean[] visited;
    public static BufferedWriter bw;
    public static int N, counter;
    public static String first, before;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        inequalities = new char[N];
        for (int i = 0; i < N; ++i) {
            inequalities[i] = st.nextToken().charAt(0);
        }
        counter = 0;
        before = "";
        first = "";
        for (int i = 0; i < 10; ++i) {
            int answer[] = new int[N + 1];
            Arrays.fill(answer, -1);
            answer[0] = i;
            visited = new boolean[10];
            visited[i] = true;
            solve(0, 1, answer);
        }
        bw.append(before);
        bw.newLine();
        bw.append(first);
        bw.flush();
    }

    public static void solve(int operation, int number, int[] answer) throws IOException {
        if (number == N + 1) {
            String temp = "";
            for (int i = 0; i < answer.length; ++i) {
                temp += answer[i];
            }
            if (counter == 0) {
               first = temp;
            }
            before = temp;
            ++counter;
            return;
        }

        char target = inequalities[operation];
        for (int i = 0; i < 10; ++i) {
            if ((target == '<' && answer[number - 1] < i) || (target == '>' && i < answer[number - 1])) {
                if (!visited[i]) {
                    visited[i] = true;
                    answer[number] = i;
                    solve(operation + 1, number + 1, answer);
                    answer[number] = -1;
                    visited[i] = false;
                }
            }
        }
    }
     */
}
