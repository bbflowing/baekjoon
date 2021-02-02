package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1966 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int a=0; a<T; ++a) {
            Queue<Pair> input = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int check [] = new int [10];
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<N; ++i) {
                int value = Integer.parseInt(st.nextToken());
                input.add(new Pair(i, value));
                ++check[value];
            }
            int counter = 0;
            while (true) {
                Pair current = input.poll();
                int currentV = current.value;
                int flag = 0;
                if (current.index == M) {
                    for (int i=currentV+1; i<10; ++i) {
                        if (check[i] != 0) {
                            input.add(current);
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        ++counter;
                        System.out.println(counter);
                        break;
                    }
                } else {
                    for (int i=currentV+1; i<10; ++i) {
                        if (check[i] != 0) {
                            input.add(current);
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        --check[currentV];
                        ++counter;
                    }
                }
            }
        }
    }
    */
}

/*
class Pair {
    int index;
    int value;

    Pair (int index, int value) {
        this.index = index;
        this.value = value;
    }
}
 */
