package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Q1912 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = -1_000_000_000;

        ArrayList<Integer> input = new ArrayList<>(N);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<N; ++i) {
            input.add(Integer.parseInt(br.readLine()));
        }


    }
}
