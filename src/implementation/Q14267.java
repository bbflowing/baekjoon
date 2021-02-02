package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q14267 {
    public static ArrayList<ArrayList<Integer>> input;
    public static int answer [];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new ArrayList<>();
        for (int i=0; i<=N; ++i) {
            input.add(new ArrayList<>());
        }
        st = new StringTokenizer(br.readLine());
        answer = new int [N+1];
        for (int i=1; i<=N; ++i) {
            int db = Integer.parseInt(st.nextToken());
            if (db != -1) {
                input.get(db).add(i);
            }
        }
        /*
        for (int i=0; i<N+1; ++i) {
            String temp = i+": ";
            for (int j=0; j<input.get(i).size(); ++j) {
                temp += input.get(i).get(j) + " ";
            }
            System.out.println(temp);
        }
         */
        for (int i=0; i<M; ++i) {
            st = new StringTokenizer(br.readLine());
            int employee = Integer.parseInt(st.nextToken());
            int compliment = Integer.parseInt(st.nextToken());
            answer [employee] += compliment;
            dfs (employee, compliment);
        }
        String temp = "";
        for (int i=1; i<answer.length; ++i) {
            temp += answer[i]+" ";
        }
        System.out.println(temp);
    }
    public static void dfs (int employee, int compliment) {
        for (int i=0; i<input.get(employee).size(); ++i) {
            int next = input.get(employee).get(i);
            answer [next] += compliment;
            //System.out.println(next+", "+answer[next]);
            dfs(next, compliment);
        }
    }
}

/*
 1: 2
 2: 3
 3: 4
 4: 5
 5:
 */