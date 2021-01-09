package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1931 {

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Time> list = new ArrayList<Time>(N);
        for (int i=0; i<N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        list.sort((t1, t2) -> {
            if (t1.end > t2.end) {
                return 1;
            } else if (t1.end == t2.end) {
                if (t1.start > t2.start) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (t1.end < t2.end) {
                return -1;
            } else {
                return 0;
            }
        });

        int end = list.get(0).end;
        int counter = 1;

        for (int i=1; i<N; ++i) {
            if (list.get(i).start >= end) {
                end = list.get(i).end;
                counter++;
            }
        }
        System.out.println(counter);

    }
}

class Time {
    int start;
    int end;

    Time (int start, int end) {
        this.start = start;
        this.end = end;
    }

}
