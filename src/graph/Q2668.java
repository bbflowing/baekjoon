package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2668 {
    /*
    public static int input [];
    public static boolean visited [];
    public static int check;
    public static ArrayList<Integer> list;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new int [N+1];
        visited = new boolean [N+1];
        list = new ArrayList<Integer>();

        for (int i=1; i<=N; ++i) {
            input[i] = Integer.parseInt(br.readLine());
        }
        for (int i=1; i<=N; ++i) {
            visited[i] = true;
            check = i;
            dfs(i);
            visited[i] = false;
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i : list) {
            System.out.println(i);
        }

    }

    public static void dfs (int start) {
        if (!visited[input[start]]) {
            visited[input[start]] = true;
            dfs(input[start]);
            visited[input[start]] = false;
        }

        if (input[start] == check) {
            list.add(check);
        }
    }
     */
}
