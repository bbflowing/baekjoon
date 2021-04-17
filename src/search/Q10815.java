package search;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815 {
    /*
    public static int input [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; ++i) {
            if(search(Integer.parseInt(st.nextToken()))) {
                bw.append("1 ");
            } else {
                bw.append("0 ");
            }
        }
        bw.flush();
    }

    public static boolean search (int target) {
        int start = 0;
        int end = input.length-1;
        int mid = 0;

        while (start <= end) {
            mid = (start+end)/2;
            if (target == input[mid]) {
                return true;
            } else {
                if (target < input[mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return false;
    }
     */
}
