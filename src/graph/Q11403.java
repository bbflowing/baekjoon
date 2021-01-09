package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11403 {
    public static ArrayList<ArrayList<Integer>> list;
    public static int result [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        list = new ArrayList<>();
        result = new int [N][N];
        for (int i=0; i<N; ++i) {
            list.add(new ArrayList<>());
        }
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    list.get(i).add(j);
                }
            }
        }

        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                boolean check [] = new boolean [N];
                result[i][j] = dfs(i, j, check);
            }
        }
        for (int i=0; i<N; ++i) {
            String temp = "";
            for (int j=0; j<N; ++j) {
                temp += result[i][j] + " ";
            }
            System.out.println(temp);
        }

    }
    public static int dfs(int x, int y, boolean [] check) {
        check[x] = true;
        for (int i=0; i<list.get(x).size(); ++i) {
            if (list.get(x).get(i) == y) {
                return 1;
            } else {
                if (!check[list.get(x).get(i)]) {
                    if (dfs(list.get(x).get(i), y, check) == 1) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}

