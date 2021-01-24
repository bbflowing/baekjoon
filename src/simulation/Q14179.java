package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q14179 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int input [][] = new int [N][M];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; ++i) {
            int level = Integer.parseInt(st.nextToken());
            for (int j=0; j<level; ++j) {
                input[N-1-j][i] = 1;
            }
        }
        int answer = 0;
        for (int i=N-1; 0<=i; --i) {
            int previous = input[i][0];
            int counter = 0;
            boolean flag = false;
            for (int j=1; j<M; ++j) {
                if (previous == 1 && input[i][j] == 0) {
                    ++counter;
                    flag = true;
                } else if (previous == 0 && input[i][j] == 1 && flag) {
                    answer += counter;
                    counter = 0;
                    flag = false;
                } else if (input[i][j] == 0 && flag) {
                    ++counter;
                }
                previous = input[i][j];
            }
        }
        System.out.println(answer);
    }
}
