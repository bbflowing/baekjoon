package theory;

import java.util.Arrays;

public class Permutation {
    public static void main (String args[]) {
        int input [] = {1,2,3,4};
        boolean visited [] = new boolean [input.length];
        int result [] = new int [input.length];
        permutation(input, input.length, 0, visited, result);
    }

    public static void permutation (int input [], int N, int index, boolean visited [], int [] result) {
        if (index == N) {
            System.out.println(Arrays.toString(result));
            return;
        }

        for (int i=0; i<input.length; ++i) {
            if (!visited[i]) {
                result[index] = input[i];
                visited[i] = true;
                permutation(input, N, index+1, visited, result);
                visited[i] = false;
            }
        }


    }
}
