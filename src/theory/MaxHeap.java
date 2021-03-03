package theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> o2-o1));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; ++i) {
            int target = Integer.parseInt(br.readLine());
            if (target != 0) {
                queue.add(target);
            } else if (target == 0) {
                if (queue.size() == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }
            }
        }
    }
}
