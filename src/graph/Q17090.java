package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17090 {
    /*
    public static int R, C;
    public static char[][] maze;
    public static int[][] escape;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char[R][C];
        escape = new int[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                maze[r][c] = line.charAt(c);
                escape[r][c] = -1;
            }
        }
        int answer = 0;
        for (int r=0; r<R; ++r) {
            for (int c=0; c<C; ++c) {
                if (escape[r][c] == -1) {
                    answer += solve(r, c);
                } else if (escape[r][c] == 1) {
                    ++answer;
                }
            }
        }
        System.out.println(answer);
    }

    public static int solve (int r, int c) {
        if (r<0 || R<=r || c<0 || C<=c) {
            return 1;
        }
        if (escape[r][c] != -1) {
            return escape[r][c];
        }
        escape[r][c] = 0;
        int nr = r;
        int nc = c;
        if (maze[r][c] == 'U') {
            --nr;
        } else if (maze[r][c] == 'R') {
            ++nc;
        } else if (maze[r][c] == 'D') {
            ++nr;
        } else {
            --nc;
        }
        escape[r][c] = solve(nr, nc);
        return escape[r][c];
    }
     */
}