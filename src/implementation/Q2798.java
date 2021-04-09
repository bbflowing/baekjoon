package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2798 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        int min = -1;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; ++i) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        for (int i=0; i<N-2; ++i) {
            for (int j=i; j<N-1; ++j) {
                for (int k=j; k<N; ++k) {
                    int temp = list.get(i) + list.get(j) + list.get(k);
                    if (temp == M) {
                        System.out.println(M);
                        System.exit(0);
                    } else {
                        if (Math.abs(min-M) > Math.abs(temp-M)) {
                            min = temp;
                        }
                    }

                }
            }
        }
        System.out.println(min);
    }
}
