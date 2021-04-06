package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1068 {
    /*
    public static int parent [];
    public static int N, answer;
    public static ArrayList<ArrayList<Integer>> children;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        parent = new int [N];
        children = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            children.add(new ArrayList<>());
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int root = 0;
        for (int i=0; i<N; ++i) {
            int node = Integer.parseInt(st.nextToken());
            parent[i] = node;
            if (node != -1) {
                children.get(node).add(i);
            } else {
                root = i;
            }
        }
        int deleted = Integer.parseInt(br.readLine());
        if (deleted == root) {
            System.out.println(0);
        } else {
            for (int i = 0; i < children.get(parent[deleted]).size(); ++i) {
                if (children.get(parent[deleted]).get(i) == deleted) {
                    children.get(parent[deleted]).remove(i);
                }
            }
            parent[deleted] = -2;
            delete(deleted);
            answer = 0;
            getLeaves(root);
            System.out.println(answer);
        }
    }

    public static void getLeaves(int root) {
        if (children.get(root).size() == 0) {
            ++answer;
            return;
        }
        for (int i=0; i<children.get(root).size(); ++i) {
            getLeaves(children.get(root).get(i));
        }
    }

    public static void delete (int deleted) {
        if (children.get(deleted).size() == 0) {
            return;
        }
        for (int i=0; i<children.get(deleted).size(); ++i) {
            int child = children.get(deleted).get(i);
            parent[child] = -2;
            delete(child);
        }
    }
     */
}
