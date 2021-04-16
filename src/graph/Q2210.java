package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q2210 {
    /*
    public static int board[][];
    public static Set<String> visited;
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        board = new int[5][5];
        for (int i=0; i<5; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited = new HashSet<>();
        for (int i=0; i<5; ++i) {
            for (int j=0; j<5; ++j) {
                solve(i, j, 1, String.valueOf(board[i][j]));
            }
        }
        System.out.println(visited.size());
    }

    public static void solve (int x, int y, int depth, String value) {
        if (depth == 6) {
            if (!visited.contains(value)) {
                visited.add(value);
            }
            return;
        }

        for (int dir=0; dir<4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || 5<=nx || ny<0 || 5<=ny) {
                continue;
            }
            String nvalue = value + board[nx][ny];
            solve(nx, ny, depth+1, nvalue);
        }
    }
     */
}
