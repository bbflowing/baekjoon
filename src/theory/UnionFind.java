package theory;

import java.io.IOException;

public class UnionFind {
    public static int [] parent = new int [1000001];
    public static void main (String args[]) throws IOException {
        for (int i=1; i<=8; ++i) {
            parent[i] = i;
        }
        union(1, 2);
        union(2, 3);
        System.out.println("Are 1 and 3 connected?");
        System.out.println(isSameParent(1, 3));
    }

    public static void union (int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) { //not the same parent
            if (x < y) { //usually the parent is the smaller one
                parent[y] = x;
            } else {
                parent[x] = y;
            }
        }
    }

    public static boolean isSameParent (int x, int y) {
        x = find(x);
        y = find(y);

        if (x == y) {
            return true;
        } else {
            return false;
        }
    }

    public static int find (int x) {
        if (x == parent[x]) {
            return x;
        } else {
            return parent[x] = find(parent[x]);
        }
    }
}
