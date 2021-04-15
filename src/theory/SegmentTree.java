package theory;

import java.util.Arrays;

public class SegmentTree {
    public static void main (String args[]) {
        int input [] = {5, 3, 7, 9, 6, 4, 1, 2, 1};
        Tree segmentTree = new Tree(input, input.length);
        System.out.println(Arrays.toString(segmentTree.result));
    }
}

class Tree {
    int [] result;

    Tree (int [] input, int N) {
        result = new int [(int) Math.pow(2, (int) Math.ceil(Math.log(N)) / Math.log(2))*2-1];
        initialize(input, 0, N-1, 1);
    }

    int initialize (int [] input, int left, int right, int index) {
        if (left == right) {
            return result[index] = input[left];
        }
        int mid = (left+right)/2;
        result[index] += initialize(input, left, mid, index*2);
        result[index] += initialize(input, mid+1, right, index*2+1);
        return result[index];
    }

}
