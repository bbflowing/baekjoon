package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10813 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int input [] = new int [N+1];
        for (int i=0; i<=N; ++i) {
            input[i] = i;
        }
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());
            int temp = input[dst];
            input[dst] = input[start];
            input[start] = temp;
        }
        String answer = "";
        for (int i=1; i<=N; ++i) {
            answer += input[i]+" ";
        }
        System.out.println(answer);
    }
}
