package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2947 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input [] = new int [5];

        for (int i=0; i<5; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            input = solve(0, input);
            input = solve(1, input);
            input = solve(2, input);
            input = solve(3, input);

            int flag = 0;
            for (int i=0; i<4; ++i) {
                if (input[i]>input[i+1]) {
                    break;
                } else {
                    if (i==3) {
                        flag = 1;
                    }
                }
            }
            if (flag == 1) {
                break;
            }
        }
    }
    public static void print(int input []) {
        String line = "";
        for (int i=0; i<5; ++i) {
            line += input[i]+" ";
        }
        System.out.println(line);
    }

    public static int [] solve(int i, int input []) {
        int temp = 0;
        if (input[i+1] < input[i]) {
            temp = input[i+1]; input[i+1] = input[i]; input[i] = temp;
            print(input);
        }
        return input;
    }
}
