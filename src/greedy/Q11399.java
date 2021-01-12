package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q11399 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> input = new ArrayList<>(N);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; ++i) {
            input.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(input);
        int answer = 0;
        for (int i=0; i<N; ++i) {
            answer += input.get(i)*(N-i);
        }
        System.out.println(answer);
    }
}
