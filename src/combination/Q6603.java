package combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6603 {
    /*
    public static String answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        answer = "";
        int counter = 0;
        while (true) {
            String line = br.readLine();
            if (line.equals("0")) {
                break;
            }
            ++counter;
            if (counter > 1) {
                answer += "\n";
            }
            StringTokenizer st = new StringTokenizer(line);
            int K = Integer.parseInt(st.nextToken());
            int input [] = new int [K];
            for (int i=0; i<K; ++i) {
                input[i] = Integer.parseInt(st.nextToken());
            }
            int result [] = new int [6];
            combination(input, K, 6, 0, 0, result);
        }
        System.out.println(answer);
    }

    public static void combination(int input [], int N, int R, int index, int start, int [] result) {
        if (index == R) {
            for (int i=0; i<R; ++i) {
                answer += result[i] +" ";
            }
            answer += "\n";
            return;
        }

        if (start == N) {
            return;
        }

        result[index] = input[start];
        combination(input, N, R, index+1, start+1, result);
        combination(input, N, R, index, start+1, result);
    }
     */
}
