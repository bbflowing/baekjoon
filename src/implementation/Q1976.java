package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1976 {
    public static int parent [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        parent = new int [N+1];
        for (int i=1; i<N+1; ++i) {
            parent[i] = i;
        }
        StringTokenizer st;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    union (i+1, j+1);
                }
            }
        }
        int route [] = new int [M];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; ++i) {
            route[i] = Integer.parseInt(st.nextToken());
        }
        int root = find(route[0]);
        boolean flag = false;
        for (int i=1; i<route.length; ++i) {
            if (root != find(route[i])) {
                System.out.println("NO");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("YES");
        }

    }

    public static void union (int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            if (x < y) {
                parent[y] = x;
            } else {
                parent[x] = y;
            }
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
