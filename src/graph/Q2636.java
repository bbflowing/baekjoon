package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2636 {
    public static void main (String args[]) {
        int temp = 1<<6;
        System.out.println(Integer.toBinaryString(temp));
        System.out.println(0<<6);
        for (int i=0; i<1<<5; ++i) {
            if (Integer.bitCount(i) == 2) {
                System.out.println(i);
            }

        }

    }
}