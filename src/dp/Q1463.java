package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q1463 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 1);
        map.put(3, 1);

        for (int i=4; i<=X; ++i) {
            if (i%3 == 0 && i%2 != 0) {
                map.put(i, Math.min(map.get(i/3), map.get(i-1))+1);
            } else if (i%3 != 0 && i%2 == 0) {
                map.put(i, Math.min(map.get(i/2), map.get(i-1))+1);
            } else if (i%3 == 0 && i%2 == 0) {
                int temp = Math.min(map.get(i/2), map.get(i/3));
                map.put(i, Math.min(temp, map.get(i-1))+1);
            } else {
                map.put(i, map.get(i-1)+1);
            }
        }

        System.out.println(map.get(X));
    }
}
