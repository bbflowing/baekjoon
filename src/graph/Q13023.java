package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q13023 {
    /*
    public static ArrayList<ArrayList<Integer>> friends;
    public static boolean visited [];
    public static int N;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        friends = new ArrayList<>(N);
        for (int i=0; i<N; ++i) {
            friends.add(new ArrayList<>());
        }
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            friends.get(A).add(B);
            friends.get(B).add(A);
        }
        for (int i=0; i<N; ++i) {
            visited = new boolean [N];
            visited[i] = true;
            solve(i, 1);
        }
        System.out.println(0);
    }

    public static void solve (int start, int depth) {
        if (depth == 5) {
            System.out.println(1);
            System.exit(0);
        }
        ArrayList<Integer> target = friends.get(start);
        for (int i=0; i<target.size(); ++i) {
            if (!visited[target.get(i)]) {
                visited[target.get(i)] = true;
                solve(target.get(i), depth+1);
                visited[target.get(i)] = false;
            }
        }
    }
     */
}
