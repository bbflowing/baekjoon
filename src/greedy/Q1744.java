package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Q1744 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int left = 0;
        int right = n - 1;
        ans = 0;
        // -
        for (; left < right; left += 2) {
            if (array[left] < 1 && array[left + 1] < 1) {
                ans += array[left] * array[left + 1];
            } else {
                break;
            }
        }
        // +
        for (; right > 0; right -= 2) {
            if (array[right] > 1 && array[right - 1] > 1) {
                ans += array[right] * array[right - 1];
            } else {
                break;
            }
        }

        for (; right >= left; right--) {
            ans += array[right];
        }
        System.out.println(ans);
    }
}
