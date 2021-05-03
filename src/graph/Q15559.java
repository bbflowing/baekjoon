package graph;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15559 {
    /*
    public static int R, C, answer;
    public static char[][] map;
    public static int[][] groups;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        groups = new int[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c);
            }
        }
        answer = 0;
        int counter = 0;
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (groups[r][c] == 0) {
                    ++counter;
                    groups[r][c] = counter;
                    solve (r, c, counter);
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        bw.append(sb);
        bw.flush();
    }

    public static void solve (int r, int c, int counter) {
        int nr = r; int nc = c;
        if (map[r][c] == 'S') ++nr;
        else if (map[r][c] == 'N') --nr;
        else if (map[r][c] == 'W') --nc;
        else if (map[r][c] == 'E') ++nc;

        if (groups[nr][nc] == counter) {
            ++answer;
        } else if (groups[nr][nc] == 0) {
            groups[nr][nc] = counter;
            solve(nr, nc, counter);
        }
    }
     */
}