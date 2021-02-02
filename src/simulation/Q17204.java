package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q17204 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int input [] = new int [N];
        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(br.readLine());
        }
        int counter = 0;
        int flag = 0;

        int next = input[0];
        for (int i=1; i<N; ++i) {
            if (next == K) {
                System.out.println(i);
                flag = 1;
                break;
            }
            next = input[next];
        }

        if (flag == 0) {
            System.out.println(-1);
        }
    }
}
