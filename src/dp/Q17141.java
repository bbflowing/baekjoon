package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17141 {
    public static String answer;
    public static boolean check [];
    public static int counter;
    public static void main (String args[]) {
        answer = "";
        counter = 0;
        int input [] = {1,2,3,4}; // 2 out of 4
        combination(input, 2);
    }
    public static void combination (int [] input, int number) {
        for (int i=0; i<input.length; ++i) {
            if (counter < number && !check[i]) {
                ++counter;
                check[i] = true;
                answer += input[i]+" ";
            }
        }
    }
}