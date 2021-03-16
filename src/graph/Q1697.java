package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1697 {

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Stack route = bfs(N, K);
        String answer = "";
        while (!route.isEmpty()) {
            answer += route.pop() +" ";
        }
        System.out.println(answer);
    }

    public static Stack bfs (int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        int previous [] = new int [100000+1];
        int time [] = new int [1000000+1];
        time [start] = 0;
        previous[start] = start;

        while (!queue.isEmpty()) {
            int p = queue.poll();
            if (p == end) {
                System.out.println(time[p]);
                Stack<Integer> stack = new Stack<>();
                stack.add(end);
                int index = previous[end];
                while (index != start) {
                    stack.add(index);
                    index = previous[index];
                }
                stack.add(start);
                return stack;
            }

            for (int i=0; i<3; ++i) {
                int next = 0;
                if (i==0) {
                    next = p-1;
                } else if (i==1) {
                    next = p+1;
                } else if (i==2) {
                    next = 2*p;
                }

                if (next > 100000 || 0 < next) {
                    continue;
                }

                if (time[next] == 0) {
                    queue.add(next);
                    time[next] = time[p]+1;
                    previous[next] = p;
                }
            }
        }
        return null;
    }
}

class Pair {
    int dst;
    int time;


    Pair (int dst, int time) {
        this.dst = dst;
        this.time = time;
    }
}
