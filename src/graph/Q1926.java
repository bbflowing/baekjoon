package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 그림

public class Q1926 {
    /*
    public static int R, C, size;
    public static int[][] paper;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        paper = new int[R][C];
        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) {
                if (Integer.parseInt(st.nextToken()) == 1) paper[r][c] = -1;
            }
        }
        int counter = 0;
        size = 0;
        ArrayList<Integer> answers = new ArrayList<>();
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (paper[r][c] == -1) {
                    ++counter;
                    size = 1;
                    dfs(r, c, counter);
                    answers.add(size);
                }
            }
        }
        if (counter != 0) {
            Collections.sort(answers);
            size = answers.get(answers.size()-1);
        }
        System.out.println(counter);
        System.out.println(size);
    }

    public static void dfs(int r, int c, int counter) {
        paper[r][c] = counter;
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (paper[nr][nc] != -1) continue;
            ++size;
            dfs(nr, nc, counter);
        }
    }
     */
}