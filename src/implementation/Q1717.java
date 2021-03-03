package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1717 {
    public static int parent [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        parent = new int [N+1];
        for (int i=0; i<N+1; ++i) {
            parent[i] = i;
        }
        //String answer = "";
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int operation = Integer.parseInt(st.nextToken()); // 0: union, 1: isSameParent
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (operation == 0) {
                union(A, B);
            } else if (operation == 1) {
                boolean result = isSameParent(A, B);
                if (result) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static boolean isSameParent(int A, int B) {
        A = find(A);
        B = find(B);
        if (A == B) {
            return true;
        } else {
            return false;
        }
    }

    public static int find (int x) {
        if (parent[x] == x) {
            return x;
        } else {
            return parent[x] = find(parent[x]);
        }
    }

    public static void union (int A, int B) {
        A = find(A);
        B = find(B);

        if (A != B) {
            if (A > B) {
                parent[A] = B;
            } else {
                parent[B] = A;
            }
        }
    }
}
