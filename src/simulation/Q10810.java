package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10810 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int baskets [] = new int [N];
        Queue<Pair> balls = new LinkedList<>();

        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());
            balls.add(new Pair (start-1, end-1, ball));
        }
        for (int i=0; i<M; ++i) {
            Pair pair = balls.poll();
            for (int j=pair.start; j<=pair.end; ++j) {
                baskets[j] = pair.ball;
            }
        }

        String answer = "";
        for (int i=0; i<baskets.length; ++i) {
            answer += baskets[i]+" ";
        }
        System.out.println(answer);
    }

     */
}
/*
class Pair {
    int start;
    int end;
    int ball;

    Pair (int start, int end, int ball) {
        this.start = start;
        this.end = end;
        this.ball = ball;
    }
}

 */