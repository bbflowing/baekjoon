package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q2839 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        map.put(1, 9999);
        map.put(2, 9999);
        map.put(3, 1);
        map.put(4, 9999);
        map.put(5, 1);

        for (int i=6; i<=N; ++i) {
            map.put(i, Math.min(map.get(i-3), map.get(i-5)) + 1);
        }
        if (map.get(N) > 5000) {
            System.out.println(-1);
        } else {
            System.out.println(map.get(N));
        }
    }
}

