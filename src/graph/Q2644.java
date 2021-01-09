package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2644 {
    public static ArrayList<ArrayList<Integer>> family;
    public static int counter;
    public static boolean check [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        family = new ArrayList<>(N+1);
        for (int i=0; i<=N; ++i) {
            family.add(new ArrayList<>());
        }
        int M = Integer.parseInt(br.readLine());

        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            family.get(parent).add(child);
            family.get(child).add(parent);
        }
        check = new boolean [N+1];
        counter = 0;
        boolean result = dfs(x, y, N);
        if (result) {
            System.out.println(counter);
        } else {
            System.out.println(-1);
        }
    }

    public static boolean dfs (int parent, int child, int N) {
        check[parent] = true;
        counter++;

        if (parent == child) {
            counter--;
            return true;
        } else {
            for (int i=0; i<family.get(parent).size(); ++i) {
                if (!check[family.get(parent).get(i)]) {
                    if (dfs(family.get(parent).get(i), child, N)) {
                        return true;
                    } else {
                        counter--;
                    }
                }
            }
        }
        return false;
    }
}
