package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14888 {
    /*
    public static int operations [];
    public static int input [];
    public static int N, max, min;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        input = new int [N];
        for (int i=0; i<N; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        operations = new int [4];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<4; ++i) {
            operations[i] = Integer.parseInt(st.nextToken());
        }
        max = -10_0000_0001;
        min = 10_0000_0001;
        solve(1, input[0]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void solve(int index, int sum) {
        if (index == N) {
            if (max < sum) {
                max = sum;
            }
            if (sum < min) {
                min = sum;
            }
            return;
        }

        for (int i=0; i<4; ++i) {
            int before = sum;
            if (operations[i] > 0) {
                if (i == 0) {
                    sum += input[index];
                } else if (i == 1) {
                    sum -= input[index];
                } else if (i == 2) {
                    sum *= input[index];
                } else if (i == 3) {
                    sum /= input[index];
                }
                operations[i] -= 1;
                solve(index+1, sum);
                sum = before;
                operations[i] += 1;
            }
        }
    }
     */
}
