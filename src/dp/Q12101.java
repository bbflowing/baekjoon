package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q12101 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<String> [] list = new ArrayList[N+3];
        for (int i=0; i<N+3; ++i) {
            list[i] = new ArrayList<>();
        }
        list[1].add("1");
        list[2].add("1+1");
        list[2].add("2");
        list[3].add("1+1+1");
        list[3].add("1+2");
        list[3].add("2+1");
        list[3].add("3");
        if (N <= 3) {
            if (K > list[N].size()) {
                System.out.println(-1);
            } else {
                System.out.println(list[N].get(K-1));
            }
            System.exit(0);
        }
        for (int i=4; i<=N; ++i) {
            for (int j=0; j<list[i-1].size(); ++j) {
                list[i].add("1+"+list[i-1].get(j));
            }
            for (int j=0; j<list[i-2].size(); ++j) {
                list[i].add("2+"+list[i-2].get(j));
            }
            for (int j=0; j<list[i-3].size(); ++j) {
                list[i].add("3+"+list[i-3].get(j));
            }
        }
        if (K > list[N].size()) {
            System.out.println(-1);
        } else {
            System.out.println(list[N].get(K-1));
        }
    }
     */
}
