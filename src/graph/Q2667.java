package graph;

// 단지번호 붙이기

import java.io.*;
import java.util.*;

public class Q2667 {
    /*
    public static int N, size;
    public static char[][] map;
    public static int[][] check;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        for (int row=0; row<N; ++row) {
            String temp = br.readLine();
            for (int col=0; col<N; ++col) map[row][col] = temp.charAt(col);
        }
        int counter = 0;
        check = new int[N][N];
        ArrayList<Integer> answer = new ArrayList<>();
        for (int row=0; row<N; ++row) {
            for (int col=0; col<N; ++col) {
                if (map[row][col] == '1' && check[row][col] == 0) {
                    ++counter;
                    size = 1;
                    check[row][col] = counter;
                    dfs(row, col, counter);
                    answer.add(size);
                }
            }
        }
        Collections.sort(answer);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(String.valueOf(answer.size()));
        bw.newLine();
        for (int i=0; i<answer.size(); ++i) {
            bw.append(String.valueOf(answer.get(i)));
            bw.newLine();
        }
        bw.flush();
    }

    public static void dfs(int r, int c, int counter) {
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
            if (map[nr][nc] == '0' || check[nr][nc] != 0) continue;
            check[nr][nc] = counter;
            ++size;
            dfs(nr, nc, counter);
        }
    }
     */
}

