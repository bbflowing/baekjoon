package backtracking;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1759 {
    public static BufferedWriter bw;
    public static char input [];
    public static boolean visited [];
    public static int L, C;
    public static void main (String args[]) throws IOException {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        input = new char [C];
        visited = new boolean [C];
        for (int i=0; i<C; ++i) {
            input[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(input);
        char result [] = new char [L];
        solve(0, 0, result);
        bw.flush();
    }

    public static void solve (int index, int start, char [] result) throws IOException {
        if (index == L) {
            String answer = "";
            int vowels = 0; int consonants = 0;
            for (int i=0; i<L; ++i) {
                answer += result[i];
                if (result[i] == 'a' || result[i] == 'e' || result[i] == 'i' || result[i] == 'o' || result[i] == 'u') {
                    ++vowels;
                } else {
                    ++consonants;
                }
            }
            if (vowels >= 1 && consonants >= 2) {
                bw.append(answer);
                bw.newLine();
            }
            return;
        }
        if (start == C) {
            return;
        }
        result[index] = input[start];
        solve(index+1, start+1, result);
        solve(index, start+1, result);
    }
}
